package abstractfactorydesign;


public class MercedesFactory extends Factory{

    @Override
    public Tire makeTire() {
        return new MercedesTire();
    }

    @Override
    public HeadLights makeHeadLights() {
        return new MerecedesHeadLight();
    }
    
}
