import java.util.Scanner;

public class InputHelper {
    public static double getRangedDouble(Scanner scan, String prompt, double min, double max) {
        double num = 0;
        boolean check = false;

        System.out.println(prompt);
        do {
            if (scan.hasNextDouble()) {
                num = scan.nextDouble();
                if (num >= min && num <= max) {
                    check = true;
                } else {
                    System.out.println("Input not within the range, please try again.");
                }
            } else {
                System.out.println("Invalid input, please try again.");
            }
            scan.nextLine();
        } while (!check);

        return num;
    }

    public static boolean getYNConfirm (Scanner scan, String prompt) {
        String input;
        boolean confirm = false;
        boolean check = false;

        System.out.println(prompt);
        do {
            input = scan.nextLine();
            if (input.equalsIgnoreCase("y")) {
                confirm = true;
                check = true;
            } else if (input.equalsIgnoreCase("n")) {
                check = true;
            } else {
                System.out.println("Invalid input, please try again.");
            }
        } while (!check);

        return confirm;
    }
}
