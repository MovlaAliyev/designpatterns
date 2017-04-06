package factorydesign;

public enum EnumProduct {
    PRODUCT_ONE(ProductOne.class.getName(),ProductOne.class),
    PRODUCT_TWO(ProductTwo.class.getName(),ProductTwo.class);
    
    private final String   _productClassName;
    private final Class<?> _classType;

    private EnumProduct(String productClassName, Class<?> classType) {
        _productClassName = productClassName;
        _classType        = classType;
    }
    
    public String getProductClassName(){
        return _productClassName;
    }
    
    public Class<?> getClassType(){
        return _classType;
    }
    
    
}
