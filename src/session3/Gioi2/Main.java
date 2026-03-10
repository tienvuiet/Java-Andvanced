package session3.Gioi2;





import session3.Gioi1.User;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    static void main(String[] args) {
        List<User> users = new ArrayList<>(List.of(
                new User("Tien", "1231212"),
                new User("Tien", "afdsdaf"),
                new User("Long", "asfsadfsdaf")
        ));
        Set<String> result = new HashSet<>();
        List<User> uniqueUser = users.stream()
                .filter(u -> result.add(u.getName()))
                .toList();
        uniqueUser.forEach(System.out::println);
    }
}
