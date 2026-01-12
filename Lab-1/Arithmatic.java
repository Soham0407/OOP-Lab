import java.util.Scanner;
public class Arithmatic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        if(b != 0) {
            System.out.println("Quotient: " + (a / b));
        } else {
            System.out.println("Division and Modulus by zero is not allowed.");
        }
        sc.close();
    }
}
