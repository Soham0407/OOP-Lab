import java.util.Scanner;

public class TaxCalculator {

    public static double calculateTax(double grossPay) {
        double TAX_RATE = 0.15;
        return grossPay * TAX_RATE;
    }

    public static double calculateNetPay(int hoursWorked) {
        double HOURLY_RATE = 12.0;
        double grossPay = hoursWorked * HOURLY_RATE;
        double tax = calculateTax(grossPay);
        return grossPay - tax;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of hours worked: ");
        int hoursWorked = scanner.nextInt();

        double netPay = calculateNetPay(hoursWorked);
        System.out.printf("The net pay is: $%.2f\n", netPay);
    }
}
