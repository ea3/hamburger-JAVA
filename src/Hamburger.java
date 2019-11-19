public class Hamburger {

    private boolean breadRoll = true;
    private boolean meat = true;
    private boolean lettuce;
    private boolean tomato;
    private boolean cheese;
    private boolean mushrooms;

    public Hamburger(boolean lettuce, boolean tomato, boolean cheese, boolean mushrooms) {
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.cheese = cheese;
        this.mushrooms = mushrooms;
    }

    public boolean isBreadRoll() {
        return breadRoll;
    }

    public boolean isMeat() {
        return meat;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isMushrooms() {
        return mushrooms;
    }

    public int burgerPrice(){
        int burgerPrice = 10;
        int lettucePrice = 1;
        int tomatoPrice= 2;
        int cheesePrice= 3;
        int mushroomsPrice= 4;

        if(lettuce){
            burgerPrice += lettucePrice;
        }
        if(tomato){
            burgerPrice += tomatoPrice;
        }
        if(cheese){
            burgerPrice+= cheesePrice;
        }
        if(mushrooms){
            burgerPrice+= mushroomsPrice;
        }

        return burgerPrice;

    }
}
