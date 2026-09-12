import java.util.Scanner;

class LibraryBook {

    String title;
    String isbn;

    // Two-argument constructor
    public LibraryBook(String title, String isbn) {

        this.title = title;

        if (isbn == null || isbn.isEmpty()) {
            this.isbn = "PENDING";
        } else {
            this.isbn = isbn;
        }
    }

    // One-argument constructor
    public LibraryBook(String title) {

        this(title, "PENDING");
    }

    public void printStatus() {

        System.out.println(
            title + " | " + isbn + " | Catalogued: true"
        );
    }
}

public class LibraryCataloguing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] titles = {
            "Clean Code",
            "Untitled Draft",
            "1984",
            "Notes"
        };

        String[] isbns = {
            "978-0132350884",
            "",
            "9780451524935",
            ""
        };

        LibraryBook[] books =
                new LibraryBook[titles.length];

        // Single pass
        for (int i = 0; i < titles.length; i++) {

            if (isbns[i].isEmpty()) {
                books[i] = new LibraryBook(titles[i]);
            } else {
                books[i] =
                    new LibraryBook(titles[i], isbns[i]);
            }

            books[i].printStatus();
        }

        sc.close();
    }
}
