package decoratorpattern;

public class CalculateDecorator implements Calculator{
    protected Calculator calculator;
    
    public CalculateDecorator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public double calculate() {
        return calculator.calculate();
    }
    
}
