import java.util.Scanner;
public class Operations {
      @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int sum=a+b+c;
        System.out.println("Sum: "+sum);
        double average=sum/3.0;
        System.out.println("Average: "+average);
        int product=a*b*c;
        System.out.println("Product: "+product);
        if(a>=b && a>=c){
            System.out.println("Largest: "+a);
            if(b<=c){
                System.out.println("Smallest: "+b);
            } else {
                System.out.println("Smallest: "+c);
            }
        }
        else if(b>=a && b>=c){
            System.out.println("Largest: "+b);
            if(a<=c){
                System.out.println("Smallest: "+a);
            } else {
                System.out.println("Smallest: "+c);
            }
        } else {
            System.out.println("Largest: "+c);
            if(a<=b){
                System.out.println("Smallest: "+a);
            } else {
                System.out.println("Smallest: "+b);
            }
        }
    }
}
