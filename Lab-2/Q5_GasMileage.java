import java.util.Scanner;

public class Q5_GasMileage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int trips;
        int miles;
        int gallons;

        int totalMiles = 0;
        int totalGallons = 0;

        System.out.print("Enter number of trips: ");
        trips = input.nextInt();

        for (int i = 1; i <= trips; i++) {

            System.out.println("\nTrip " + i);

            System.out.print("Enter miles driven: ");
            miles = input.nextInt();

            System.out.print("Enter gallons used: ");
            gallons = input.nextInt();

            double milesPerGallon = (double) miles / gallons;
            System.out.printf("Miles per gallon for this trip: %.2f%n", milesPerGallon);

            totalMiles += miles;
            totalGallons += gallons;

            double combinedMPG = (double) totalMiles / totalGallons;
            System.out.printf("Combined miles per gallon: %.2f%n", combinedMPG);
        }
        input.close();
    }
}
