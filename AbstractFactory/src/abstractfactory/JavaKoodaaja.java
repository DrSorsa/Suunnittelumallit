/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import abstractfactory.Clothes.IF_Hat;
import abstractfactory.Clothes.IF_Shirt;
import abstractfactory.Clothes.IF_Pants;
import abstractfactory.Clothes.IF_Shoes;

/**
 *
 * @author Drsor
 */
public class JavaKoodaaja {
    private String name;
    private IF_Hat hat;
    private IF_Shirt shirt;
    private IF_Pants pants;
    private IF_Shoes shoes;
    
    public JavaKoodaaja (String name) {
        this.name = name;
    }

    public void setHat(IF_Hat hat) {
        this.hat = hat;
    }

    public void setShirt(IF_Shirt shirt) {
        this.shirt = shirt;
    }

    public void setPants(IF_Pants pants) {
        this.pants = pants;
    }

    public void setShoes(IF_Shoes shoes) {
        this.shoes = shoes;
    }
    
    
    
    @Override
    public String toString () {
        return String.format("My name is %s and i am wearing %s, %s, %s, %s", name, hat, shirt, pants, shoes);
    }
    
}
