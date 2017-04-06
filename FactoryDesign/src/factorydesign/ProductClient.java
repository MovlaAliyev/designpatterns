package factorydesign;


public class ProductClient {

    public ProductClient() {
    }
    
    public void doSomeClientJob(){
        IProduct productOne = new ProductFactory().makeProduct("One");
        System.out.println("Product Name -> " 
                                                + productOne.getProductName());
        System.out.println("Product Serial Number -> " 
                                                + productOne.getProductSerialNumber());
        
        IProduct productTwo = new ProductFactory().makeProduct("Two");
        System.out.println("Product Name -> " 
                                                + productTwo.getProductName());
        System.out.println("Product Serial Number -> " 
                                                + productTwo.getProductSerialNumber());
    }
}
