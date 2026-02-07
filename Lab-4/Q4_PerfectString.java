import java.util.Scanner;

public class Q4_PerfectString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        int[] freq = new int[256]; // ASCII characters
        boolean isPerfect = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;

            if (freq[ch] > 1) {
                isPerfect = false;
                break;
            }
        }

        if (isPerfect) {
            System.out.println("Perfect String");
        } else {
            System.out.println("Not a Perfect String");
        }

        sc.close();
    }
}
