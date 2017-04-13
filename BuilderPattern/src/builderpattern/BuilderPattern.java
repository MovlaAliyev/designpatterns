/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpattern;

/**
 *
 * @author Pc-2
 */
public class BuilderPattern {

    
    public static void main(String[] args) {
        NutritionalFacts n = new NutritionalFacts.Builder(1, 2)
                .fat(3)
                .carbohydrate(4)
                .protein(5)
                .build();
       
     
       System.out.println(new NutritionalFacts.Builder(1, 2)
                .fat(3)
                .carbohydrate(4)
                .protein(5)
                .build());
    }
    
}
