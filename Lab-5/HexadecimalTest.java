import java.util.Scanner;

class NotHexadecimalException extends Exception {
    NotHexadecimalException(String message) {
        super(message);
    }
}

public class HexadecimalTest {

    public static void checkHex(String number) throws NotHexadecimalException {

        if (number == null || number.length() == 0) {
            throw new NotHexadecimalException("Empty string is not a hexadecimal number.");
        }

        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);

            boolean isDigit = (ch >= '0' && ch <= '9');
            boolean isUpperHex = (ch >= 'A' && ch <= 'F');
            boolean isLowerHex = (ch >= 'a' && ch <= 'f');

            if (!(isDigit || isUpperHex || isLowerHex)) {
                throw new NotHexadecimalException(" Not a hexadecimal number.");
            }
        }

        System.out.println(number + " is a valid hexadecimal number.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String number = sc.nextLine();

        try {
            checkHex(number);
        } catch (NotHexadecimalException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        sc.close();
    }
}