package builderpattern;


public class NutritionalFacts {
    private final int calorie;
    private final int cholesterol;
    private final int protein;
    private final int fat;
    private final int carbohydrate; 
   
     public static class Builder{
        private final int calorie;
        private final int cholesterol;
        
        private int protein = 0;
        private int fat = 0;
        private int carbohydrate = 0;

        public Builder(int calorie, int cholesterol) {
            this.calorie = calorie;
            this.cholesterol = cholesterol;
        }

        public Builder protein(int _protein){
            protein = _protein;
            return this;
        }
        
        public Builder fat(int _fat){
            fat = _fat;
            return this;
        }
        
        public Builder carbohydrate(int _carbohydrate){
            carbohydrate = _carbohydrate;
            return this;
        }
        
        public NutritionalFacts build(){
            return new NutritionalFacts(this);
        }
        
        
     }   
        private NutritionalFacts(Builder builder){
            calorie = builder.calorie;
            carbohydrate = builder.carbohydrate;
            protein = builder.protein;
            fat = builder.fat;
            cholesterol = builder.cholesterol;
        }
}
