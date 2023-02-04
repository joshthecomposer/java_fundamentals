import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] asses) {
    
        Order order1 = new Order();
        Order order2 = new Order();

        Order order3 =  new Order("Bill");
        Order order4 =  new Order("Dan");
        Order order5 =  new Order("Craig");

        Item item1 = new Item("Coffee", 19.00);
        Item item2 = new Item("Crackers", 9.00);
        Item item3 = new Item("Roll", 5.00);
        Item item4 = new Item("Cake", 4.2);


        order3.addItem(item1);
        order3.addItem(item2);


        order2.addItem(item2);
        order2.addItem(item3);
        order2.addItem(item4);


        order2.setIsReady();
        System.out.println(order2.getIsReady());

        System.out.println(order3.getIsReady());
    }
}