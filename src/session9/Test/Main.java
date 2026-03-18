package session9.Test;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Main {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductDatabase db = ProductDatabase.getInstance();
         while (true){
             System.out.println("-----Quan ly san pham------");
             System.out.println("1.Them moi san pham");
             System.out.println("2.Xem danh sach san pham");
             System.out.println("3.Cap nhat thong tin san pham");
             System.out.println("4.Xoa san pham");
             System.out.println("5.Thoat");
             System.out.println("Lua chon cua ban");
             int choice = sc.nextInt();
             sc.nextLine();
             switch (choice){
                 case 1:
                     System.out.print("Type (1: Physical, 2: Digital): ");
                     int type = sc.nextInt();
                     sc.nextLine();
                     System.out.print("ID: ");
                     String id = sc.nextLine();
                     System.out.print("Name: ");
                     String name = sc.nextLine();
                     System.out.print("Price: ");
                     double price = sc.nextDouble();
                     System.out.print(type == 1 ? "Weight: " : "Size: ");
                     double extra = sc.nextDouble();
                     Product p = ProductFactory.createProduct(type, id, name, price, extra);
                     db.addProduct(p);
                     System.out.println("Them thanh cong");
                     break;
                 case 2:
                     for (Product pr : db.getAll()) {
                         pr.disPlayInfo();
                     }
                     break;
                 case 3:
                     System.out.print("Nhap Id sua: ");
                     String uid = sc.nextLine();
                     Product up = db.findById(uid);
                     if (up != null) {
                         System.out.print("NewName: ");
                         up.setName(sc.nextLine());

                         System.out.print("NewPrice: ");
                         up.setPrice(sc.nextDouble());
                         sc.nextLine();

                         System.out.println("Cap nhat thanh cong");
                     } else {
                         System.out.println("Khong tim thay");
                     }
                     break;
                 case 4:
                     System.out.print("Nhap id xoa:");
                     String did = sc.nextLine();
                     db.removeProduct(did);
                     System.out.println("Da xoa");
                     break;
                 case 5:
                     System.out.println("Ban da thoat chuong trinh");
                     break;
                 default:
                     System.out.println("Lua chon khong hop le");
             }
         }
    }
}
