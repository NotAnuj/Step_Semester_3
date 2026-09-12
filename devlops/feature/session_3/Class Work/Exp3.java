import java.util.Scanner;

class Course {

    String code;
    String title;
    int credits;
    int labCredits;

    // Four-argument constructor
    public Course(String code, String title, int credits, int labCredits) {

        this.code = code;
        this.title = title;
        this.credits = credits;
        this.labCredits = labCredits;
    }

    // Three-argument constructor
    public Course(String code, String title, int credits) {

        this(code, title, credits, 0);
    }

    // Calculate total credits
    public int totalCredits() {

        return credits + labCredits;
    }
}

public class CourseDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter theory course code: ");
        String code1 = sc.nextLine();

        System.out.print("Enter theory course title: ");
        String title1 = sc.nextLine();

        System.out.print("Enter theory credits: ");
        int credits1 = sc.nextInt();
        sc.nextLine();

        Course theoryCourse =
                new Course(code1, title1, credits1);

        System.out.print("Enter lab course code: ");
        String code2 = sc.nextLine();

        System.out.print("Enter lab course title: ");
        String title2 = sc.nextLine();

        System.out.print("Enter lab course credits: ");
        int credits2 = sc.nextInt();

        System.out.print("Enter lab credits: ");
        int labCredits = sc.nextInt();

        Course labCourse =
                new Course(code2, title2, credits2, labCredits);

        System.out.println();
        System.out.println(
            theoryCourse.code + " total credits: "
            + theoryCourse.totalCredits()
        );

        System.out.println(
            labCourse.code + " total credits: "
            + labCourse.totalCredits()
        );

        sc.close();
    }
}
