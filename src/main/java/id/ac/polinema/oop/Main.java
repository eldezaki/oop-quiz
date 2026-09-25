package id.ac.polinema.oop;

/**
 * Manual playground — NOT graded.
 *
 * After you complete the skeleton classes and create OrderItem, Order,
 * and Cashier, write your demo scenario here (see "Try the App Manually"
 * in the README) and run:
 *
 *   mvn -q compile exec:java
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Complete the classes first, then write your demo here.");
        Menu menu = new Menu();
        menu.addMenuItem(new MenuItem("Sate", 15000));
        menu.addMenuItem(new MenuItem("Es Teh Anget", 5000));
        menu.addMenuItem(new MenuItem("Spicy Lemonade", 20000));

        Customer Eris = new Customer("C001", "Eris");
        Order order = new Order(Eris);
        order.addItem(menu.findItem("Sate"), 2);

        Cashier cashier = new Cashier();
        double cash = 50000;

        System.out.println("Customer : " + order.getCustomer().getName());
        System.out.println("Total    : " + order.getTotal());
        System.out.println("Payable  : " + order.getFinalTotal());
        System.out.println("Cash     : " + cash);
        System.out.println("Change   : " + cashier.calculateChange(order, cash));
}
    }
}
