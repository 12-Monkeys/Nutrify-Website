package controllers;

import models.*;
import play.data.Form;
import play.mvc.*;
import java.util.*;

import views.html.*;

public class Products extends Controller {

    public static Result list() {
        Iterable<Product> products = Product.findAll();
        if (!products.iterator().hasNext()) {
        	flash("warning", "No products in the DB!");
        }
        return ok(list.render(products));
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