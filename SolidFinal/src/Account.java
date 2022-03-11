public class Account {
    String name;
    String customerId;

    public Account(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    void confirmation() {
        System.out.println("Congratulations! Your account has been created");
        System.out.println("Your name is: " + name);
        System.out.println("Your id is: " + customerId);
    }

    void showMenu() {
        System.out.println("Here is our services: ");
        System.out.println("Press 'A' for Checking Balance");
        System.out.println("Press 'B' to Make a deposit");
        System.out.println("Press 'C' to Make a withdrawal");
        System.out.println("Press 'D' to View Previous Transaction");
        System.out.println("Press 'E' to Calculate Interest");
        System.out.println("Press 'F' to Apply for Loan");
        System.out.println("Press 'G' to exit");
    }

    void displayLoan()
    {
        System.out.println("1. Car Loan(25% interest rate for 3 years)\n2.Home Loan(30% interest rate for 10 years)\n3.Education Loan(10% interest rate for 20 years)");
    }
}
