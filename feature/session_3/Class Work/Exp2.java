import java.util.Scanner;

class MessWallet {

    private double balance;

    // Constructor
    public MessWallet(double balance) {

        if (balance < 0) {
            System.out.println("Warning: negative opening balance. Starting at 0.");
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    // Add money
    public void topUp(double amount) {

        if (amount <= 0) {
            System.out.println("Top-up rejected: amount must be positive");
        } else {
            balance = balance + amount;
            System.out.println("Balance after top-up: " + balance);
        }
    }

    // Deduct money
    public void deduct(double amount) {

        if (amount > balance) {
            System.out.println("Deduct rejected: insufficient balance");
        } else if (amount <= 0) {
            System.out.println("Deduct rejected: amount must be positive");
        } else {
            balance = balance - amount;
            System.out.println("Balance after deduction: " + balance);
        }
    }

    // Read-only access
    public double getBalance() {
        return balance;
    }
}

public class MessWalletDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter opening balance: ");
        double opening = sc.nextDouble();

        MessWallet wallet = new MessWallet(opening);

        System.out.print("Enter top-up amount: ");
        double topUpAmount = sc.nextDouble();

        wallet.topUp(topUpAmount);

        System.out.print("Enter deduction amount: ");
        double deductAmount = sc.nextDouble();

        wallet.deduct(deductAmount);

        System.out.println("Final balance: " + wallet.getBalance());

        sc.close();
    }
}
