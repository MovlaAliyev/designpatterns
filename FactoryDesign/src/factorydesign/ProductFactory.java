package factorydesign;

public class ProductFactory {

    private static int _serialNumber = 0;

    public IProduct makeProduct(String productType) throws IllegalArgumentException {
        
        if (productType.equals("One")) {
            String serialNumber = generateSerialNumber();
            return new ProductOne(serialNumber);
        } else if(productType.equals("Two")){
            String serialNumber = generateSerialNumber();
            return new ProductTwo(serialNumber);
        }else 
            throw new IllegalArgumentException("unsupported type");
        
    }

    private String generateSerialNumber() {
        return (++_serialNumber) + "";
    }
}
