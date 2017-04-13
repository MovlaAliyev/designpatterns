package builderpatternhero;


public class BuilderPatternHero {

    
    public static void main(String[] args) {
      Hero heroOne = new Hero.Builder(Classes.WARRIOR, "Javatar")
                             .armor(Armor.CHAIN_SET)
                             .hairType(HairType.SHORT)
                             .hairColor(HairColor.BLACK)
                             .build();
                                                                
       
        System.out.println(heroOne.toString());
 
    }
    
}
