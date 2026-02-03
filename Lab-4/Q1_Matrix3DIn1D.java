public class Q1_Matrix3DIn1D {

    static void set(int value,
            int indexX, int indexY, int indexZ,
            int sizeY, int sizeZ,
            int[] oneDArray) {
        int index = indexX * (sizeY * sizeZ) + indexY * sizeZ + indexZ;
        oneDArray[index] = value;
    }

    static int get(int indexX, int indexY, int indexZ,
            int sizeY, int sizeZ,
            int[] oneDArray) {
        int index = indexX * (sizeY * sizeZ) + indexY * sizeZ + indexZ;
        return oneDArray[index];
    }

    public static void main(String[] args) {

        int sizeX = 2;
        int sizeY = 3;
        int sizeZ = 4;

        int[] oneDArray = new int[sizeX * sizeY * sizeZ];

        set(15, 1, 2, 3, sizeY, sizeZ, oneDArray);
        System.out.println(get(1, 2, 3, sizeY, sizeZ, oneDArray));
    }
}
