import java.util.Scanner;

class FeeAccount {

    void processPayment(double amount) {

        System.out.println(
            "Paid in one go (day-scholar account)"
        );
    }
}

class HostelFeeAccount extends FeeAccount {

    @Override
    void processPayment(double amount) {

        System.out.println(
            "Paid in two installments (hostel account)"
        );
    }
}

public class AccountBatchPayments {

    static void processPayment(
            FeeAccount account, double amount) {

        if (account instanceof HostelFeeAccount) {

            account.processPayment(amount);

        } else {

            account.processPayment(amount);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        FeeAccount[] accounts = {
            new HostelFeeAccount(),
            new HostelFeeAccount(),
            new FeeAccount(),
            new FeeAccount()
        };

        System.out.print("Enter payment amount: ");
        double amount = sc.nextDouble();

        int hostelCount = 0;
        int dayScholarCount = 0;

        // Single pass
        for (int i = 0; i < accounts.length; i++) {

            processPayment(accounts[i], amount);

            if (accounts[i] instanceof HostelFeeAccount) {
                hostelCount++;
            } else {
                dayScholarCount++;
            }
        }

        System.out.println(
            "Hostel accounts processed: " + hostelCount
            + " | Day-scholar accounts processed: "
            + dayScholarCount
        );

        sc.close();
    }
}
