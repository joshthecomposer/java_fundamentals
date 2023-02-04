import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] asses) {
    
        // Menu items
        Item item1 = new Item("Coffee", 9.00);
        Item item2 = new Item("Soda", 13.45);
        Item item3 = new Item("Muffin", 20.00);
        Item item4 = new Item("Croissant", 21.00);

        // Order variables -- order1, order2 etc.
        Order order1 = new Order("Bill");
        Order order2 = new Order("Sally");
        Order order3 = new Order("Brian");
        Order order4 = new Order("Spud");

        order2.items.add(item1);
        order2.total += item1.price;

        order3.items.add(item3);
        order3.total += item3.price;

        order4.items.add(item4);
        order4.total += item4.price;

        order1.ready = true;
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
    }
}