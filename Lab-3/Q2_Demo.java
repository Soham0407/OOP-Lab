abstract class Figure {
    double pi = 3.1420;
    double a;
    double v;

    public abstract void calcArea();

    public abstract void calcVol();

    public abstract void DispArea();

    public abstract void DispVol();
}

class Cone extends Figure {
    double r, h, s;

    Cone(double r, double h, double s) {
        this.r = r;
        this.h = h;
        this.s = s;
    }

    public void calcArea() {
        a = pi * r * s + pi * r * r;
    }

    public void calcVol() {
        v = (pi * r * r * h) / 3;
    }

    public void DispArea() {
        System.out.println("Cone Area = " + a);
    }

    public void DispVol() {
        System.out.println("Cone Volume = " + v);
    }
}

class Sphere extends Figure {
    double r;

    Sphere(double r) {
        this.r = r;
    }

    public void calcArea() {
        a = 4 * pi * r * r;
    }

    public void calcVol() {
        v = (4 * pi * r * r * r) / 3;
    }

    public void DispArea() {
        System.out.println("Sphere Area = " + a);
    }

    public void DispVol() {
        System.out.println("Sphere Volume = " + v);
    }
}

class Cylinder extends Figure {
    double r, h;

    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public void calcArea() {
        a = 2 * pi * r * (h + r);
    }

    public void calcVol() {
        v = pi * r * r * h;
    }

    public void DispArea() {
        System.out.println("Cylinder Area = " + a);
    }

    public void DispVol() {
        System.out.println("Cylinder Volume = " + v);
    }
}

public class Q2_Demo {
    public static void main(String[] args) {

        Cone c = new Cone(5, 10, 7);
        c.calcArea();
        c.calcVol();
        c.DispArea();
        c.DispVol();

        Sphere s = new Sphere(4);
        s.calcArea();
        s.calcVol();
        s.DispArea();
        s.DispVol();

        Cylinder cy = new Cylinder(3, 8);
        cy.calcArea();
        cy.calcVol();
        cy.DispArea();
        cy.DispVol();
    }
}
