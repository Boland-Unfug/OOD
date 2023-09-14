package trial2;

import java.util.Map;
import java.util.AbstractMap;
import java.util.Map.Entry;
import java.util.List;
import java.util.ArrayList;

public abstract class Observable{
		
		private List<Map.Entry<Observer, String>> observersWithInterests;
			
			public Observable(){
				observersWithInterests = new ArrayList<Map.Entry<Observer, String>>();
			}
			
			public void add(Observer newObs, String interestedIn)
			{
				Map.Entry<Observer,String> entry =
					    new AbstractMap.SimpleEntry<Observer,String>(newObs, interestedIn);

				observersWithInterests.add(entry);
			}
			
			public void remove(Observer rObs, String property)
			{
				for(Entry<Observer, String> o: observersWithInterests)
					if(o.getKey().equals(rObs)) 
						if(o.getValue().equalsIgnoreCase(property)) {
							observersWithInterests.remove(o);
							break;
					}
			}
			
			public void notifyAll(String propertyName, Object newValue)
			{
				for(Entry<Observer, String> o: observersWithInterests)
					if(o.getValue().equals(propertyName) || o.getValue().equals("all"))
						o.getKey().handle(new PropertyChangedEvent(propertyName, newValue));
				
			}
		}

	
