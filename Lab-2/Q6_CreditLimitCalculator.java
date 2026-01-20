import java.util.Scanner;

public class Q6_CreditLimitCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int accountNumber;

        System.out.print("Enter account number ");
        accountNumber = input.nextInt();

        while (accountNumber != -1) {

            System.out.print("Enter beginning balance: ");
            double beginningBalance = input.nextDouble();

            System.out.print("Enter total charges for this month: ");
            double charges = input.nextDouble();

            System.out.print("Enter total credits for this month: ");
            double credits = input.nextDouble();

            double newBalance = beginningBalance + charges - credits;

            System.out.println("\nAccount Number: " + accountNumber);
            System.out.printf("New Balance: %.2f\n", newBalance);

            System.out.print("Enter account number or -1 to quit: ");
            accountNumber = input.nextInt();
        }
        input.close();
    }
}
