package session3.Kha2;

import java.util.List;

public class Main {
    static void main(String[] args) {
        List<String> emails = List.of("alice@gmail.com", "bob@yahoo.com", "charlie@gmail.com ", "asd@acns");
        emails.stream()
                .map(String::trim)
                .filter(e -> e.endsWith("@gmail.com"))
                .forEach(
                        e -> {
                            String name = e.split("@")[0];
                            System.out.println(name+ " - " +e);
                        }
                );
    }
}
