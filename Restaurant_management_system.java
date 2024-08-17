import java.util.*;

public class Restaurant_management_system {
    public static void main(String[] args) {
        Restaurant r = new Restaurant();
        r.setNameLocation("ABC Hotel", "DCE Colony");
        System.out.println(r.getNameLocation());

        Menu menu = new Menu();
        menu.addDish("Pasta", 12.5);
        menu.addDish("Pizza", 15.0);
        menu.addDrink("Coke", 2.5);
        menu.addDrink("Water", 1.0);

        Order o = new Order();
        o.addItem(menu.getDish("Pasta"));
        o.addItem(menu.getDrink("Coke"));
        o.printOrderDetails();

        Bill b = new Bill();
        b.setBillingStrategy(new RegularBilling());
        System.out.println("Total (Regular Billing): $" + b.generateBill(o));

        b.setBillingStrategy(new DiscountedBilling());
        System.out.println("Total (Discounted Billing): $" + b.generateBill(o));
    }
}

class Restaurant {
    private String rname;
    private String rlocation;

    public String getNameLocation() {
        return rname + ", " + rlocation;
    }

    public void setNameLocation(String rname, String rlocation) {
        this.rname = rname;
        this.rlocation = rlocation;
    }
}

class Menu {
    private List<Dish> dishes = new ArrayList<>();
    private List<Drink> drinks = new ArrayList<>();

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

class Order {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public void printOrderDetails() {
        System.out.println("Order Details:");
        for (Item item : items) {
            System.out.println("- " + item.getName() + ": $" + item.getPrice());
        }
    }
}

abstract class Item {
    protected String name;
    protected double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Dish extends Item {
    public Dish(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Drink extends Item {
    public Drink(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

interface BillingStrategy {
    double calculateTotal(List<Item> items);
}

class RegularBilling implements BillingStrategy {
    @Override
    public double calculateTotal(List<Item> items) {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }
}

class DiscountedBilling implements BillingStrategy {
    @Override
    public double calculateTotal(List<Item> items) {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total * 0.9;
    }
}

class Bill {
    private BillingStrategy billingStrategy;

    public void setBillingStrategy(BillingStrategy billingStrategy) {
        this.billingStrategy = billingStrategy;
    }

    public double generateBill(Order order) {
        return billingStrategy.calculateTotal(order.getItems());
    }
}

