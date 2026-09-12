import java.util.Scanner;

class Student {

    // Instance fields
    String name;
    double attendance;

    // Static fields
    static String collegeName =
            "SRM Institute of Science and Technology";

    static int studentCount = 0;

    // Constructor
    Student(String name, double attendance) {

        this.name = name;
        this.attendance = attendance;

        studentCount++;
    }

    // Static method
    static void printCollegeInfo() {

        System.out.println(collegeName);
        System.out.println("Students created: " + studentCount);
    }
}

public class StudentDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first student name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter first attendance: ");
        double attendance1 = sc.nextDouble();
        sc.nextLine();

        Student s1 = new Student(name1, attendance1);

        System.out.print("Enter second student name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter second attendance: ");
        double attendance2 = sc.nextDouble();

        Student s2 = new Student(name2, attendance2);

        System.out.println("\nCollege Information:");

        // Call static method using class name
        Student.printCollegeInfo();

        sc.close();
    }
}
