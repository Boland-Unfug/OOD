package calcwithcommand;
import calcwithoutcommand.Calculator;

class AddCommand implements Command{

	Double valueToAdd; // it knows about some parameter that is needed for the command/execution
	Calculator calc;  // it composes a calculator object
	
	AddCommand(Calculator calc, Double val){
		this.calc = calc;
		valueToAdd = val;
	}

	@Override
	public void execute() {
		
		calc.add(valueToAdd);
		System.out.println("After executing the add command, " + calc.toString());
	}

	@Override
	public void undo() {
		calc.subtract(valueToAdd);
		System.out.println("After undoing the add command, " + calc.toString());

	}
		
}
