package builderpatternhero;


public class Hero {
    private final HairType  hairType;
    private final HairColor hairColor;
    private final Classes   uClass;
    private final Weapons   weapon;
    private final Armor     armor;
    private final String    name;

    public Classes getuClass() {
        return uClass;
    }

    public Weapons getWeapon() {
        return weapon;
    }

    public String getName() {
        return name;
    }

    public Armor getArmor() {
        return armor;
    }

    public HairType getHairType() {
        return hairType;
    }

    public HairColor getHairColor() {
        return hairColor;
    }
    
    public static class Builder{
        
        private Classes uClass;
        private String  name;
        
        //optional values
        private HairType  hairType;
        private HairColor hairColor;
        private Weapons   weapon;
        private Armor     armor;
        
        
        public Builder(Classes uClasses, String name) {
            if(uClasses == null || name == null) throw new IllegalArgumentException("Hair type cant be a null");
            
            this.uClass = uClasses;
            this.name   = name;
        }
        
        public Builder armor(Armor armor){
           this.armor = armor;
           return this;
        }
        
        public Builder weapon(Weapons weapon){
           this.weapon = weapon;
           return this;
        }
        
        public Builder hairType(HairType hairType){
            this.hairType = hairType;
            return this;
        }
        
        public Builder hairColor(HairColor hairColor){
            this.hairColor = hairColor;
            return this;
        }
        
        public Hero build(){
            return new Hero(this);
        }
    }

    public Hero(Builder builder) {
        name      = builder.name;
        uClass    = builder.uClass;
        armor     = builder.armor;
        weapon    = builder.weapon;
        hairType  = builder.hairType;
        hairColor = builder.hairColor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hero's name: ")
          .append(name)
          .append(" class: ")
          .append(uClass)
          .append(" armor: ")
          .append(armor     != null ? armor     : "default armor")
          .append(" weapon: ")
          .append(weapon    != null ? weapon    : "default weapon")
          .append(" hair type: ")
          .append(hairType  != null ? hairType  : "default hair type")
          .append(" hair color: ")
          .append(hairColor != null ? hairColor : "default hair color");
        
        return sb.toString();
    }
    
    
    
    
}
