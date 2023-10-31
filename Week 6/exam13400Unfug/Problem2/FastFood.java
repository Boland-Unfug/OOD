package exam13400Unfug.Problem2;

/*
I decided to have a master class that stored the setters and getters for the Basic pizza, Basic Hawaiian Pizza, and Basic Salami Pizza.
*/

// write basic docs for EVERY class and method
interface Pizza {
    String getInfo();
    String getName();
    double getCalories();
    double getPrice();
}


/**
 * PizzaBase is the master class for the Basic Pizza, Basic Hawaiian Pizza, and Basic Salami Pizza.
 */
class PizzaBase implements Pizza {
    private String name;
    private double calories;
    private double price;

    PizzaBase(String name, double calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    @Override
    public String getInfo() {
        return "This is a " + name + " with " + calories + " calories" + " and costs " + price + " dollars";
    }

    // Getters
    public String getName() {
        return name;
    }
    public double getCalories() {
        return calories;
    }
    public double getPrice() {
        return price;
    }

    // Setters
    public void setName(String n) {
        name = n;
    }
    public void setCalories(int c) {
        calories = c;
    }
    public void setPrice(double p) {
        price = p;
    }
}

/**
 * BasicPizza, BasicHawaiianPizza, and BasicSalamiPizza are the basic pizzas that can be ordered.
 */
class BasicPizza extends PizzaBase{
    BasicPizza() {
        super("Basic Pizza Margherita", 1104, 4.99);
    }
}

/**
 * BasicHawaiianPizza is the basic pizza with ham and pineapple.
 */
class BasicHawaiianPizza extends PizzaBase {
    BasicHawaiianPizza() {
        super("Basic Hawaiian Pizza", 1024, 6.49);
    }
}

/**
 * BasicSalamiPizza is the basic pizza with salami.
 */
class BasicSalamiPizza extends PizzaBase {
    BasicSalamiPizza() {
        super("Basic Salami Pizza", 1160, 5.99);
    }
}

/**
 * FamilySizePizza is the family size pizza. It makes the pizza 1.95x the calories and adds $4.15 to the price.
 */
class FamilySizePizza implements Pizza {
    private PizzaBase pizza;
    private String name;
    private double calories;
    private double price;

    FamilySizePizza(PizzaBase p) {
        this.pizza = p;
        this.name = "Family Size Pizza";
        this.calories = this.pizza.getCalories() * 1.95;
        this.price = this.pizza.getPrice() + 4.15;
    }

    @Override
    public String getInfo() { // return the name, calories, and price of the topping
        return "This is a " + name + " with " + calories + " calories" + " and costs " + price + " dollars";
    }

    // Getters
    public String getName() {
        return name;
    }
    public double getCalories() {
        return calories;
    }
    public double getPrice() {
        return price;
    }
}

/**
 * Topping is the master class for the toppings, which simplifies each individual topping.
 * Cheese, Ham, Onions, Pineapple, and Salami are the toppings that can be added to the pizza.
 */
class Topping implements Pizza {
    private Pizza pizza;
    private String name;
    private double calories;
    private double price;

    Topping(Pizza p, String n, int c, double pr) {
        this.pizza = p;
        this.name = n + " " + this.pizza.getName();
        this.calories = this.pizza.getCalories() + c;
        this.price = this.pizza.getPrice() + pr;
    }

    @Override
    public String getInfo() {
        return "This is a " + name + " with " + calories + " calories" + " and costs " + price + " dollars";
    }

    // Getters
    public String getName() {
        return name;
    }
    public double getCalories() {
        return calories;
    }
    public double getPrice() {
        return price;
    }
}

/**
 * @see Topping
 */
class Cheese extends Topping {
    Cheese(Pizza p) {
        super(p, "Cheese", 92, 0.69);
    }
}

/**
 * @see Topping
 */
class Ham extends Topping {
    Ham(Pizza p) {
        super(p, "Ham", 35, 0.99);
    }
}

/**
 * @see Topping
 */
class Onions extends Topping {
    Onions(Pizza p) {
        super(p, "Onions", 22, 0.69);
    }
}

/**
 * @see Topping
 */
class Pineapple extends Topping {
    Pineapple(Pizza p) {
        super(p, "Pineapple", 24, 0.79);
    }
}

/**
 * @see Topping
 */
class Salami extends Topping {
    Salami(Pizza p) {
        super(p, "Salami", 86, 0.99);
    }
}