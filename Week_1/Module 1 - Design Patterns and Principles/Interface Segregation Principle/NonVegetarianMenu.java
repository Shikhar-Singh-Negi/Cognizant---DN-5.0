import java.util.Arrays;
import java.util.List;

public class NonVegetarianMenu implements INonVegetarianMenu {

    @Override
    public List<String> getNonVegetarianItems() {
        return Arrays.asList(
                "Chicken Curry",
                "Fish Fry",
                "Mutton Biryani"
        );
    }
}