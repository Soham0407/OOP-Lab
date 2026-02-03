import java.util.Scanner;

public class Q5_PatternCountInRange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter range (a b): ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("Enter pattern: ");
        int pattern = sc.nextInt();

        int count = 0;

        String patternStr = String.valueOf(pattern);

        for (int i = a; i <= b; i++) {
            String numStr = String.valueOf(i);

            if (numStr.contains(patternStr)) {
                count++;
            }
        }

        System.out.println(
                "The number of times " + pattern + " occurred between " + a + " to " + b + ": " + count);

        sc.close();
    }
}
