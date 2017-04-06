package factorydesign;

import java.util.Date;


public class ProductOne implements IProduct{

    private final String _serialNumber;
    private final String _productName = "ProductOne";
    private Date         _productDate;

    public ProductOne(String serialNumber) {
        _serialNumber = serialNumber;
        _productDate  = new Date();
    }
    
   @Override
    public String getProductName() {
        return _productName;
    }

    @Override
    public Date getProductionDate() {
        return _productDate;
    }

    @Override
    public String getProductSerialNumber() {
        return _serialNumber;
    }
    
}
