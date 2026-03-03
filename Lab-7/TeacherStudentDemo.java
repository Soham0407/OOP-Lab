import java.util.Scanner;

class Teacher {
    int id;
    String name;
    String subject;

    public Teacher(int id, String name, String subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

    public void displayTeacher() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
    }
}

class Student extends Teacher {

    String course;
    int marks;

    public Student(int id, String name, String subject, String course, int marks) {
        super(id, name, subject);
        this.course = course;
        this.marks = marks;
    }

    public void displayStudent() {
        displayTeacher();
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
    }
}

public class TeacherStudentDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input Teacher details
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Subject: ");
        String subject = sc.nextLine();

        // Input additional Student details
        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        Student s = new Student(id, name, subject, course, marks);

        System.out.println("\nStudent Details");
        s.displayStudent();

        sc.close();
    }
}