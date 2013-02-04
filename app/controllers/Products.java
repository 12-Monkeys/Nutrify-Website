package controllers;

import models.*;
import play.data.Form;
import play.mvc.*;
import java.util.*;

import views.html.*;

public class Products extends Controller {

    public static Result list() {
        Set<Product> products = Product.findAll();
        return ok(list.render(products));
    }

    public static Result showBlank() {
    	return ok(show.render(productForm));
    }

    public static Result show(Long ean) {
      return TODO;
    }
    
    public static Result save() {
		Form<Product> boundForm = productForm.bindFromRequest();
		Product product = boundForm.get();
		Product.add(product);
		return ok(String.format("Saved product %s", product));
	}
    
    private static final Form<Product> productForm = form(Product.class);
    
}