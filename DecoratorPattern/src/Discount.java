public class Discount extends AddOns {

    public Discount(Drink drink) {
        super(drink);
    }

    @Override
    public void calculatePrice() {
        price=drink.price-5;
    }
}
