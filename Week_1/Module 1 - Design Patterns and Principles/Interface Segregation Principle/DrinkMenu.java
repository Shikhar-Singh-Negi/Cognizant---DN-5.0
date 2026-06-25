import java.util.Arrays;
import java.util.List;

public class DrinkMenu implements IDrinkMenu {

    @Override
    public List<String> getDrinkItems() {
        return Arrays.asList(
                "Water",
                "Soda",
                "Juice"
        );
    }
}