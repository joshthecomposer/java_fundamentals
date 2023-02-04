public class Item {
    private String name;
    private double price;

    public Item() {
        this("Void", 0.0);
    }
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //setters 
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //getters

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
}