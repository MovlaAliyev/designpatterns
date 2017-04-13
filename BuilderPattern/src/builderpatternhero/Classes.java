package builderpatternhero;


public enum Classes {
    WARRIOR  ,
    KNIGHT   ,
    WANDERER ,
    THIEF    ,
    BANDIT   ;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
    
    
}
