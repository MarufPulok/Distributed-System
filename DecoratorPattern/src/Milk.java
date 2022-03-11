public class Milk extends AddOns{
    public Milk(Drink drink) {
        super(drink);
        calculatePrice();
        System.out.print(" Milk +");
    }

    @Override
    public void calculatePrice() {
        price=drink.price+10;
    }
}
