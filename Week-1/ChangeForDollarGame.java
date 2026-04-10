import java.util.Scanner;

public class ChangeForDollarGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of pennies: ");
        int pennies = input.nextInt();

        System.out.print("Enter number of nickels: ");
        int nickels = input.nextInt();

        System.out.print("Enter number of dimes: ");
        int dimes = input.nextInt();

        System.out.print("Enter number of quarters: ");
        int quarters = input.nextInt();

        double total = (pennies * 0.01) +
                       (nickels * 0.05) +
                       (dimes * 0.10) +
                       (quarters * 0.25);

        if (Math.abs(total - 1.00) < 0.001) {
            System.out.println("You win! The total is exactly $1.00");
        } else if (total > 1.00) {
            System.out.println("You went over by $" + (total - 1.00));
        } else {
            System.out.println("You went under by $" + (1.00 - total));
        }

        input.close();
    }
}
