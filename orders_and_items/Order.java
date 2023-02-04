import java.util.ArrayList;

public class Order {
    public String name;
    public double total;
    boolean ready;
    ArrayList<Item> items;

    public Order(String name) {
        this.name = name;
        this.total = 0.0;
        this.ready = false;
        this.items = new ArrayList<Item>();
    }
}