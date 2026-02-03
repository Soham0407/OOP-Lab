package caseBase;

import java.util.Scanner;

public class EnergyToHeatWater {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        double mass = sc.nextDouble();

        System.out.print("Enter the initial temperature: ");
        double initialTemp = sc.nextDouble();

        System.out.print("Enter the final temperature: ");
        double finalTemp = sc.nextDouble();

        double energy = mass * (finalTemp - initialTemp) * 4184;

        System.out.println("The energy needed is " + energy + " joules");

        sc.close();
    }
}
