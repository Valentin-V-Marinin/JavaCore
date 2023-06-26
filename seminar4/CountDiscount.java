package seminar4;

import java.util.Random;

public class CountDiscount {

    public static Order getDiscountPurchase(String phone, String title, int amount){

        Order order = Purchase.getPurchase(phone, title, amount);
        if (order.getCost() != 0) {
            Random random = new Random();
            int idx = random.nextInt(0,5);

            Discount discount = Discount.getRandomDiscount(idx);
            int valueDiscount = Discount.getValueDiscount(discount);
            System.out.println(discount);

            if (discount == Discount.DISCOUNT20 && order.getProduct().getCategory() == Category.PREMIUM) {
                try {
                    throw new TooMuchSaleException("This is the premium category product, maximum discount is 15%!");
                } catch (TooMuchSaleException e) {
                    System.out.println(e.getMessage());
                    valueDiscount = 0;
                }
            }

            double discountCost = order.getCost()*(1-valueDiscount*0.01);
            discountCost = Math.round(discountCost*100)/100 + Math.round(discountCost*100)%100*0.01;

            return new Order(order.getCustomer(), order.getProduct(), order.getAmount(), discountCost);
        } else {
            return new Order(null, null, 0, 0);
        }
    }
}
