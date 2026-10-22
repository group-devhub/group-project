import java.util.Scanner;

/**
 * Customer Loyalty Reward System
 * Generates Fibonacci-based reward points for each year of loyalty.
 */
public class CustomerLoyaltySystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of loyalty years (1-93): ");

        if (!input.hasNextInt()) {
            System.out.println("Invalid input. Please enter a whole number.");
            input.close();
            return;
        }

        int years = input.nextInt();

        // long can store Fibonacci values through F(92).
        if (years < 1 || years > 93) {
            System.out.println("Please enter a number from 1 to 93.");
            input.close();
            return;
        }

        long[] rewards = new long[years];
        rewards[0] = 0;

        if (years >= 2) {
            rewards[1] = 1;
        }

        for (int i = 2; i < years; i++) {
            rewards[i] = rewards[i - 1] + rewards[i - 2];
        }

        System.out.println();
        System.out.println("CUSTOMER LOYALTY REWARDS");

        for (int i = 0; i < years; i++) {
            String label = rewards[i] == 1 ? "point" : "points";
            System.out.println("Year " + (i + 1) + ": "
                    + rewards[i] + " " + label);
        }

        input.close();
    }
}
