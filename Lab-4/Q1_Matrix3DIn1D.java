import java.util.Scanner;

public class Q1_Matrix3DIn1D {

    static void set(int value, int indexX, int indexY, int indexZ, int sizeY, int sizeZ, int[] oneDArray) {
        int index = indexX * (sizeY * sizeZ) + indexY * sizeZ + indexZ;
        oneDArray[index] = value;
    }

    static int get(int indexX, int indexY, int indexZ, int sizeY, int sizeZ, int[] oneDArray) {
        int index = indexX * (sizeY * sizeZ) + indexY * sizeZ + indexZ;
        return oneDArray[index];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value: ");
        int value = sc.nextInt();

        int sizeX, sizeY, sizeZ;
        System.out.print("Enter size of X,Y and Z dimension: ");
        sizeX = sc.nextInt();
        sizeY = sc.nextInt();
        sizeZ = sc.nextInt();

        System.out.println("Enter index of X,Y and Z dimension: ");
        int indexX = sc.nextInt();
        int indexY = sc.nextInt();
        int indexZ = sc.nextInt();

        int[] oneDArray = new int[sizeX * sizeY * sizeZ];

        set(value, indexX, indexY, indexZ, sizeY, sizeZ, oneDArray);
        System.out.println(get(indexX, indexY, indexZ, sizeY, sizeZ, oneDArray));
    }
}
