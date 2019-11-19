public class Main {
    public static void main(String [] args){
        Hamburger baseHamburger = new Hamburger(true, true,false, true);
                 System.out.println("Ingredients:" + "\n" +
                "Bread Roll: "+ baseHamburger.isBreadRoll() + "\n"+
                "Meat: "+ baseHamburger.isMeat() + "\n"+
                "Lettuce: " + baseHamburger.isLettuce() + "\n"+
                "Tomato: "+ baseHamburger.isTomato()+ "\n"+
                "Cheese: "+ baseHamburger.isCheese() + "\n"+
                "Mushrooms: " + baseHamburger.isMushrooms() + "\n" );
        System.out.println("The price of the Base Hamburger with the Selected ingredients is: "+ baseHamburger.burgerPrice()+ " dollars");
        System.out.println("*********************************************************************");
        HealthyHamburger healthyHamburger = new HealthyHamburger(true, true, true, true, true, true);
        System.out.println("Ingredients:" + "\n" +
                "Bread Roll: "+ baseHamburger.isBreadRoll() + "\n"+
                "Meat: "+ baseHamburger.isMeat() + "\n"+
                "Lettuce: " + baseHamburger.isLettuce() + "\n"+
                "Tomato: "+ baseHamburger.isTomato()+ "\n"+
                "Cheese: "+ baseHamburger.isCheese() + "\n"+
                "Mushrooms: " + baseHamburger.isMushrooms() + "\n"+
                "Bacon; "+ healthyHamburger.isBacon() + "\n" +
                 "Sweet Potatoes; "+ healthyHamburger.isSweetPotatoes() + "\n");

        System.out.println("The price of the Healthy Hamburger with the selected ingredients is: " + healthyHamburger.burgerPrice());
        System.out.println("*********************************************************************");
        DeluxeHamburger deluxeHamburger = new DeluxeHamburger();
        System.out.println("Ingredients:" + "\n" +
                "Bread Roll: "+ deluxeHamburger.isBreadRoll() + "\n"+
                "Meat: "+ deluxeHamburger.isMeat() + "\n"+
                "Lettuce: " + deluxeHamburger.isLettuce() + "\n"+
                "Tomato: "+ deluxeHamburger.isTomato()+ "\n"+
                "Cheese: "+ deluxeHamburger.isCheese() + "\n"+
                "Mushrooms: " + deluxeHamburger.isMushrooms() + "\n" +
                 "Chips: "+ deluxeHamburger.isChips() + "\n"+
                  "Drink: " + deluxeHamburger.isDrink() + "\n" );

        System.out.println("The price of the deluxe hamburger with the selected ingredients is: " + deluxeHamburger.burgerPrice());


    }
}
