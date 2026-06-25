import java.util.Arrays;
import java.util.List;

public class VegetarianMenu implements IVegetarianMenu {

    @Override
    public List<String> getVegetarianItems() {
        return Arrays.asList(
                "Vegetable Curry",
                "Paneer Tikka",
                "Salad"
        );
    }
}