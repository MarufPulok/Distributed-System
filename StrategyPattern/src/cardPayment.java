public class cardPayment implements Payment{
    @Override
    public void doPayment() {
        System.out.println("You paid in card.");
    }
}
