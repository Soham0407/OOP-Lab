import java.util.*;

public class ModifyAndSortNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[10];
        System.out.println("Enter 10 names:");
        for (int i = 0; i < 10; i++) {
            names[i] = scanner.nextLine();
        }

        for (int i = 0; i < 10; i++) {
            if (names[i].length() > 3) {
                names[i] = names[i].substring(3);
            } else {
                names[i] = "";
            }
        }
        Arrays.sort(names);

        System.out.println("Modified and sorted names:");
        for (int i = 0; i < 10; i++) {
            System.out.println(names[i]);
        }

        scanner.close();
    }
}