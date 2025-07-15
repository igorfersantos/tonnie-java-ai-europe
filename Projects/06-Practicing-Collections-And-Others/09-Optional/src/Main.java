import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> optString = Optional.ofNullable("");
        optString.ifPresent(System.out::println);

        Optional<String> optionalString = Optional.of("teste");
        optionalString.ifPresent(System.out::println);
    }
}