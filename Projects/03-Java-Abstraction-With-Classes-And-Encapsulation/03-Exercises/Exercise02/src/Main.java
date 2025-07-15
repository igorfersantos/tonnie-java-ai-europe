import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car = new Car();
        while (true) {
            System.out.println("Select an option:");
            System.out.println("1 - Turn the car on");
            System.out.println("2 - Turn the car off");
            System.out.println("3 - Accelerate");
            System.out.println("4 - Decrease speed");
            System.out.println("5 - Turn left");
            System.out.println("6 - Turn right");
            System.out.println("7 - Check speed");
            System.out.println("8 - Change gear");
            System.out.println("9 - Exit");
            // I will use the more traditional switch this time.
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    if (!car.turnOn()) {
                        System.err.println("You already turned it on!");
                        break;
                    }
                    System.out.println("You turned the car on");
                    break;
                case 2:
                    if (!car.turnOff()) {
                        System.err.println("You can't turn the car off right now. Gear and speed must be 0. " +
                                "Or already turned off.");
                        break;
                    }
                    System.out.println("You turned the car off");
                    break;
                case 3:
                    if (!car.accelerate()) {
                        System.err.println("You can't accelerate right now. Gear 0, car turned off or already at maximum speed (120).");
                        break;
                    }
                    System.out.printf("You accelerated! Actual speed: %s\n", car.getSpeed());
                    break;
                case 4:
                    if (!car.decelerate()) {
                        System.err.println("You can't decelerate right now. Gear 0, car turned off or already at minimum speed (1).");
                        break;
                    }
                    System.out.printf("You decelerated! Actual speed: %s\n", car.getSpeed());
                    break;
                case 5:
                    if (!car.turn()) {
                        System.err.println("You can't take a left turn right now. " +
                                "Speed must be between 1 and 40 and the car must be on");
                        break;
                    }
                    System.out.println("You turned left");
                    break;
                case 6:
                    if (!car.turn()) {
                        System.err.println("You can't take a right turn right now. " +
                                "Speed must be between 1 and 40 and the car must be on");
                        break;
                    }
                    System.out.println("You turned right");
                    break;
                case 7:
                    System.out.printf("Your actual speed right now is: %s\n", car.getSpeed());
                    break;
                case 8:
                    System.out.println("Select how you want to change the gear (up or down) (u/d):");
                    String gearOption = scanner.next().toLowerCase();
                    switch (gearOption) {
                        case "d" -> {
                            if (!car.changeGear(0)) {
                                System.err.println("Car must be on and you can't shift the gear below 0");
                                break;
                            }
                            System.out.printf("Successfully changed to gear %s\n", car.getGear());
                        }
                        case "u" -> {
                            if (!car.changeGear(1)) {
                                System.err.println("Car must be on and you can't shift the gear above 6");
                                break;
                            }
                            System.out.printf("Successfully changed to gear %s\n", car.getGear());
                        }
                        default -> {
                            System.err.println("Invalid option!");
                        }
                    }
                    break;
                case 9:
                    System.out.println("Exiting!");
                    System.exit(0);
                default:
                    System.err.println("Invalid option");
                    break;
            }
        }

    }
}