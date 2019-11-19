public class HealthyHamburger extends Hamburger {

    private boolean bacon;
    private boolean sweetPotatoes;

    public HealthyHamburger(boolean lettuce, boolean tomato, boolean cheese, boolean mushrooms, boolean bacon, boolean sweetPotatoes) {
        super(lettuce, tomato, cheese, mushrooms);
        this.bacon= bacon;
        this.sweetPotatoes = sweetPotatoes;
    }

    public boolean isBacon() {
        return bacon;
    }

    public boolean isSweetPotatoes() {
        return sweetPotatoes;
    }

    @Override
    public int burgerPrice() {
       int baconPrice= 6;
       int sweetPotatoesPrice= 3;
       int healthyBurgerPrice= super.burgerPrice();

      if (bacon){
          healthyBurgerPrice += baconPrice;
      }
      if(sweetPotatoes){
          healthyBurgerPrice += sweetPotatoesPrice;
      }
        return healthyBurgerPrice;
    }
}
