package abstractfactorypattern;


interface GUIFactory{
	
	Button createButton();
	TextBox createTextBox();
	
}


class WindowsGUI implements GUIFactory
{

	@Override
	public Button createButton() {
		
		return new WindowsButton("default", "blue");
	}

	@Override
	public TextBox createTextBox() {
		return new WindowsTextBox();
	}
	

}


class LinuxGUI implements GUIFactory
{

	@Override
	public Button createButton() {
		
		return new LinuxButton("default", "green");
	}

	@Override
	public TextBox createTextBox() {
		return new LinuxTextBox();
	}
	

}


class MacOSGUI implements GUIFactory
{

	MacOSGUI(){
		System.out.println("Creating an app for Mac OS ...");
	}
	
	@Override
	public Button createButton() {
		
		return new MacOSButton("default", "yellow");
	}

	@Override
	public TextBox createTextBox() {
		return new MacOSTextBox();
	}
	

}


public class Application {

		private Button button;
	    private TextBox textbox;

	    public Application(GUIFactory factory) {
	        button = factory.createButton();
	        textbox = factory.createTextBox();
	    }

	    public void paint() {
	        button.paint();
	        textbox.create();
	    }
	}
	
	