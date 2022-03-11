public abstract class AddOns extends Drink {
    Drink drink;

    public AddOns(Drink drink) {
        this.drink = drink;
    }

    public abstract void calculatePrice();
}
