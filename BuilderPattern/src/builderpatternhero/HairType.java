package builderpatternhero;

public enum HairType {

    LONG       ("long" ),
    SHORT      ("short"),
    AFRO       ("afro" ), 
    LONG_CURLY ("long curly");
    
    
    private String title;
    
    private HairType(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
    
    
    
}
