package calcwithcommand;

import java.util.ArrayList;
import java.util.List;


/*
 * Asks the commands to carry out the request
 */

public class CommandInvoker{

		
		private List<Command> commandList;
		
		public CommandInvoker(){
			commandList = new ArrayList<Command>();
		}
		
		public CommandInvoker(List<Command> lx){
			commandList = lx;
		}
		
		public void addCommand(Command c)
		{
			commandList.add(c);
		}
		
		
		public void executeCommand()
		{
			for(Command c: commandList)
			{
				c.execute();
			}
		}
		
		public void undoCommand()
		{
			if(commandList.isEmpty())
			{
				System.out.println("Nothing was done before. So the execution list is empty :)");
			}
			else {
				
			int sz = commandList.size()-1;
			while(sz >= 0) {
				Command c = commandList.remove(sz);
			    c.undo();
			    sz--;
			}
		  }
		
		}	
}
