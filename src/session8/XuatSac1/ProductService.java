package session8.XuatSac1;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private List<Product> products = new ArrayList<>();
    public void addProduct(Product product){
        products.add(product);
        System.out.println("Da them san pham: "+ product.getName());
    }
    public Product findById(String id){
        return  products.stream()
                .filter(p-> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
    public List<Product> getAll(){
        return products;
    }
}
