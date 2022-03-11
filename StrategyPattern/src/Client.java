public class Client {
    Payment payment;
    public Client(Payment payment) {
        this.payment=payment;
    }

    public void execution(){
        payment.doPayment();
    }

    public static void main(String[] args) {
        Client bkashObj=new Client(new bkashPayment());
        bkashObj.execution();

        Client cashObj=new Client(new cashPayment());
        cashObj.execution();
        Client cardObj=new Client(new cardPayment());
        cardObj.execution();
    }
}
