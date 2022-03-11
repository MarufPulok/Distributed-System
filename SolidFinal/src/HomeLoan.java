public class HomeLoan implements LoanService {

    @Override
    public double calculateLoanAmount(double amount) {
        return amount+(amount*(30.0/100.0)*10.0);
    }

    @Override
    public void loanConfirmation() {
        System.out.println("Home Loan Confirmed!");
    }
}
