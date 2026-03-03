import java.util.Scanner;

class NegativeSpeedException extends Exception {
    public NegativeSpeedException(String message) {
        super(message);
    }
}

class Vehicle {
    String brand;
    double speed;

    Vehicle(String brand, double speed) throws NegativeSpeedException {
        if (speed < 0) {
            throw new NegativeSpeedException("Speed cannot be negative!");
        }
        this.brand = brand;
        this.speed = speed;
    }

    void maxSpeed() {
        System.out.println("Maximum Speed of Vehicle: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    int doors;

    Car(String brand, double speed, int doors) throws NegativeSpeedException {
        super(brand, speed);
        this.doors = doors;
    }

    void maxSpeed() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Maximum Speed of Car: " + speed + " km/h");
    }
}

class Bicycle extends Vehicle {
    boolean hasGear;

    Bicycle(String brand, double speed, boolean hasGear) throws NegativeSpeedException {
        super(brand, speed);
        this.hasGear = hasGear;
    }

    void maxSpeed() {
        System.out.println("Bicycle Brand: " + brand);
        System.out.println("Maximum Speed of Bicycle: " + speed + " km/h");
    }
}

class Scooter extends Vehicle {
    String type; // Electric or Petrol

    Scooter(String brand, double speed, String type) throws NegativeSpeedException {
        super(brand, speed);
        this.type = type;
    }

    void maxSpeed() {
        System.out.println("Scooter Brand: " + brand);
        System.out.println("Maximum Speed of Scooter: " + speed + " km/h");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Choose Vehicle Type:");
            System.out.println("1. Car");
            System.out.println("2. Bicycle");
            System.out.println("3. Scooter");
            int choice = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Brand: ");
            String brand = sc.nextLine();

            System.out.print("Enter Speed: ");
            double speed = sc.nextDouble();

            switch (choice) {
                case 1:
                    System.out.print("Enter Number of Doors: ");
                    int doors = sc.nextInt();
                    Car car = new Car(brand, speed, doors);
                    car.maxSpeed();
                    break;

                case 2:
                    System.out.print("Has Gear? (true/false): ");
                    boolean hasGear = sc.nextBoolean();
                    Bicycle bicycle = new Bicycle(brand, speed, hasGear);
                    bicycle.maxSpeed();
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Enter Type (Electric/Petrol): ");
                    String type = sc.nextLine();
                    Scooter scooter = new Scooter(brand, speed, type);
                    scooter.maxSpeed();
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } catch (NegativeSpeedException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid Input!");
        }

        sc.close();
    }
}