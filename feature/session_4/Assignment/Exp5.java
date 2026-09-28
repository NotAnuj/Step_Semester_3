class Payment {

    void pay(double amount) {
        System.out.println(
            "Paid (cash): Rs " + amount
        );
    }
}

class CardPayment extends Payment {

    void payWithProcessingFee(double amount) {

        double total = amount + (amount * 0.02);

        System.out.println(
            "Charged (card, incl. fee): Rs " + total
        );
    }
}

public class Main {

    static double processTransaction(
            Payment payment,
            double amount) {

        double chargedAmount;

        if (payment instanceof CardPayment) {

            CardPayment card =
                (CardPayment) payment;

            chargedAmount =
                amount + (amount * 0.02);

            card.payWithProcessingFee(amount);

        } else {

            payment.pay(amount);

            chargedAmount = amount;
        }

        return chargedAmount;
    }

    public static void main(String[] args) {

        Payment[] payments = {
            new CardPayment(),
            new Payment(),
            new CardPayment(),
            new Payment(),
            new CardPayment()
        };

        double[] amounts = {
            100, 50, 200, 75, 120
        };

        double totalCollected = 0;

        for (int i = 0; i < payments.length; i++) {

            double charged =
                processTransaction(
                    payments[i],
                    amounts[i]
                );

            totalCollected =
                totalCollected + charged;
        }

        System.out.println(
            "Total Collected: Rs "
            + totalCollected
        );
    }
}
