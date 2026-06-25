public class Main {

    public static void main(String[] args) {

        VegetarianMenu vegMenu = new VegetarianMenu();
        NonVegetarianMenu nonVegMenu = new NonVegetarianMenu();
        DrinkMenu drinkMenu = new DrinkMenu();

        MenuDisplay.displayVegetarianMenu(vegMenu);
        MenuDisplay.displayNonVegetarianMenu(nonVegMenu);
        MenuDisplay.displayDrinksMenu(drinkMenu);
    }
}