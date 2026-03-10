package session3.XuatSac2;

import java.util.List;

public class Main {
    static void main(String[] args) {
        List<Post> posts = List.of(
                new Post("Java", List.of("java", "BE")),
                new Post("Python", List.of("python", "AI")),
                new Post("Spring", List.of("java", "spring"))
        );
        List<String> tags = posts.stream()
                .flatMap(post -> post.getTags().stream())
                .toList();
        tags.forEach(System.out::println);
    }
}
