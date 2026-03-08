package session1.XuatXac1;

import session1.Gioi1.User;

public class Main {
    static void main(String[] args) {
        User user = new User(13);
        try {
            user.setAge(-2);
        } catch (InvalidAgeException e) {
            System.out.println("Loi: " +e.getMessage());
        }
        System.out.println("Chuong trinh tiep tuc chay");
    }
}
