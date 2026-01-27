class X {
    int i, j;

    X(int i, int j) {
        this.i = i;
        this.j = j;
    }

    int finalSum() {
        return i + j;
    }
}

class Y extends X {

    Y(int i, int j) {
        super(i, j);
    }

    int findProduct() {
        return i * j;
    }
}

class Z extends Y {

    Z(int i, int j) {
        super(i, j);
    }

    int findDifference() {
        return i - j;
    }
}

public class Q3_MultilevelInheritanceDemo {
    public static void main(String[] args) {

        Z obj = new Z(10, 5);

        System.out.println("Sum = " + obj.finalSum());
        System.out.println("Difference = " + obj.findDifference());
        System.out.println("Product = " + obj.findProduct());
    }
}
