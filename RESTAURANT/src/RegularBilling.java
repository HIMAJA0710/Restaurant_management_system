import java.util.*;
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