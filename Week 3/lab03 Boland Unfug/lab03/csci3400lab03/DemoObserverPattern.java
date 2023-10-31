package csci3400lab03;

/**
 * @author fahmidahamid
 * @author boland unfug
 * @date Sep 09 2020
 * @version 1.1
 */


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

class MyFileReader{
	
	public List<String> readFile(String fileName) throws Exception{
		
		String line = null;  
		List<String> data = new ArrayList<String>();
		
		try {
			BufferedReader bfReader = new BufferedReader(new FileReader(fileName));
			System.out.println("Reading file: " + fileName);
		
	        while((line = bfReader.readLine())!= null)
	        	{
	        	 data.add(line);
	        	}
	        bfReader.close();
	        }
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return data;
	}
}

public class DemoObserverPattern {

	public static void main(String[] args) throws Exception {
		
		
		
		MyFileReader myFileReader = new MyFileReader();

		// When grading, you may need to change the path, just right click on the file and copy the relative path
		List<String> data = myFileReader.readFile("Week 3\\lab03\\lab03\\weatherDatabase.txt");

		// create a new weather object
		Weather currentWeather = new Weather("Sarasota");

		// // create an observer for the weather
		// Observer weaObs =  new WeatherObserver("Weather-observer-of-Sarasota");
		// currentWeather.subscribe(weaObs);

		// System.out.println("The current weather is: " + currentWeather + "\n");
		// System.out.println("The current temperature is: " + currentWeather.getTemperature() + "\n");
		// System.out.println("The current precipitation is: " + currentWeather.getPrecipitation() + "\n");
		// System.out.println("The current hour is: " + currentWeather.getHour() + "\n");

		
		// FieldObserver tempObserver =  new FieldObserver("Temperature Observer", "temperature");
		// currentWeather.subscribe(tempObserver);

		FieldObserverX precipObserverX = 
		new FieldObserverX("Precipitation-Observer", "precipitation", "light-rain");
				currentWeather.subscribe(precipObserverX);
		
		/*** optional: more tests ***/
		//FieldObserverX tempObserverX = new FieldObserverX("Temperature-Observer", "temperature", 77);
		//currentWeather.subscribe(tempObserverX);
				
		for (String line: data) {
			String[] information = line.split(" ");
			currentWeather.setHour(Integer.parseInt(information[0]));
			currentWeather.setTemperature(Double.parseDouble(information[1]));
			currentWeather.setPrecipitation(information[2]);
  	  
		 }

		 System.out.println(currentWeather + "\n");
		 System.out.println("The current temperature is: " + currentWeather.getTemperature() + "\n");
		 System.out.println("The current precipitation is: " + currentWeather.getPrecipitation() + "\n");
		 System.out.println("The current hour is: " + currentWeather.getHour() + "\n");


	}
	
}
