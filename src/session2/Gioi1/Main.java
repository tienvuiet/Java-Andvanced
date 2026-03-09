package session2.Gioi1;

public class Main {
    static void main(String[] args) {
        Account user1 = new Account("123456");
        System.out.println(user1.isAuthenticated());
        String maHoa = Authenticatable.encrypt("Sacanana");
        System.out.println(maHoa);
    }
}
