public class Sugar extends AddOns{
    public Sugar(Drink drink) {
        super(drink);
        calculatePrice();
        System.out.println(" Sugar ");
    }

    @Override
    public void calculatePrice() {
        price=drink.price+15;
    }
}
