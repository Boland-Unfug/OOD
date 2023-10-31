package calcwithcommand;

import calcwithoutcommand.Calculator;

public class DivCommand implements Command{

    Double valueToDivide; // it knows about some parameter that is needed for the command/execution
    Calculator calc;  // it composes a calculator object
    
    DivCommand(Calculator calc, Double val){
        this.calc = calc;
        valueToDivide = val;
    }

    @Override
    public void execute() {
        
        calc.divide(valueToDivide);
        System.out.println("After executing the divide command, " + calc.toString());
    }

    @Override
    public void undo() {
        calc.multiply(valueToDivide);
        System.out.println("After undoing the divide command, " + calc.toString());

    }
    
}
