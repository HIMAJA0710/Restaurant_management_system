import java.util.*;
class Order {
    private final List<Item>items = new ArrayList<>();

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