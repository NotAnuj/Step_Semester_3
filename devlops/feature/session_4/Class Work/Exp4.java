import java.util.Scanner;

class SrmStudent {

    static String collegeName;
    static String academicYear;

    String studentName;

    // Static block
    static {

        collegeName =
            "SRM Institute of Science and Technology";

        academicYear = "2026-2027";

        System.out.println("College info loaded");
    }

    // Constructor
    SrmStudent(String studentName) {

        this.studentName = studentName;

        System.out.println(
            "Student record created: " + studentName
        );
    }
}

public class SrmStudentDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = {
            "Ravi",
            "Meera",
            "Karthik",
            "Divya",
            "Anitha"
        };

        SrmStudent[] students =
                new SrmStudent[names.length];

        for (int i = 0; i < names.length; i++) {

            students[i] =
                new SrmStudent(names[i]);
        }

        sc.close();
    }
}
