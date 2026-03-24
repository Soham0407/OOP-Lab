import java.util.Scanner;

public class FindSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();

        String target = "the";

        int firstIndex = input.indexOf(target);
        int lastIndex = input.lastIndexOf(target);

        if (firstIndex != -1 && lastIndex != -1 && firstIndex != lastIndex) {

            int start = firstIndex + target.length();
            String result = input.substring(start, lastIndex);

            System.out.println("Substring between first and last 'the':");
            System.out.println(result);
        } else {
            System.out.println("'the' does not appear at least twice in the text.");
        }

        scanner.close();
    }
}