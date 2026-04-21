import java.util.*;

class Fibonacci extends Thread {
    int n;

    Fibonacci(int n) {
        this.n = n;
        setPriority(8);
    }

    public void run() {
        try {
            long a = 1, b = 1;

            System.out.print("Fibonacci Part 1: ");
            System.out.print(a + " " + b + " ");

            for (int i = 3; i <= n; i++) {
                long c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }

            Thread.sleep(2000);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Prime extends Thread {
    int n;

    Prime(int n) {
        this.n = n;
        setPriority(5);
    }

    public void run() {
        System.out.print("\nPrime Numbers: ");

        int count = 0, num = 2;

        while (count < n) {
            boolean isPrime = true;

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }

            num++;
        }

        System.out.println("\nPrime computation done.");
    }
}

public class Series {
    public static void main(String[] args) throws Exception {

        Fibonacci f = new Fibonacci(50);
        Prime p = new Prime(25);

        f.start();
        f.join();

        p.start();
        p.join();

    }
}