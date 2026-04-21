import java.util.*;

class SinThread extends Thread {
    double x;

    SinThread(double x) {
        this.x = x;
    }

    public void run() {
        System.out.println("sin(x): " + Math.sin(x));
    }
}

class CosThread extends Thread {
    double x;

    CosThread(double x) {
        this.x = x;
    }

    public void run() {
        System.out.println("cos(x): " + Math.cos(x));
    }
}

public class SinCosThreads {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        new SinThread(x).start();
        new CosThread(x).start();
    }
}