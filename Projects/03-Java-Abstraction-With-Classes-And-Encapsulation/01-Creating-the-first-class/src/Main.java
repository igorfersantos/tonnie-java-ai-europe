//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var male = new Person("João");
        male.incAge();

        System.out.printf("Male name: %s age: %s\n", male.getName(), male.getAge());
    }
}