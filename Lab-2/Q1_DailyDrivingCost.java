import java.util.Scanner;

public class Q1_DailyDrivingCost {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter total miles driven per day: ");
        double milesDriven = input.nextDouble();

        System.out.print("Enter cost per gallon of gasoline: ");
        double costPerGallon = input.nextDouble();

        System.out.print("Enter average miles per gallon: ");
        double milesPerGallon = input.nextDouble();

        System.out.print("Enter average fees per day: ");
        double feesPerDay = input.nextDouble();

        System.out.print("Enter tolls per day: ");
        double tollsPerDay = input.nextDouble();

        double totalDailyCost = (milesDriven / milesPerGallon) * costPerGallon + feesPerDay + tollsPerDay;
        System.out.printf("Total Cost Per Day: %.2f%n", totalDailyCost);

        input.close();
    }
}
