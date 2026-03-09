package session2.Gioi2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    static void main(String[] args) {
        User user = new User("Tien", "1");
        //(user) -> user.getUsername()
        Function<User, String> getName = User::getName;
        System.out.println(getName.apply(user));

        Consumer<User> c = System.out::println;
        c.accept(user);
        Supplier<User> s = User::new;
        User u2 = s.get();
        System.out.println(u2.getName());
    }
}
