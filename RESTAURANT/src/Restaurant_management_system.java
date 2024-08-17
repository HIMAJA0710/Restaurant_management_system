
public class Restaurant_management_system {
    public static void main(String[] args) {
        Restaurant r = new Restaurant();
        r.setNameLocation("ABC Hotel", "DCE Colony");
        System.out.println(r.getNameLocation());

        Menu menu = new Menu();
        menu.addDish("Noodles", 40.00);
        menu.addDish("Manchuria", 55.00);
        menu.addDish("Pizza", 50.0);
        menu.addDish("Chicken",100.0);
        menu.addDrink("Coke", 2.5);
        menu.addDrink("Water", 1.0);

        Order o = new Order();
        o.addItem(menu.getDish("Chicken"));
        o.addItem(menu.getDish("Pizza"));
        o.addItem(menu.getDrink("Coke"));
        o.printOrderDetails();

        Bill b = new Bill();
        b.setBillingStrategy(new RegularBilling());
        System.out.println("Total (Regular Billing): $" + b.generateBill(o));

        b.setBillingStrategy(new DiscountBilling());
        System.out.println("Total (Discounted Billing): $" + b.generateBill(o));
    }
}


