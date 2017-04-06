package factorydesign;


public class FactoryDesign {

   
    public static void main(String[] args) {
        
        ProductClient pc = new ProductClient();
        pc.doSomeClientJob();
        
       /*ProductClientA clientA = new ProductClientA();
       clientA.doSomeClientAJob();
       
       ProductClientB clientB = new ProductClientB();
       clientB.doSomeClientBJob();
       
       ProductClientC clientC = new ProductClientC();
       clientC.doSomeClientCJob();*/
    }
    
}
