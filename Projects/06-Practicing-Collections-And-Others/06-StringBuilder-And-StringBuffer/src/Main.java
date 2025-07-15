public class Main {
    public static void main(String[] args) {
        // StringBuffer is the alternative version for multithread scenarios.
        StringBuilder stringBuilder = new StringBuilder("1234567890");
        System.out.println(stringBuilder.delete(0, 2));
        System.out.println(stringBuilder.insert(5, "a"));
    }
}