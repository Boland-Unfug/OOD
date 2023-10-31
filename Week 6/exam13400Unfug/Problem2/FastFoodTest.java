package exam13400Unfug.Problem2;

public class FastFoodTest {
    
    public static void main(String[] args){

        //basic pizza test
        BasicPizza basicPizza = new BasicPizza();
        // System.out.println(basicPizza.getInfo());

        //basic pizza with cheese
        BasicSalamiPizza basicPizzaWithSalami = new BasicSalamiPizza();
        // System.out.println(basicPizzaWithSalami.getInfo());

        //basic pizza with cheese and salami
        BasicHawaiianPizza basicPizzaWithHawaiian = new BasicHawaiianPizza();
        // System.out.println(basicPizzaWithHawaiian.getInfo());

        //a family sized hawaiian pizza
        FamilySizePizza familySizePizza = new FamilySizePizza(basicPizzaWithHawaiian);
        // System.out.println(familySizePizza.getInfo());

        //a pizza with cheese
        Topping cheesePizza = new Cheese(basicPizza);
        // System.out.println(cheesePizza.getInfo());

        //a pizza with cheese and salami
        Topping cheeseAndSalamiPizza = new Salami(cheesePizza);
        System.out.println(cheeseAndSalamiPizza.getInfo());

        //a family sized pizza with 3x onion
        Topping familySizePizzaWithOnion = new Onions(new Onions(new Onions(familySizePizza)));
        System.out.println(familySizePizzaWithOnion.getInfo());
    }
}