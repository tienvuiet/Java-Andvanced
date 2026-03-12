package session5.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    static  List<Product> products = new ArrayList<>();
    static  Scanner sc = new Scanner(System.in);
    public static void addProduct(){
        try{
            System.out.println("Nhap id: ");
            int id = sc.nextInt();
            sc.nextLine();
            boolean flag = products.stream().anyMatch(p -> p.getId() == id);
            if(flag){
               throw new InvalidProductException("Id da ton tai");
            }
            System.out.println("Nhap ten: ");
            String name = sc.nextLine();
            System.out.println("Nhap gia san pham: ");
            double price = sc.nextDouble();
            System.out.println("So luong ton kho: ");
            int quantity = sc.nextInt();
            sc.nextLine();
            System.out.println("Ten danh muc: ");
            String category = sc.nextLine();
            Product p = new Product(id, name, price, quantity, category);
            products.add(p);
            System.out.println("Them san pham thanh cong");
        }catch (InvalidProductException e){
            System.out.println(e.getMessage());
        }
    }
    public  static  void displayProducts(){
        if(products.isEmpty()){
            System.out.println("Danh sach trong");
            return;
        }
        products.forEach(System.out::println);
    }
    public  static void updateQuantity(){
        try {
            System.out.println("Nhap id san pham: ");
            int id = sc.nextInt();
            Optional<Product> product = products.stream()
                    .filter(p-> p.getId() == id)
                    .findFirst();
            if(!product.isPresent()){
                throw  new InvalidProductException("Khong tim thay san pham");
            }
            System.out.println("So luong san pham moi: ");
            int quantity = sc.nextInt();
            product.get().setQuantity(quantity);
            System.out.println("Cap nhat thanh cong");
        }catch (InvalidProductException e){
            System.out.println(e.getMessage());
        }
    }
    public  static  void deleteOutOfStock(){
        products.removeIf(p -> p.getQuantity() == 0);
        System.out.println("Da xoa san pham het hang");
    }
    static void main(String[] args) {
        int choice ;
        do {
            System.out.println("======Product management=======");
            System.out.println("1. Them san pham");
            System.out.println("2. Hien thi danh sach san pham");
            System.out.println("3. Cap nhat so luong theo Id");
            System.out.println("4. Xoa san pham da het hang");
            System.out.println("5. Thoat chuong trinh");
            System.out.println("Lua chon cua ban: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    addProduct();
                    break;
                case 2:
                    displayProducts();
                    break;
                case 3:
                    updateQuantity();
                    break;
                case 4:
                    deleteOutOfStock();
                    break;
                case 5:
                    System.out.println("Ban da thoat chuong trinh");
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
            }
        }while (choice != 5);
    }
}
