public class Services {
    double balance;
    double previousTransaction;


    void deposit(int amount) {
        if (amount != 0) {
            balance += amount;
            previousTransaction = amount;

        }
    }


    void withdraw(int amount) {
        if (amount <= balance) {
            if (amount != 0) {
                balance -= amount;
                previousTransaction = -amount;
            }
        } else
            System.out.println("Insufficient Balance.");
    }

    void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited : " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn : " + Math.abs(previousTransaction));
        } else {
            System.out.println("No Transaction Occurred.");
        }
    }


    double calculateInterest(double rate, double year) {
        double newBalance = (balance * year * (rate / 100)) + balance;
        return newBalance;
    }

    public double getBalance() {
        return balance;
    }

}
