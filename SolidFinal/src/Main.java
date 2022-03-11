import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Press 'Y' if you want to open an account Press 'N' if not.");
        char c = '\0';
        Scanner scanner = new Scanner(System.in);
        c = scanner.next().charAt(0);
        char c1 = Character.toUpperCase(c);


        while (c1 == 'Y') {
            System.out.println("Welcome to our ATM service.");
            System.out.println("Please Enter your Name: ");
            String n = scanner.next();
            System.out.println("Enter your ID: ");
            String id = scanner.next();
            Account account = new Account(n, id);
            account.confirmation();


            System.out.println("Continue to check out our services? Y/N");
            char c2 = scanner.next().charAt(0);
            char c3 = Character.toUpperCase(c2);

            if (c3 == 'Y') {
                Services services = new Services();

                char option;
                do {
                    account.showMenu();

                    System.out.println("Enter an option: ");
                    char option1 = scanner.next().charAt(0);
                    option = Character.toUpperCase(option1);
                    System.out.println();

                    switch (option) {
                        case 'A':
                            System.out.println("Balance = $" + services.getBalance());
                            break;
                        case 'B':
                            System.out.println("Enter an amount to deposit: ");
                            int amount = scanner.nextInt();
                            services.deposit(amount);
                            System.out.println();
                            break;
                        case 'C':
                            System.out.println("Enter an amount to withdraw : ");
                            int amount2 = scanner.nextInt();
                            services.withdraw(amount2);
                            System.out.println();
                            break;
                        case 'D':
                            System.out.println();
                            services.getPreviousTransaction();
                            System.out.println();
                            break;
                        case 'E':
                            System.out.println("Enter your expected interest rate in percent= ");
                            double r = scanner.nextDouble();
                            System.out.println("Enter how many years for interest : ");
                            double y = scanner.nextDouble();
                            System.out.println("The current interest rate is " + r + "%");
                            System.out.println("After " + y + " years, your balance will be $" + services.calculateInterest(r, y));
                            break;
                        case 'F':
                            System.out.println("Select which type of loan you want: ");
                            account.displayLoan();
                            int num = scanner.nextInt();
                            if (num == 1) {
                                CarLoan carLoan = new CarLoan();
                                carLoan.loanConfirmation();
                                System.out.println("Enter the loan amount : ");
                                double a = scanner.nextDouble();
                                System.out.println("Please pay " + carLoan.calculateLoanAmount(a) + " within next 3 years.");
                            } else if (num == 2) {
                                HomeLoan homeLoan = new HomeLoan();
                                homeLoan.loanConfirmation();
                                System.out.println("Enter the loan amount : ");
                                double a = scanner.nextDouble();
                                double ab = homeLoan.calculateLoanAmount(a);
                                System.out.println(ab);
                                System.out.println("Please pay " + homeLoan.calculateLoanAmount(a) + " within next 10 years.");
                            } else if (num == 3) {
                                EducationLoan educationLoan = new EducationLoan();
                                educationLoan.loanConfirmation();
                                System.out.println("Enter the loan amount : ");
                                double a = scanner.nextDouble();
                                System.out.println("Please pay " + educationLoan.calculateLoanAmount(a) + " within next 20 years.");
                            } else
                                System.out.println("Invalid input. Please choose between 1,2 and 3.");
                            break;
                        case 'G':
                            System.out.println();
                            break;
                        default:
                            System.out.println("Invalid option.");
                    }
                } while (option != 'G');
                if (option == 'G')
                    break;
            } else
                break;

        }
        System.out.println("Thank you for using our service.");
    }
}
