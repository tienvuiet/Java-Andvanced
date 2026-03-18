package session9.Test;

import java.util.ArrayList;
import java.util.List;

public class ProductDatabase {
    private static  ProductDatabase instance;
    private List<Product> products;
    private ProductDatabase(){
        products = new ArrayList<>();
    }
    public static ProductDatabase getInstance(){
        if (instance == null){
            return instance = new ProductDatabase();
        }
       return instance = null;
    }
    public void addProduct(Product p){
        products.add(p);
    }
    public List<Product> getAll(){
        return products;
    }
    public void  removeProduct(String id){
        products.removeIf(p -> p.getId().equals(id));
    }
    public Product findById(String id){
        for (Product p : products){
            if(p.getId().equals(id)){
                return p;
            }
        }
        return null;
    }
}
