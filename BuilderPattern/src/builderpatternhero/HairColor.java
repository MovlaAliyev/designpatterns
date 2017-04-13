package builderpatternhero;

public enum HairColor {
    WHITE ,
    RED   ,
    BRWON ,
    YELLOW,
    BLACK ;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
    
    
}
