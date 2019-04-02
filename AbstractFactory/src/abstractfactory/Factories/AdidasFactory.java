/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.Factories;

import abstractfactory.Clothes.*;

/**
 *
 * @author Drsor
 */
public class AdidasFactory implements IF_ClothesFactory {

    @Override
    public IF_Hat createHat() {
        return new AdidasHat();
    }

    @Override
    public IF_Shirt createShirt() {
        return new AdidasShirt();
    }

    @Override
    public IF_Pants createPants() {
        return new AdidasPants();
    }

    @Override
    public IF_Shoes createShoes() {
        return new AdidasShoes();
    }
    
}
