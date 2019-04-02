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
public class BossFactory implements IF_ClothesFactory {

    @Override
    public IF_Hat createHat() {
        return new BossHat();
    }

    @Override
    public IF_Shirt createShirt() {
        return new BossShirt();
    }

    @Override
    public IF_Pants createPants() {
        return new BossPants();
    }

    @Override
    public IF_Shoes createShoes() {
        return new BossShoes();
    }
    
}
