import java.util.ArrayList;
import java.util.Arrays;

public class CafeUtil {
    // Get Streak Goal
    public int getStreakGoal() {
        int sum = 0;

        for(int i = 0; i <= 10; i++) {
            sum += i;
        }

        return sum;
    }
    // Get Streak Goal with Argument
    public int getStreakGoal(int weeks) {
        int sum = 0;

        for(int i = 0; i <= weeks; i++) {
            sum += i;
        }

        return sum;
    }


    // Get Order Total
    public double getOrderTotal(double[] prices) {
        double sum = 0;

        for(int i = 0; i < prices.length; i++) {
            sum += prices[i];
        }

        return sum;
    }


    // Display Menu
    public void displayMenu(ArrayList<String> menuItems) {
        for(int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i));
        }
    }


    // Add Customer
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name.");

        String userName = System.console().readLine();

        System.out.println("Hello, " + userName);

        int people = customers.size();
        System.out.println(String.format("There are %d people in front of you", people));

        customers.add(userName);
        System.out.println(customers);
    }


    // BONUSES
    // Print Price Chart
    public void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println(product);

        for(int i = 1; i <= maxQuantity; i++) {
            double cost = (i * price) - ((i - 1) * .5);
            System.out.println(String.format("%d - $%.2f", i, cost));
        }
    }

    // Display Menu with Prices
    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
        if(menuItems.size() != prices.size()) {
            return false;
        }

        for(int i = 0; i < menuItems.size(); i++) {
            System.out.println(String.format("%d %s -- $%.2f", i, menuItems.get(i), prices.get(i)));
        }

        return true;
    }

    // Add Multiple Customers
    public void addCustomers(ArrayList<String> customers) {
        String custName = "";
        
        while(!custName.equals("q")) {
            System.out.println("Enter the name of a customer (type 'q' to quit)");
            custName = System.console().readLine();
            if(!custName.equals("q")) {
                System.out.println(String.format("Customer, %s, added to the list", custName));
                customers.add(custName);
            }
            System.out.println("\n");
        }

        System.out.println(customers);
    }
}