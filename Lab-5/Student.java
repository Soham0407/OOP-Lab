import java.util.Scanner;

public class Student {

    public String average(int mark1, int mark2, int mark3) {
        double avg = (mark1 + mark2 + mark3) / 3.0;
        if (avg > 50) {
            return "Passed";
        } else {
            return "Failed";
        }
    }

    public String inputName(String name) {
        return name;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter marks for the 1st exam: ");
        int mark1 = scanner.nextInt();
        System.out.print("Enter marks for the 2nd exam: ");
        int mark2 = scanner.nextInt();
        System.out.print("Enter marks for the 3rd exam: ");
        int mark3 = scanner.nextInt();

        System.out.println("Student's name is: " + student.inputName(name));

        String result = student.average(mark1, mark2, mark3);
        System.out.println("The student has " + result);
    }
}
