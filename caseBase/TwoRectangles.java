package caseBase;

import java.util.Scanner;

public class TwoRectangles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double w1 = input.nextDouble();
        double h1 = input.nextDouble();

        System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double w2 = input.nextDouble();
        double h2 = input.nextDouble();

        double r1Left = x1 - w1 / 2;
        double r1Right = x1 + w1 / 2;
        double r1Bottom = y1 - h1 / 2;
        double r1Top = y1 + h1 / 2;

        double r2Left = x2 - w2 / 2;
        double r2Right = x2 + w2 / 2;
        double r2Bottom = y2 - h2 / 2;
        double r2Top = y2 + h2 / 2;

        // Check if r2 is inside r1
        boolean inside = r2Left >= r1Left &&
                r2Right <= r1Right &&
                r2Bottom >= r1Bottom &&
                r2Top <= r1Top;

        // Check if r2 overlaps r1
        boolean overlaps = r2Right > r1Left &&
                r2Left < r1Right &&
                r2Top > r1Bottom &&
                r2Bottom < r1Top;

        if (inside) {
            System.out.println("r2 is inside r1");
        } else if (overlaps) {
            System.out.println("r2 overlaps r1");
        } else {
            System.out.println("r2 does not overlap r1");
        }

        input.close();
    }
}
