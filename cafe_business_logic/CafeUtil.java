import java.util.ArrayList;
import java.util.Arrays;
public class CafeUtil {
    
    int getStreakGoal(int numWeeks) {
        int count = 0;
        for(int i = 0; i <= numWeeks; i++) {
            count += i;
        }
        return count;
    }

    double getOrderTotal(double[] prices) {
        double cost = 0.0;
        for(double i : prices) {
            cost += i;
        }
        return cost;
    }

    void displayMenu(ArrayList<String> menuItems) {
        for(int i = 0; i < menuItems.size(); i++){
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName);
        System.out.println("There are " + customers.size() + " people in front of you");
        customers.add(userName);
        System.out.println(customers);
    }

    void addCustomers(ArrayList<String> customers) {
        while (true) {
            System.out.println("Enter customer name: ");
            String userName = System.console().readLine();
            if (userName.equals("q")) {
                break;
            }
            customers.add(userName);
            System.out.println(customers);
        }
    }

    void printPriceChart(String product, double price, int maxQuantity) {
        double n = 0.0;
        System.out.println(product);
        for(int i = 1; i <= maxQuantity; i++) {
            System.out.format("%d - %.2f %n", i, (price * i)-(n));
            n += 0.50;
        }
    }

    boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
        if (menuItems.size() != prices.size()) {
            return false;
        }
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.format("%d - %s - $%.2f%n", i, menuItems.get(i), prices.get(i));
        }
        return true;
    }
}
