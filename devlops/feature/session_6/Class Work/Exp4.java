class LibraryMember {
    protected String memberId;
    protected int borrowLimit;
    protected int booksBorrowed;

    public LibraryMember(String memberId, int borrowLimit) {
        if (memberId == null || memberId.trim().length() < 4 || borrowLimit <= 0) {
            throw new IllegalArgumentException();
        }

        this.memberId = memberId;
        this.borrowLimit = borrowLimit;
    }

    public void borrowBook() {
        if (booksBorrowed < borrowLimit) {
            booksBorrowed++;
        }
    }

    public int getBooksBorrowed() {
        return booksBorrowed;
    }

    public void displayInfo() {
        System.out.println(
            "General | Books: " + booksBorrowed
        );
    }
}

class StudentMember extends LibraryMember {
    private String course;

    public StudentMember(String memberId, int borrowLimit, String course) {
        super(memberId, borrowLimit);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public void displayInfo() {
        System.out.println(
            "Student | Course: " + course +
            " | Books: " + booksBorrowed
        );
    }
}

public class Main {
    static String batchPrint(LibraryMember[] members) {
        StringBuilder report = new StringBuilder();

        for (LibraryMember member : members) {
            member.displayInfo();

            if (member instanceof StudentMember) {
                StudentMember student = (StudentMember) member;

                report.append(
                    "Student | Course: " +
                    student.getCourse() +
                    " | Books: " +
                    student.getBooksBorrowed() +
                    " [Course via downcast: " +
                    student.getCourse() +
                    "] | "
                );
            } else {
                report.append(
                    "General | Books: " +
                    member.getBooksBorrowed() +
                    " | "
                );
            }
        }

        return report.toString();
    }

    public static void main(String[] args) {
        LibraryMember[] members = {
            new LibraryMember("LB5", 3),
            new StudentMember("STU6", 3, "ECE")
        };

        System.out.println(batchPrint(members));

        LibraryMember plain =
            new LibraryMember("LB6", 3);

        if (plain instanceof StudentMember) {
            StudentMember bad = (StudentMember) plain;
        }
    }
}
