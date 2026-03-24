import java.util.Scanner;

public class CapitalizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");

        StringBuffer result = new StringBuffer();

        for (String word : words) {
            if (word.length() > 0) {
                result.append(Character.toUpperCase(word.charAt(0)));
                result.append(word.substring(1));
                result.append(" ");
            }
        }

        System.out.println("Result: " + result.toString());

        scanner.close();
    }
}