package session3.XuatSac1;

import session3.Gioi1.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<User> users = new ArrayList<>(List.of(
                new User("Vu Viet Tien","151906"),
                new User("Nguyen Xuan Thanh Long", "12313312"),
                new User("Pham Nhat Vuong", "42323234"),
                new User("Sacanana", "42342313")
        ));
        users.stream()
                .sorted(Comparator.comparing((User u) -> u.getName().length()).reversed())
                .limit(3)
                .forEach(System.out::println);


    }
}
