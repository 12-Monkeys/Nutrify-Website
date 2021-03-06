package models;

import java.util.*;

import org.bson.types.*;
import org.codehaus.jackson.annotate.*;
import org.jongo.*;
import uk.co.panaxiom.playjongo.*;

public class Product {
	
	public static MongoCollection products() {
		return PlayJongo.getCollection("products");
	}
	
	@JsonProperty("_id")
    public ObjectId id;
	
    public Long ean;
    public String name;
    public String description;
    public Set<Update> updates;
    public Set<Diet> diets;
    
    public Product() {}

    public Product(Long ean, String name, String description) {
      this.ean = ean;
      this.name = name;
      this.description = description;
      this.updates = new HashSet<Update>();
      this.diets = new HashSet<Diet>();
    }
    
    public Product(Long ean, String name, String description, Set<Update> updates, Set<Diet> diets) {
        this.ean = ean;
        this.name = name;
        this.description = description;
        this.updates = updates;
        this.diets = diets;
    }

    public String toString() {
      return String.format("%s - %s", ean, name);
    }

    /*private static Set<Product> products;
    static {
        products = new HashSet<Product>();
        products.add(new Product(1111111111111L, "Paperclips 1", "Paperclips description 1"));
        products.add(new Product(2222222222222L, "Paperclips 2", "Paperclips description 2"));
        products.add(new Product(3333333333333L, "Paperclips 3", "Paperclips description 3"));
        products.add(new Product(4444444444444L, "Paperclips 4", "Paperclips description 4"));
        products.add(new Product(5555555555555L, "Paperclips 5", "Paperclips description 5"));
    }

    public static Set<Product> findAll() {
        return new HashSet<Product>(products);
    }

    public static Product findByEan(Long ean) {
        for (Product candidate : products) {
            if (candidate.ean.equals(ean)) {
                return candidate;
            }
        }
        return null;
    }

    public static Set<Product> findByName(String term) {
        final Set<Product> results = new HashSet<Product>();
        for (Product candidate : products) {
            if(candidate.name.toLowerCase().contains(term.toLowerCase())){
                results.add(candidate);
            }
        }
        return results;
    }

    public static boolean remove(Product product) {
        return products.remove(product);
    }

    public static void add(Product product) {
        products.add(product);
    }*/
    
    public void insert() {
    	products().update("{ean: #}", this.ean).upsert().with("{$set: {name: #, description: #}}",this.name,this.description);
    }
    
    public void remove() {
        products().remove(this.id);
    }
    
    public static Product findByEan(Long ean) {
        return products().findOne("{ean: #}", ean).as(Product.class);
    }
    
    public static List<Product> findByName(String name) {
    	return products().distinct("name").query("{name: #}", name).as(Product.class);
    }

    public static Iterable<Product> findAll() {
    	return products().find().as(Product.class);
    }
    
}