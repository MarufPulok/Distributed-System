public class CarLoan implements LoanService {



    @Override
    public double calculateLoanAmount(double amount) {
        return amount+(amount*(25.0/100.0)*3.0);
    }

    @Override
    public void loanConfirmation() {
        System.out.println("Car Loan Confirmed!");
    }
}
