public class Main {
    public static void main(String[] args) {
        Drink drink=new Sugar(new Milk(new Espresso()));

        System.out.println(drink.price);
    }
}
