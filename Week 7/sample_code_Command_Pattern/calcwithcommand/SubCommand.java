package calcwithcommand;

import calcwithoutcommand.Calculator;

class SubCommand implements Command{

	Double valueToSub;
	Calculator calc;
	
	SubCommand(Calculator calc, Double val){
		this.calc = calc;
		valueToSub = val;
	}

	@Override
	public void execute() {
		calc.subtract(valueToSub);
		System.out.println("After executing the subtract command, " + calc.toString());
	}

	@Override
	public void undo() {
		calc.add(valueToSub);
		System.out.println("After undoing the subtract command, " + calc.toString());

	}
		
}
