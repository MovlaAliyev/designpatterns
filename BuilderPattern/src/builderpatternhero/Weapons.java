package builderpatternhero;

public enum Weapons {
    FIST     ,
    HAMMER   ,
    AXES     ,
    DAGGERS  ,
    GREATAXES;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
    
    
    
            
}
