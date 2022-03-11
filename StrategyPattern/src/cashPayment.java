public class cashPayment implements Payment{
    @Override
    public void doPayment() {
        System.out.println("You paid in cash.");
    }
}
