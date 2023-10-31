package calcwithcommand;

import calcwithoutcommand.Calculator;

class MultCommand implements Command{

	Double valueToMult;
	Calculator calc;
	
	MultCommand(Calculator calc, Double val){
		this.calc = calc;
		valueToMult = val;
	}

	@Override
	public void execute() {
		
		calc.multiply(valueToMult);
		System.out.println("After executing the multiply command, " + calc.toString());
	}

	@Override
	public void undo() {
		calc.divide(valueToMult);
		System.out.println("After undoing the multiply command, " + calc.toString());

	}
		
}
