package builderpatternhero;


public enum Armor {
        ADVENTURE_SET ("adventure set") ,
        ANTIQUATED_SET("antiquated set"),
        BALDER_SET    ("balder set")    ,
        BANDIT_SET    ("bandit set")    ,
        CHAIN_SET     ("chain set")     ,
        GIANT_SET     ("giant set")     ;
    
    private String value;
    
    private Armor(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
  
    
   
}
