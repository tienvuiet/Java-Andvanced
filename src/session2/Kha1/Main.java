package session2.Kha1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    static void main(String[] args) {
        User user = new User("Tien", "ADMIN");
        Predicate<User> checkUser = u -> u.getRole().equals("ADMIN");
        System.out.println(checkUser.test(user));

        Function<User, String> getUserName = u -> u.getName();
        System.out.println(getUserName.apply(user));

        Consumer<User> printUser = u ->
                System.out.println("Username: "+ u.getName() + " Role: "+ u.getRole());
        printUser.accept(user);

        Supplier<User> createDefaultUser  = () -> new User("Sacanana", "Luat su");
        User newUser = createDefaultUser.get();
        System.out.println(newUser.getName());
    }
}
// | Interface | Method     | Input | Output  | Mục đích    |
//| --------- | ---------- | ----- | ------- | ----------- |
//| Predicate | `test()`   | T     | boolean | kiểm tra    |
//| Function  | `apply()`  | T     | R       | chuyển đổi  |
//| Consumer  | `accept()` | T     | void    | xử lý       |
//| Supplier  | `get()`    | none  | T       | tạo dữ liệu |