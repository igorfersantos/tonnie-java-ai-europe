public record Person(String name, int age) {

    public Person {
        System.out.println("Hello");
    }

    public Person(String name) {
        this(name, 1);
    }
}
