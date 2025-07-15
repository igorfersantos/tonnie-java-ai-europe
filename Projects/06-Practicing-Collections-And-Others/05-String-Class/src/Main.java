import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        var value = "java;java;java;java;java;java;";
        value = value.replaceFirst("j", "J");
        System.out.println("replaceFirst: " + value);
        value = value.replace('j', 'J');
        System.out.println("replace: " + value);
        System.out.println("split: " + Arrays.stream(value.split(";")).toList());

        // JDK 17 Text Block
        var text = """
                {"name":"Igor",age:26}""";
        System.out.println(text);
        Map<String, String> map = new HashMap<>();
        text = text
                .replace("{", "")
                .replace("}", "")
                .replace("\"", "");
        var valueArr = text.split(",");
        for (String entry : valueArr) {
            var keyValue = entry.split(":");
            map.put(keyValue[0],keyValue[1]);
        }
        System.out.println(map);
    }
}