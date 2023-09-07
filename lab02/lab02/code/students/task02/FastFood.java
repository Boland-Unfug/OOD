package students.task02;


/**
 * The FastFood interface allows a class to implement a menu, and the methods to add, buy, and print the menu.
 * It is recommended to create array variables for the menu and prices, as well as an order.
*/
public interface FastFood {
    public void addItem(String name, double price);
    public void buyItem(String name);
    public double getPrice(String name);
    public void printMenu();
}


class BurgerShopB implements FastFood {
    private String[] menu;
    private double[] prices;
    private int numItems;
    private double orderPrice;

    BurgerShopB() {
        menu = new String[2];
        prices = new double[2];
        numItems = 0;
        orderPrice = 0.0;
    }

    public void addItem(String name, double price) {
        menu[numItems] = name;
        prices[numItems] = price;
        numItems++;
    }

    public void buyItem(String name) {
        for (int i = 0; i < numItems; i++) {
            if (menu[i].equals(name)) {
                System.out.println("Thanks! We are preparing your ordered " + name + "...");
                orderPrice += prices[i];
                return;
            }
        }
        System.out.println("Sorry, we don't have " + name + " on our menu.");
    }

    public double getPrice(String name) {
        for (int i = 0; i < numItems; i++) {
            if (menu[i].equals(name)) {
                return prices[i];
            }
        }
        return 0.0;
    }

    public void printMenu() {
        System.out.println("Menu:");
        for (int i = 0; i < numItems; i++) {
            System.out.println(menu[i] + " $" + prices[i]);
        }
    }

    public void printOrder() {
        System.out.println("Your order:");
        for (int i = 0; i < numItems; i++) {
            System.out.println(menu[i] + " $" + prices[i]);
        }
        System.out.println("Total: $" + orderPrice);
    }
}
