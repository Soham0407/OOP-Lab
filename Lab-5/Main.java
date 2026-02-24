import java.util.Scanner;

class Fruit {
    private String name;
    private String type;
    private double price;

    public Fruit(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public void displayFruit() {
        System.out.println("Fruit Name: " + name);
        System.out.println("Fruit Type: " + type);
        System.out.println("Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for the first fruit:");
        System.out.print("Enter the name of the fruit: ");
        String name1 = scanner.nextLine();

        System.out.print("Enter the type Single/Bunch: ");
        String type1 = scanner.nextLine();

        System.out.print("Enter the price: ");
        double price1 = scanner.nextDouble();
        scanner.nextLine();

        Fruit fruit1 = new Fruit(name1, type1, price1);

        System.out.println("\nEnter details for the second fruit:");
        System.out.print("Enter the name of the fruit: ");
        String name2 = scanner.nextLine();

        System.out.print("Enter the type Single/Bunch: ");
        String type2 = scanner.nextLine();

        System.out.print("Enter the price: ");
        double price2 = scanner.nextDouble();

        Fruit fruit2 = new Fruit(name2, type2, price2);

        System.out.println("\nFruit 1 Details:");
        fruit1.displayFruit();

        System.out.println("\nFruit 2 Details:");
        fruit2.displayFruit();

        scanner.close();
    }
}
