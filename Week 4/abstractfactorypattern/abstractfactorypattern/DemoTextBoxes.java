package abstractfactorypattern;


interface TextBox{
	
	public abstract void create();
	
}

class LinuxTextBox implements TextBox{

	public void create() {
		System.out.println("This is a linux textbox.");
		
	}
}

class WindowsTextBox implements TextBox{

	public void create() {
		System.out.println("This is a windows textbox.");
		
	}
}

class MacOSTextBox implements TextBox{

	public void create() {
		System.out.println("This is a MacOS textbox.");
		
	}
}



public class DemoTextBoxes {

	public static void main(String[] args) {
		
		System.out.println("Creating some textboxes ...");
		

	}

}
