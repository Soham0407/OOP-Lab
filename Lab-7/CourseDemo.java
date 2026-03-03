import java.util.Scanner;

class Course {
    private int id;
    private String description;
    private int duration;
    private double fees;

    Course(int id, String description, int duration, double fees) throws IllegalArgumentException {
        if (duration < 0) {
            throw new IllegalArgumentException("Duration cannot be negative.");
        }
        if (fees < 0) {
            throw new IllegalArgumentException("Fees cannot be negative.");
        }

        this.id = id;
        this.description = description;
        this.duration = duration;
        this.fees = fees;
    }

    void getData() {
        System.out.println("Course ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Duration (months): " + duration);
        System.out.println("Fees: " + fees);
    }
}

public class CourseDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course[] courses = new Course[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter details for Course " + (i + 1));

            try {
                System.out.print("Enter Course ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Description: ");
                String description = sc.nextLine();

                System.out.print("Enter Duration (in months): ");
                int duration = sc.nextInt();

                System.out.print("Enter Fees: ");
                double fees = sc.nextDouble();

                courses[i] = new Course(id, description, duration, fees);

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please re-enter the details.\n");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter correct data types.");
                sc.nextLine();
            }

        }

        System.out.println("\nCourse Details");
        for (int i = 0; i < courses.length; i++) {
            Course c = courses[i];
            c.getData();
        }

        sc.close();
    }
}