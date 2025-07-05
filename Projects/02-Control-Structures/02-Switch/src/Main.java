import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // References:
        // https://www.baeldung.com/java-switch

        var scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 7:");
        var option = scanner.nextInt();
        // Most common, "old" usage of switch
        switch (option) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Not a valid option!");
        }

        // Wrapper and enum types were introduced in Java 5 and has been available in the switch statement since then.
        Integer i = 5;
        switch (i) {
            case 5:
                break;
        }

        enum PizzaStatus {
            ORDERED,
            READY,
            DELIVERED;
        }

        PizzaStatus status = PizzaStatus.DELIVERED;

        switch (status) {
            case ORDERED:
                System.out.println("Ordered");
                break;
            case READY:
                System.out.println("Ready");
                break;
            case DELIVERED:
                System.out.println("Delivered");
                break;
            default:
                System.out.println("Unknown status");
        }

        // String type is available in the switch statement starting with Java 7
        switch ("a") {
            case "a":
                break;
            case "b":
                break;
        }

        // Offically since Java 14 (or LTS version 17) we can now use "Switch Expressions"
        // https://dev.java/learn/language-basics/switch-expression/
        // https://openjdk.org/jeps/361
        /*
        Valid code, commented out to highlight the switch expressions below assigned to a variable.
        switch (option) {
            case 1,7 -> System.out.println("It's a weekend! (Saturday,Sunday)");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            default -> System.out.println("Not a valid option");
        }*/
        String message = switch (option) {
            case 1,7 -> {
                var day = option == 1 ? "Sunday" : "Saturday";
                yield String.format("Today is %s, so it's a weekend! :D", day);
            }
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            default -> "Not a valid option";
        };
        System.out.println(message);

    }
}
