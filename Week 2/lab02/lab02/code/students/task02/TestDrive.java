package students.task02;


interface ElectronicOrderBook{
    public void orderBurger(); 
    public void orderFries() ; // s -> small, m -> medium, l -> large
    public void orderCombo();
    public double getPrice();
    
}


class BurgerShopA implements ElectronicOrderBook{

	private double burgerPrice; // standard size
	private double friesPrice;
	private double currentPrice;
	
	BurgerShopA() {
		burgerPrice = 10.5;
		friesPrice = 2.5; // s -> small size, m -> 2 * s, l -> 3 * s
		currentPrice = 0.0;
		
		System.out.println("Hello there! We are ready to take orders from you ...\n");
		
	}
	@Override

	public void orderBurger() {
		
		System.out.println("Thanks! we are preparing your ordered burger(s) ...");
		currentPrice += burgerPrice;

	}

	public void orderBurger(int quantity) {
		
		System.out.println("Thanks! we are preparing your ordered burger(s) ...");
        currentPrice += quantity * burgerPrice; 	
		
	}

	

	@Override

	public void orderFries() {
		
		System.out.println("Thanks! we are preparing your ordered fries...");
		currentPrice += friesPrice;
		
	}
	public void orderFries(char size) {
		
		System.out.println("Thanks! we are preparing your ordered fries...");
		if(size == 's')
			currentPrice += friesPrice;
		else if (size == 'l')
			currentPrice += 2 * friesPrice;
		else
			currentPrice += 3 * friesPrice;
	}

	@Override

	public void orderCombo() {
		
		orderBurger();
		orderFries();
		
	}
	public void orderCombo(int quantity) {
		orderBurger(quantity);
		orderFries('m');
	}

	@Override
	public double getPrice() {
		
		double cprice = currentPrice;
		currentPrice = 0.0;
		return cprice;
		
	}
	
	
}

public class TestDrive {

	public static void main(String[] args) {
		
		BurgerShopA bg1= new BurgerShopA();
		
		bg1.orderBurger(3);
		bg1.orderFries('m');
		System.out.println("\n ** Please pay "+ bg1.getPrice() + " to the counter for your order.\n");
		
		
		bg1.orderCombo(2);
		System.out.println("\n ** Please pay "+ bg1.getPrice() + " to the counter for your order.\n");

		BurgerShopB bg2= new BurgerShopB();
		bg2.addItem("Burger", 8.5);
		bg2.addItem("Fries", 3);

		bg2.buyItem("Burger");
		bg2.buyItem("Fries");

	}
	
	
}



// This does break OCP, because if we want to modify prices, fry size, or add a new type of order, we would have to modify the code in the class itself
// additionally, if we wanted to modify how the functions work, we would have to modify the code in the class itself
// This also breaks ISP, because the interface has functions that are not used by all classes that implement it
// Lastly, it breaks DIP, because the class methods are directly reliant on the specific implementation of the interface methods, instead of on general methods