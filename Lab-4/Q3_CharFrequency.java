import java.util.Scanner;

public class Q3_CharFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        System.out.println("Characters occurring more than " + n + " times:");

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (freq[ch] > n) {
                System.out.println(ch + " -> " + freq[ch]);
                freq[ch] = 0;
            }
        }

        sc.close();
    }
}
