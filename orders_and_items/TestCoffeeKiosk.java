public class TestCoffeeKiosk {
    public static void main(String[] args) {
        CoffeeKiosk kiosk = new CoffeeKiosk();

        kiosk.addMenuItem("Coffee", 2.50);
        kiosk.addMenuItem("SUPER MOCHA", 5.25);
        kiosk.addMenuItem("Capuccino", 4.75);
        kiosk.addMenuItem("Hot Chocolate", 3.50);
        kiosk.addMenuItem("Coffee Roll", 3.00);

        kiosk.newOrder();
    }
}