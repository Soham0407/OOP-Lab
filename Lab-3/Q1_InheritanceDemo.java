class Figure {
    double r;
    double a;
    double v;

    public void dispArea() {
        System.out.println("Area = " + a);
    }

    public void dispVolume() {
        System.out.println("Volume = " + v);
    }
}

class Cone extends Figure {
    double h;
    double s;

    public void calcArea() {
        a = Math.PI * r * s + Math.PI * r * r;
    }

    public void calcVolume() {
        v = (Math.PI * r * r * h) / 3;
    }
}

public class Q1_InheritanceDemo {
    public static void main(String[] args) {
        Cone c = new Cone();

        c.r = 5.0;
        c.h = 9.0;
        c.s = 7.0;

        c.calcArea();
        c.calcVolume();

        c.dispArea();
        c.dispVolume();
    }
}