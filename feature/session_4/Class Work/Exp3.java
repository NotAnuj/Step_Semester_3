import java.util.Scanner;

class FeeAccount {

    String regNo;
    double totalFee;

    FeeAccount(String regNo, double totalFee) {

        this.regNo = regNo;
        this.totalFee = totalFee;
    }

    // final method
    final double calculateLateFee(int daysLate) {

        return totalFee * daysLate * 0.01;
    }

    // final method
    final void printSummary(int daysLate) {

        if (daysLate <= 0) {

            System.out.println(
                regNo + " - On time, no late fee"
            );

        } else {

            double lateFee =
                    calculateLateFee(daysLate);

            System.out.println(
                regNo +
                " | Total Fee: Rs " + totalFee +
                " | Late Fee: Rs " + lateFee
            );
        }
    }
}

public class LateFeeBatch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] regNos = {
            "RA001", "RA002", "RA003", "RA004"
        };

        double[] totalFees = {
            200000, 150000, 180000, 220000
        };

        int[] daysLate = {
            10, 0, -2, 5
        };

        // Single pass
        for (int i = 0; i < regNos.length; i++) {

            FeeAccount account =
                new FeeAccount(regNos[i], totalFees[i]);

            account.printSummary(daysLate[i]);
        }

        sc.close();
    }
}
