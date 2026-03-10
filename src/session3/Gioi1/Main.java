package session3.Gioi1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    static void main(String[] args) {

        List<User> users = new ArrayList<>(List.of(
                new User("Vu Viet tien", "151906"),
                new User("alice", "312123")
        ));
        findUserByUserName(users, "alice")
                .ifPresentOrElse(
                        u-> System.out.println("Welcome "+ u.getName()),
                        ()-> System.out.println("guest login")
                );
    }
    static Optional<User> findUserByUserName(List<User> users, String username){
        return users.stream()
                .filter(u-> u.getName().equals(username))
                .findFirst();
    }
}
