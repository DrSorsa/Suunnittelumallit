/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.Factories;

/**
 *
 * @author Drsor
 */

import abstractfactory.Clothes.IF_Hat;
import abstractfactory.Clothes.IF_Shirt;
import abstractfactory.Clothes.IF_Pants;
import abstractfactory.Clothes.IF_Shoes;

public interface IF_ClothesFactory {
    	public IF_Hat createHat();
	public IF_Shirt createShirt();
	public IF_Pants createPants();
	public IF_Shoes createShoes();
}
