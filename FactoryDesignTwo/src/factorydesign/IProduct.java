package factorydesign;

import java.util.Date;


public interface IProduct {
    public String getProductName();
    public Date   getProductionDate();
    public String getProductSerialNumber();
}
