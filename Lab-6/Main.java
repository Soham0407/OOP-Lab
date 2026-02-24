import java.util.Scanner;

class Point3D {
    private int x;
    private int y;
    private int z;

    Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void display() {
        System.out.println("(" + x + ", " + y + ", " + z + ")");
    }

    double distance(Point3D p) {
        int dx = this.x - p.x;
        int dy = this.y - p.y;
        int dz = this.z - p.z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates of first point:");
        System.out.print("x1: ");
        int x1 = sc.nextInt();
        System.out.print("y1: ");
        int y1 = sc.nextInt();
        System.out.print("z1: ");
        int z1 = sc.nextInt();

        Point3D p1 = new Point3D(x1, y1, z1);

        System.out.println("Enter coordinates of second point:");
        System.out.print("x2: ");
        int x2 = sc.nextInt();
        System.out.print("y2: ");
        int y2 = sc.nextInt();
        System.out.print("z2: ");
        int z2 = sc.nextInt();

        Point3D p2 = new Point3D(x2, y2, z2);

        System.out.print("First Point: ");
        p1.display();

        System.out.print("Second Point: ");
        p2.display();

        double distance = p1.distance(p2);
        System.out.println("Distance between the two points: " + distance);

        sc.close();
    }
}