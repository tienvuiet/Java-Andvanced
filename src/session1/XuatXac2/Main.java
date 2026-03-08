package session1.XuatXac2;

import session1.Gioi1.User;
import session1.XuatXac1.InvalidAgeException;

public class Main {
    static void main(String[] args) {
        User user = new User(16);

        try{
            user.setAge(-5);
        }catch(InvalidAgeException e){
            Logger.logError(e.getMessage());
        }

        if(user != null){
            System.out.println("Tuoi nguoi dung: " + user.getAge());
        }else{
            System.out.println("Khong co thong tin nguoi dung: ");
        }

        System.out.println("Chuong trinh tiep tuc chay");
    }


}
