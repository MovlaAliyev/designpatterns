package decoratorpattern;

public class Multiply extends CalculateDecorator{
    private double value;
    
    public Multiply(Calculator calculator,double value) {
        super(calculator);
        this.value = value;
    }

    @Override
    public double calculate() {
        return super.calculate()*value; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
