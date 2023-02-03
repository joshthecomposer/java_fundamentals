public class CafeJava {
    public static void main(String[] args) {
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly.";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        double mochaPrice = 3.5;
        double dripCoffee = 1.5;
        double latte = 4.0;
        double cappucino = 5.5;

        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;

        System.out.println(generalGreeting + customer1);
        System.out.println(customer1 + pendingMessage);
        System.out.println("=================================================");
        
        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage);
            System.out.println("Your total is $" + cappucino);
        }

        System.out.println("=================================================");
        double total = latte * 2;
        System.out.println(total);
    }
}