package seminar4;

public class Order {
    private Customer customer;
    private Product product;
    private int amount;
    private double cost;


    public Order(Customer customer, Product product, int amount, double cost) {
        this.customer = customer;
        this.product = product;
        this.amount = amount;
        this.cost = cost;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Orders' list : "
        +      "  customer: " + PrintFormat.printStrFormatted((customer == null ? "null" : customer.getLastName()), 15)
        +      "  product: " + PrintFormat.printStrFormatted((product == null ? "null" : product.getTitle()), 10)
        +      "  quantity: " + PrintFormat.printStrFormatted(String.valueOf(amount), 10)
        +      "  cost: " + PrintFormat.printStrFormatted(String.valueOf(cost), 8);
    }
}
