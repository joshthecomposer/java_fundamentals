import java.util.ArrayList;

public class CoffeeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    public CoffeKiosk() {
        this(new ArrayList<Item>(), new ArrayList<Order>());
    }

    public CoffeKiosk(ArrayList<Item> items, ArrayList<Order> orders) {
        this.items = items;
        this.orders = orders;
    }

    public void addMenuItem(String name, double price) {
        Item item = new Item(name, price);
        this.menu.add(item);
        item.setIndex(this.menu.indexOf(item));
    }
}