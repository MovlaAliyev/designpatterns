package abstractfactorydesign;


public class AudiFactory extends Factory{

    @Override
    public Tire makeTire() {
        return new AudiTire();
    }

    @Override
    public HeadLights makeHeadLights() {
        return new AudiHeadLight();
    }
    
}
