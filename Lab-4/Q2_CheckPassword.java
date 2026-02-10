import java.util.Scanner;

public class Q2_CheckPassword {

    public static boolean isValidPassword(String password) {

        if (password.length() < 5 || password.length() > 12) {
            return false;
        }

        boolean hasLowerCase = false;
        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                return false;
            }

            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }

            if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            }

            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        if (!hasLowerCase || !hasDigit) {
            return false;
        }

        for (int len = 1; len <= password.length() / 2; len++) {
            for (int i = 0; i + 2 * len <= password.length(); i++) {

                String first = password.substring(i, i + len);
                String second = password.substring(i + len, i + 2 * len);

                if (first.equals(second)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String password;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a password: ");
        password = sc.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Invalid password");
        }

    }
}
