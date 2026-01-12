import java.util.Scanner;
public class Circle{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int radius = sc.nextInt();
        double pi = Math.PI;

        int diameter = 2 * radius;
        double circumference = 2 * pi * radius;
        double area = pi * radius * radius;

        System.out.println("Diameter: " + diameter);
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);
        sc.close();
    }
}
