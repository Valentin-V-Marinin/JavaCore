package seminar4;

public class Purchase {
    static Customer[] customers;
    static Product[] products;


    public static Order getPurchase(String phone, String title, int amount) {
        Customer customer = null;
        Product product = null;

        for (Customer c: customers) {
            if (c.getPhone().equals(phone)){
                customer = c;
            }
        }

        for (Product p: products) {
            if (p.getTitle().equals(title)){
                product = p;
            }
        }

        try {
            if (product == null){
                throw new ProductException("There is no such product: " + title);
            }

            if (amount <1 || amount >100){
                throw new AmountException("The amount is incorrect.");
            }

            if (customer == null){
                throw new CustomerException("There is no such customer.");
            }
        } catch (ProductException e) {
            System.out.println(e.getMessage());
        } catch (AmountException e) {
            System.out.println(e.getMessage() + " (" + amount + ")");
            amount = 1;
        } catch (CustomerException e) {
            e.printStackTrace();
            System.exit(1);
        }

        if (product == null || customer == null) {
            return new Order(null, null, 0, 0);
        } else {
            return new Order(customer, product, amount, Math.round(amount * product.getPrice()*100)*0.01);
        }
    }

}
