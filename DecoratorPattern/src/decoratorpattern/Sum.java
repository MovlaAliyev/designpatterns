package decoratorpattern;


public class Sum extends CalculateDecorator{
    private double value;
    
    public Sum(Calculator calculator, double value) {
        super(calculator);
        this.value = value;
    }

    @Override
    public double calculate() {
        return super.calculate() + value; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
