package seminar4;

public class Main {

    public static void main(String[] args) {
        final int NUMBER_PURCHASE = 5;

        Purchase.customers = new Customer[]{
                new Customer("Сергей", "Петров", Gender.MALE, 32, "89451236985"),
                new Customer("Татьяна", "Сидихина", Gender.FEMALE, 27, "89501233336")
        };

        Purchase.products = new Product[]{
                new Product("Milk", 65.7, Category.STANDART),
                new Product("Bread", 34.9, Category.STANDART),
                new Product("Meat", 320.5, Category.STANDART),
                new Product("Coffee", 1399.0, Category.PREMIUM),
                new Product("Cucumber", 60.65, Category.STANDART)
        };

        Order[] orders = new Order[NUMBER_PURCHASE];

        orders[0] = Purchase.getPurchase(Purchase.customers[0].getPhone(),
                Purchase.products[0].getTitle(), 2);
        orders[1] = Purchase.getPurchase(Purchase.customers[1].getPhone(),
                Purchase.products[1].getTitle(), 102);
//     Отсутствует покупатель, приложение по условию задания завершит работу
//        orders[2] = Purchase.getPurchase("88451236985", "Milk", 5);
        orders[2] = Purchase.getPurchase(Purchase.customers[0].getPhone(),Purchase.products[3].getTitle(), -5);
        orders[3] = Purchase.getPurchase(Purchase.customers[1].getPhone(),"Water", 12);
        orders[4] = Purchase.getPurchase(Purchase.customers[1].getPhone(),
                Purchase.products[4].getTitle(), 7);

        int counter = 0;
        for (Order o: orders) {
            if (o.getCost() != 0) counter++;
            System.out.println(o);
        }

        System.out.println("Количество совершенных покупок: " + counter);
        System.out.println("-----------------------------------------  SALE  -----------------------------------------------------------------");


        Order[] discountorders = new Order[NUMBER_PURCHASE-2];
        discountorders[0] = CountDiscount.getDiscountPurchase(Purchase.customers[0].getPhone(), Purchase.products[3].getTitle(), 1);
        discountorders[1] = CountDiscount.getDiscountPurchase(Purchase.customers[1].getPhone(), Purchase.products[1].getTitle(), 111);
        discountorders[2] = CountDiscount.getDiscountPurchase(Purchase.customers[0].getPhone(), Purchase.products[0].getTitle(), 2);

        counter = 0;
        for (Order o: discountorders) {
            if (o.getCost() != 0) counter++;
            System.out.println(o);
        }

    }
}
