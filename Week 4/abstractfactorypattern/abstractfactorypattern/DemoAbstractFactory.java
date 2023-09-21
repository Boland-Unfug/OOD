package abstractfactorypattern;

public class DemoAbstractFactory{
	
	private static Application configureApplication(String osName) {
       
        Application app;
        GUIFactory factory;
        //String osName = System.getProperty("os.name").toLowerCase();
        
        if (osName.contains("mac")) {
            factory = new MacOSGUI();
            app = new Application(factory);
        } else if(osName.contains("linux")){
            factory = new LinuxGUI();
            app = new Application(factory);
        }
        else if(osName.contains("windows")) {
        	factory = new WindowsGUI();
        	app = new Application(factory);
        }
        else {
        	app = null;
        }
        return app;
    }


	public static void main(String[] args) {
		
		Application app = configureApplication("MacOS".toLowerCase());
                 app.paint();
        
        Application app1 = configureApplication("windows".toLowerCase());
        app1.paint();
        
		
	}
	
	
}
