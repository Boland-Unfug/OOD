/**
 * Lab 04
 * 
 */




package robot;

public class MathematicianRobot extends Robot{

	
	public MathematicianRobot(String name)
	{
		super(name);
	}
	@Override
	public void showExpertise() {
		
		
		System.out.println(this);
		System.out.println("Thank you for creating me!"
				+ "I can generate random integers. Here are some ...");
		
		int seed = 9971;
		int i = 0;
		while(i < 20) {
			seed = RandomNumberGenerator.generateRandom(seed);
			System.out.println(seed);
			i++;
		}
			
	}
		
	static class RandomNumberGenerator{
		
		static int p = 131;
		static int q = 271;
		
		private static int generateRandom(int seed)
		{
			return seed * seed % (p * q);
		}
		
	}


	@Override
	public String toString() {
		
		return 
				"I am "+ super.getName() + 
					" and I am an expert in mathematics.";
	}
	
}


