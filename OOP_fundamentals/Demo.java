import java.util.Map;
public class Demo {
    public static void main(String[] args) {
        Map<String, Object> data =
            Map.of(
                "make", "Ford",
                "model", "Memer",
                "color", "Black",
                "year", 2000
            );
        Vehicle vehicle = new Vehicle(data);

        String myVehicle = String.format("This vehicle is a %s %s %s made in %d", vehicle.color, vehicle.make, vehicle.model, vehicle.year);
        System.out.println(myVehicle);
    }
}