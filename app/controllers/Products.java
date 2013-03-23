package controllers;

import models.*;
import play.libs.Json;
import play.data.Form;
import play.mvc.*;
import java.util.*;

import org.codehaus.jackson.node.ObjectNode;

import views.html.*;

public class Products extends Controller {

    public static Result list() {
        Iterable<Product> products = Product.findAll();
        if (!products.iterator().hasNext()) {
        	flash("warning", "No products in the DB!");
        }
        return ok(list.render(products));
    }
    
    @BodyParser.Of(BodyParser.Json.class)
    public static Result listJson() {
        Iterable<Product> products = Product.findAll();
        ObjectNode result = Json.newObject();
        if (!products.iterator().hasNext()) {
    		result.put("status", "KO");
    		result.put("message", "No products in the DB!");
    		result.put("result", "");
        }
        else {
        	result.put("status", "OK");
        	result.put("message", "");
        	for (Product product : products) {
        		ObjectNode productJson = Json.newObject();
        		productJson.put("ean", product.ean);
        		productJson.put("name", product.name);
        		productJson.put("description", product.description);
        		result.put("result", productJson);
        	}
        }
        return ok(result);
    }

    public static Result showBlank() {
    	return ok(show.render(productForm));
    }

    public static Result show(Long ean) {
    	final Product product = Product.findByEan(ean);
    	if (product == null) {
    		return notFound(String.format("Product %s does not exist.", ean));
    	}
    	Form<Product> filledForm = productForm.fill(product);
    	return ok(show.render(filledForm));
    }
    
    @BodyParser.Of(BodyParser.Json.class)
    public static Result showJson(Long ean) {
    	final Product product = Product.findByEan(ean);
    	ObjectNode result = Json.newObject();
    	ObjectNode productJson = Json.newObject();
    	if (product == null) {
    		result.put("status", "KO");
    		result.put("message", "Product not found");
    		result.put("result", "");
    	}
    	else {
    		result.put("status", "OK");
    		result.put("message", "");
    		productJson.put("ean", product.ean);
    		productJson.put("name", product.name);
    		productJson.put("description", product.description);
    		result.put("result", productJson);
    	}
    	return ok(result);
    }
    
    public static Result save() {
		Form<Product> boundForm = productForm.bindFromRequest();
		if(boundForm.hasErrors()) {
			flash("error", "Please correct the form below.");
			return badRequest(show.render(boundForm));
		}
		Product product = boundForm.get();
		product.insert();
		flash("success", String.format("Successfully added product %s", product));
		return redirect(routes.Products.list());
	}
    
    public static Result delete(Long ean) {
		Product.products().remove("{ean: #}", ean);
		flash("success", String.format("Successfully deleted product with ean %s", ean));
		return redirect(routes.Products.list());
    }
    
    private static final Form<Product> productForm = form(Product.class);
    
}