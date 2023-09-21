package abstractfactorypattern;


abstract class Button{
	
	protected String name;
	protected String color;
	
	public Button(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public abstract void paint();
	
}

class LinuxButton extends Button{

	public LinuxButton(String name, String color)
	{
		super(name, color);
	}
	@Override
	public void paint() {
		System.out.println(name + " is a "+ color + " linux button ");
		
	}
}



class WindowsButton extends Button{

	public WindowsButton(String name, String color)
	{
		super(name, color);
	}
	@Override
	public void paint() {
		System.out.println(name + " is a "+ color + " windows button ");
		
	}
}


class MacOSButton extends Button{

	public MacOSButton(String name, String color)
	{
		super(name, color);
	}
	@Override
	public void paint() {
		System.out.println(name + " is a "+ color + " MacOS button ");
		
	}
}



public class DemoButtons {

	public static void main(String[] args) {
		
		System.out.println("Creating some buttons ...");
		

	}

}
