import java.util.Scanner;

class IdCard {

    String name;
    int booksIssued;

    IdCard(String name, int booksIssued) {

        this.name = name;
        this.booksIssued = booksIssued;
    }
}

public class IdCardDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        IdCard ravi = new IdCard(name, 0);

        // Reference copy
        IdCard duplicate = ravi;

        // Change through second reference
        duplicate.booksIssued = 3;

        // Separate object
        IdCard separate = new IdCard(name, 3);

        System.out.println(
            name + "'s booksIssued (via first variable): "
            + ravi.booksIssued
        );

        System.out.println(
            "duplicate == ravi: " + (duplicate == ravi)
        );

        System.out.println(
            "separate == ravi: " + (separate == ravi)
        );

        sc.close();
    }
}
