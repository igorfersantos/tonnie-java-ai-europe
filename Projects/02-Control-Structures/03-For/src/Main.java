import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(i + " - " + args[i]);
        }

        // short version without index control
        for (var arg : args) {
            System.out.println(arg);
        }
    }
}
