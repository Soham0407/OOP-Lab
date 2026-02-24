import java.util.Scanner;

class Person {
    String name;

    Person(String name) {
        this.name = name;
        System.out.println("Person constructor called");
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    int rollNo;
    String name;

    Student(String name, int rollNo) {
        super(name);
        this.name = name;
        this.rollNo = rollNo;
        System.out.println("Student constructor called");
    }

    void show() {
        super.display();
        System.out.println("Student Name " + this.name);
        System.out.println("Roll No: " + rollNo);
    }
}

public class SuperDemo {
    public static void main(String[] args) {

        System.out.println("Enter name and roll number:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int rollNo = sc.nextInt();
        Student s1 = new Student(name, rollNo);
        s1.show();
    }
}
