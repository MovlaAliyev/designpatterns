package factorydesign;

public class ProductClient {

    public ProductClient() {
    }

    public void doSomeClientJob() {
        try {
            IProduct productOne = new ProductFactory().makeProduct(EnumProduct.PRODUCT_ONE);
            System.out.println("Product Name -> "
                    + productOne.getProductName());
            System.out.println("Product Serial Number -> "
                    + productOne.getProductSerialNumber());

            IProduct productTwo = new ProductFactory().makeProduct(EnumProduct.PRODUCT_TWO);
            System.out.println("Product Name -> "
                    + productTwo.getProductName());
            System.out.println("Product Serial Number -> "
                    + productTwo.getProductSerialNumber());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
