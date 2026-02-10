import java.util.Scanner;

interface Function {
    int evaluate(int x);
}

class Half implements Function {

    public int evaluate(int x) {
        return x / 2;
    }
}

public class Q6_FunctionDemo {

    // Client method
    static int[] halfArray(int[] arr) {

        Function f = new Half();
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = f.evaluate(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] input = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }

        int[] output = halfArray(input);

        System.out.println("Result array:");
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }

        sc.close();
    }
}
