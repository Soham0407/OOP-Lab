import java.util.Scanner;

public class Q7_ParkingCharges {

    public static double calculateCharges(int hours) {

        double charge = 2.00;

        if (hours > 3) {
            int extraHours = hours - 3;
            charge = charge + (extraHours * 0.50);
        }

        // Maximum charge for 24 hours
        if (charge > 10.00) {
            charge = 10.00;
        }
        return charge;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalReceipts = 0.0;
        int hours;

        System.out.print("Enter hours parked : ");
        hours = input.nextInt();

        while (hours != -1) {

            double charge = calculateCharges(hours);

            System.out.printf("Parking charge: %.2f\n", charge);

            totalReceipts += charge;
            System.out.printf("Running total of receipts: %.2f\n", totalReceipts);

            System.out.print("Enter hours parked or -1 to quit: ");
            hours = input.nextInt();
        }

        input.close();
    }
}
