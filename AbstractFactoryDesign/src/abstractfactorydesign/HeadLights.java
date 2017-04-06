package abstractfactorydesign;

public abstract class HeadLights {

    protected final String _headLightModel;

    public HeadLights(String headLightModel) {
        _headLightModel = headLightModel;
    }

    public String getHeadLightModel() {
        return _headLightModel;
    }
    
    

}
