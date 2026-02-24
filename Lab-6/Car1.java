import java.util.Scanner;

abstract class Car {

    String brand;

    Car(String brand) {
        this.brand = brand;
    }

    void displayBrand() {
        System.out.println("Car Brand: " + brand);
    }

    abstract void avg();

    abstract void mode();
}

class Maruti extends Car {

    Scanner sc = new Scanner(System.in);

    Maruti() {
        super("Maruti");
    }

    void avg() {
        System.out.print("Enter Maruti average: ");
        double average = sc.nextDouble();
        System.out.println("Maruti Average: " + average);
    }

    void mode() {
        sc.nextLine();
        System.out.print("Enter Maruti mode: ");
        String modeType = sc.nextLine();
        System.out.println("Maruti Mode: " + modeType);
    }
}

class Santro extends Car {

    Scanner sc = new Scanner(System.in);

    Santro() {
        super("Santro");
    }

    void avg() {
        System.out.print("Enter Santro average: ");
        double average = sc.nextDouble();
        System.out.println("Santro Average: " + average);
    }

    void mode() {
        sc.nextLine();
        System.out.print("Enter Santro mode: ");
        String modeType = sc.nextLine();
        System.out.println("Santro Mode: " + modeType);
    }
}

public class Car1 {

    public static void main(String[] args) {

        Car c1 = new Maruti();
        c1.displayBrand();
        c1.avg();
        c1.mode();

        System.out.println();

        Car c2 = new Santro();
        c2.displayBrand();
        c2.avg();
        c2.mode();
    }
}