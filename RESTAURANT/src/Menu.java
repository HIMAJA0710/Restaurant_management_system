import java.util.*;
class Menu {
    private final List<Dish>dishes = new ArrayList<>();
    private final List<Drink>drinks = new ArrayList<>();

    public void addDish(String name, double price) {
        dishes.add(new Dish(name, price));
    }

    public void addDrink(String name, double price) {
        drinks.add(new Drink(name, price));
    }

    public Dish getDish(String name) {
        for (Dish dish : dishes) {
            if (dish.getName().equals(name)) {
                return dish;
            }
        }
        return null;
    }
public Drink getDrink(String name) {
        for (Drink drink : drinks) {
            if (drink.getName().equals(name)) {
                return drink;
            }
        }
        return null;
    }
}