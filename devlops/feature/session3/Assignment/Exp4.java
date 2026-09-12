import java.util.Scanner;

class HallTicket {

    String studentName;
    int seatNumber;

    HallTicket(String studentName, int seatNumber) {

        this.studentName = studentName;
        this.seatNumber = seatNumber;
    }
}

public class HallTicketDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        HallTicket priya =
                new HallTicket(name, 0);

        // Reference copy
        HallTicket copy = priya;

        System.out.print("Enter new seat number: ");
        int seat = sc.nextInt();

        // Change through second reference
        copy.seatNumber = seat;

        // Create separate object
        HallTicket separate =
                new HallTicket(name, seat);

        System.out.println(
            name + "'s seatNumber (via first variable): "
            + priya.seatNumber
        );

        System.out.println(
            "copy == priya: " + (copy == priya)
        );

        System.out.println(
            "separate == priya: " + (separate == priya)
        );

        sc.close();
    }
}
