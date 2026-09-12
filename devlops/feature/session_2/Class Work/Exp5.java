import java.util.Scanner;

public class MaskedPhoneNumber {

    static String maskPhoneNumber(String phone) {

        // Check length
        if (phone.length() != 10) {
            return "Invalid phone number";
        }

        // Check whether every character is a digit
        for (int i = 0; i < phone.length(); i++) {

            if (!Character.isDigit(phone.charAt(i))) {
                return "Invalid phone number";
            }
        }

        // Get last four digits
        String lastFour = phone.substring(6);

        // Create masked number
        StringBuilder result = new StringBuilder("XXXXXX");

        // Insert '-' before last four digits
        result.insert(6, "-");

        result.append(lastFour);

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();

        System.out.println(maskPhoneNumber(phone));

        sc.close();
    }
}
