package session3.Kha1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        record User(String userName, String email, String status){};
        List<User> users = new ArrayList<>(List.of(
                new User("alice", "alice@gmail.com", "active"),
                new User("bob", "bob@gmail.com", "inactive"),
                new User("allain", "allain@gmail.com", "active")
        ));
        users.forEach(System.out::println);

    }
}
