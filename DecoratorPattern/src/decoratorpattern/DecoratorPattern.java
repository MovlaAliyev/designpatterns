package decoratorpattern;


public class DecoratorPattern {

    
    public static void main(String[] args) {
        Calculator calculator=new Multiply(new Sum(new Multiply(new ConcreteCalculator(12),4),4),4);
        double result=calculator.calculate();
        System.out.println(result);
    }
    
}
