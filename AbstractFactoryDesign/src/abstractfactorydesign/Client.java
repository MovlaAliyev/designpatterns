package abstractfactorydesign;


public class Client {
    public void doSomeClientJob(){
        Tire tire         = FactoryMaker.getFactory("audi").makeTire();
        HeadLights lights = FactoryMaker.getFactory("audi").makeHeadLights();
        System.out.println(tire.getTireModel());
        System.out.println(lights.getHeadLightModel());
    }
}
