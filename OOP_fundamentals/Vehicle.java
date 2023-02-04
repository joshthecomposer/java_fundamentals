import java.util.Map;
public class Vehicle {
    public String make;
    public String model;
    public String color;
    public int year;

    public Vehicle(Map data) {
        this.make = (String) data.get("make");
        this.model = (String) data.get("model");
        this.color = (String) data.get("color");
        this.year = (int) data.get("year");
    }
}