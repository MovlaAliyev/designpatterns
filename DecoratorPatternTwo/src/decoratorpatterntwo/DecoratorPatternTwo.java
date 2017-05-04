package decoratorpatterntwo;

public class DecoratorPatternTwo {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + 
                            " $" + beverage.cost());

        Beverage beverageTwo = new DarkRoast();
        beverageTwo = new Mocha(beverageTwo);
        beverageTwo = new Mocha(beverageTwo);
        beverageTwo = new Whip(beverageTwo);
        System.out.println(beverageTwo.getDescription() + 
                            " $" + beverageTwo.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
                            + " $" + beverage3.cost());

    }

}
