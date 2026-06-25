public class MenuDisplay {

    public static void displayVegetarianMenu(IVegetarianMenu menu) {
        System.out.println("Vegetarian Menu:");
        for (String item : menu.getVegetarianItems()) {
            System.out.println("- " + item);
        }
    }

    public static void displayNonVegetarianMenu(INonVegetarianMenu menu) {
        System.out.println("\nNon-Vegetarian Menu:");
        for (String item : menu.getNonVegetarianItems()) {
            System.out.println("- " + item);
        }
    }

    public static void displayDrinksMenu(IDrinkMenu menu) {
        System.out.println("\nDrinks Menu:");
        for (String item : menu.getDrinkItems()) {
            System.out.println("- " + item);
        }
    }
}