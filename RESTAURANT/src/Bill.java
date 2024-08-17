
class Bill {
    private BillingStrategy billingStrategy;

    public void setBillingStrategy(BillingStrategy billingStrategy) {
        this.billingStrategy = billingStrategy;
    }

    public double generateBill(Order order) {
        return billingStrategy.calculateTotal(order.getItems());
    }
}
