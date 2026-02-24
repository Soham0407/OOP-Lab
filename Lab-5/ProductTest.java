import java.util.Scanner;
class Product {
    private int productId;
    private String name;
    private int categoryId;
    private double unitPrice;

    public Product(int productId, String name, int categoryId, double unitPrice) {
        this.productId = productId;
        this.name = name;
        this.categoryId = categoryId;
        this.unitPrice = unitPrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String toString() {
        return "Product ID: " + productId + ", Name: " + name + ", Category ID: " + categoryId + ", Unit Price: " + unitPrice;
    }
}

class ElectricalProduct extends Product {
    private String voltageRange;
    private int wattage;

    public ElectricalProduct(int productId, String name, int categoryId, double unitPrice, String voltageRange,int wattage) {
        super(productId, name, categoryId, unitPrice);
        this.voltageRange = voltageRange;
        this.wattage = wattage;
    }

    public String getVoltageRange() {
        return voltageRange;
    }

    public void setVoltageRange(String voltageRange) {
        this.voltageRange = voltageRange;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    public void changeWattageAndPrice(int newWattage, double newPrice) {
        this.wattage = newWattage;
        setUnitPrice(newPrice);
    }

    public String toString() {
        return super.toString() + ", Voltage Range: " + voltageRange + ", Wattage: " + wattage;
   }
}
public class ProductTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        int productId = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter Product Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Category ID: ");
        int categoryId = scanner.nextInt();

        System.out.print("Enter Unit Price: ");
        double unitPrice = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("Enter Voltage Range: ");
        String voltageRange = scanner.nextLine();

        System.out.print("Enter Wattage: ");
        int wattage = scanner.nextInt();

        ElectricalProduct electricalProduct = new ElectricalProduct(productId, name, categoryId, unitPrice, voltageRange, wattage);

        System.out.println("\nBefore Update:");
        System.out.println(electricalProduct);

        // change wattage and price
        System.out.print("\nEnter new Wattage: ");
        int newWattage = scanner.nextInt();

        System.out.print("Enter new Unit Price: ");
        double newPrice = scanner.nextDouble();

        // Update the wattage and price of the electrical product
        electricalProduct.changeWattageAndPrice(newWattage, newPrice);

        System.out.println("\nAfter Update:");
        System.out.println(electricalProduct);

        scanner.close();
    }
}
