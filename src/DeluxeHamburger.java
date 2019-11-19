public class DeluxeHamburger extends Hamburger {
    private boolean chips;
    private boolean drink;

    public DeluxeHamburger() {
        super(true, true, true, true);
        this.chips= true;
        this.drink = true;
    }

    public boolean isChips() {
        return chips;
    }

    public boolean isDrink() {
        return drink;
    }

    @Override
    public int burgerPrice() {
        int drinkPrice = 2;
        int chipsPrice = 2;
        int deluxeBurgerPrice= super.burgerPrice() + drinkPrice + chipsPrice;
        return deluxeBurgerPrice;
    }
}
