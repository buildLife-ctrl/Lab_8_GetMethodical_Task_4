import java.util.Scanner;

public class TaskFourCheckOut {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //variable
        boolean contin;
        double total = 0;
        int item = 0;

        do {
            item = item + 1;
            double price = InputHelper.getRangedDouble(scan, "What is the price of your item? [$0.50-$9.99]", 0.05, 9.99);
            total += price;
            contin = InputHelper.getYNConfirm(scan, "Do you want to continue to add item? [Y/N]");
        } while (contin);

        System.out.printf("%-18s %5.2f", "Total cost in $:", total);
    }
}
