import java.util.ArrayList;

public class CoffeeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    public CoffeeKiosk() {
        this(new ArrayList<Item>(), new ArrayList<Order>());
    }

    public CoffeeKiosk(ArrayList<Item> menu, ArrayList<Order> orders) {
        this.menu = menu;
        this.orders = orders;
    }

    public void addMenuItem(String name, double price) {
        Item item = new Item(name, price);
        this.menu.add(item);
        item.setIndex(this.menu.indexOf(item));
    }

    public void addMenuItemByInput() {
        System.out.println("Do you want to add a new item to the menu? y or n");
        String answer = System.console().readLine();
        if (answer.equals("y")) {
            Item item = new Item();
            System.out.println("Okay, what's the new item called?");
            String name = System.console().readLine();
            item.setName(name);
            System.out.println("What's the price?");
            String price = System.console().readLine();
            item.setPrice(Double.parseDouble(price));
            System.out.printf("Okay, %s is being added to teh menu at a price of %.2f\n", item.getName(), item.getPrice());

            this.menu.add(item);
            item.setIndex(this.menu.indexOf(item));

            displayMenu();
            return;
        }
    }

    public void displayMenu() {
        System.out.println("=====================");
        for(Item item : this.menu) {
            System.out.printf("%d - %s : %.2f\n", item.getIndex(), item.getName(), item.getPrice());
        }
        System.out.println("=====================");
    }

    public void newOrder() {
        
    	// Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();

        if (name.equals("admin")) {
            addMenuItemByInput();
            return;
        }
    	// Your code:
        // Create a new order with the given input string
        Order newOrder = new Order(name);
        System.out.printf("Okay %s, Here is the menu\n", name);
        // Show the user the menu, so they can choose items to add.
        this.displayMenu();
    
        String itemNumber = new String();
        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
            // Prompts the user to enter an item number
            System.out.println("Please enter a menu item index or q to quit:");
            // Get the item object from the menu, and add the item to the order
            itemNumber = System.console().readLine();
            if (itemNumber.equals("q")) {
                newOrder.display();
                return;
            }
            Item item = this.menu.get(Integer.parseInt(itemNumber));
            newOrder.addItem(item);
            System.out.printf("%s added to order.\n", item.getName());
            // Ask them to enter a new item index or q again, and take their input
        }

        // After you have collected their order, print the order details 
    	// as the example below. You may use the order's display method.
    }

}