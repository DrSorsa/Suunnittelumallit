/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import abstractfactory.Factories.*;
/**
 *
 * @author Drsor
 */
public class Main {
    
    public static void main(String[] args) {
    
        JavaKoodaaja jk = new JavaKoodaaja("Jasper");
        IF_ClothesFactory cf = new AdidasFactory();
    
        jk.setHat(cf.createHat());
        jk.setShirt(cf.createShirt());
        jk.setPants(cf.createPants());
        jk.setShoes(cf.createShoes());
        
        System.out.println(jk);
        
        
        cf = new BossFactory();
        
        jk.setHat(cf.createHat());
        jk.setShirt(cf.createShirt());
        jk.setPants(cf.createPants());
        jk.setShoes(cf.createShoes());
        
        System.out.println(jk);
        
    }
    
}
