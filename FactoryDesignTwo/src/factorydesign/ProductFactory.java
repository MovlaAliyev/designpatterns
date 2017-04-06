package factorydesign;

public class ProductFactory {

    private static int _serialNumber = 0;

    public IProduct makeProduct(EnumProduct productType) throws Exception {
        
       try{
           String serialNumber = generateSerialNumber();
           return (IProduct) Class.forName(productType.getProductClassName())
                                  .getConstructor(String.class)
                                  .newInstance(serialNumber);
       }catch(Exception e){
           throw e;
       }
        
    }

    private String generateSerialNumber() {
        return (++_serialNumber) + "";
    }
}
