import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    public Order() {
        this("Guest", false, new ArrayList<Item>());
    }

    public Order(String name, boolean ready, ArrayList<Item> items) {
        this.name = name;
        this.ready = ready;
        this.items = items;
    }

    public Order(String name) {
        this.name = name;
        this.ready = false;
        this.items = new ArrayList<Item>();
    }

    //setters
    public void setIsReady() {
        this.ready = true;
    }

    public void setNotReady() {
        this.ready = false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    //getters

    public String getName() {
        return this.name;
    }

    public String getIsReady() {
        if (this.ready) {
            return "Your order is ready!";
        }
        return "Your order will be ready soon.";
    }

    public double getOrderTotal() {
        double result = 0.0;
        for(Item item : this.items) {
            result += item.getPrice();
        }
        return result;
    }

    public void display() {
        System.out.printf("Customer name : %s\n", this.name);
        for(Item item : this.items) {
            System.out.printf("%s - %.2f\n", item.getName(), item.getPrice());
        }
        System.out.printf("Total : %.2f\n", this.getOrderTotal());
        System.out.println("=================================");
    }
}