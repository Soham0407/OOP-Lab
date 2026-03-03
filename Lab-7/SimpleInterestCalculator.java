import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the principal amount: ");
            double principal = sc.nextDouble();

            System.out.print("Enter the annual interest rate (in %): ");
            double rate = sc.nextDouble();

            System.out.print("Enter the number of months: ");
            double months = sc.nextDouble();

            if (principal < 0) {
                throw new IllegalArgumentException("Principal amount cannot be negative.");
            }
            if (rate < 0) {
                throw new IllegalArgumentException("Interest rate cannot be negative.");
            }
            if (months < 0) {
                throw new IllegalArgumentException("Months cannot be negative.");
            }

            rate = rate / 100;
            double years = months / 12;
            double interest = principal * rate * years;

            double balance = principal + interest;

            System.out.println("\nTotal Interest: " + String.format("%.2f", interest));
            System.out.println("Final Balance: " + String.format("%.2f", balance));

        } catch (IllegalArgumentException e) {
            System.out.println("Input Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numeric values only.");
        } finally {
            sc.close();
        }
    }
}