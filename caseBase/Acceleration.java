package caseBase;
import java.util.Scanner;
public class Acceleration{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter v0, v1, and t: ");
        double v0 = sc.nextDouble(); 
        double v1 = sc.nextDouble(); 
        double t = sc.nextDouble();  

        double acceleration = (v1 - v0) / t;

        System.out.println("The average acceleration is " + acceleration);

        sc.close();
    }
}
