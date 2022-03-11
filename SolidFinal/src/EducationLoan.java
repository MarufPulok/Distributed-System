public class EducationLoan implements LoanService {
    double amount;
    @Override
    public double calculateLoanAmount(double amount) {
        this.amount =  amount+(amount*(10.0/100.0)*20.0);
        return this.amount;
    }

    @Override
    public void loanConfirmation() {
        System.out.println("Education Loan Confirmed!");
    }
}
