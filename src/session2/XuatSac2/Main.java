package session2.XuatSac2;

public class Main {
    static void main(String[] args) {
        UserProcessor userProcessor = UserUtils::convertToUpperCase;
        User user = new User("Vu Viet Tien", 19);
        String result = userProcessor.process(user);
        System.out.println(result);
    }
}
