package factorydesign;

import java.util.Date;


public class ProductTwo implements IProduct{

    private final String _productName = "ProductTwo";
    private final String _serialNumber;
    private Date         _productDate;

    public ProductTwo(String serialNumber) {
        _serialNumber = serialNumber;
        _productDate = new Date();
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
