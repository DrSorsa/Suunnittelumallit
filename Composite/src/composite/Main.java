/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import components.Component;
import factories.*;

/**
 *
 * @author Drsor
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Factory factory = new AcerFactory();
        
        Component acerCase = factory.createCase();
        Component acerMB = factory.createMB();
        
        acerMB.addComponent(factory.createRAM());
        
        acerCase.addComponent(acerMB);
        acerCase.addComponent(factory.createGC());
        acerCase.addComponent(factory.createPS());
        
        System.out.println(String.format("Acer kokonaishinta %.2f: ",acerCase.getPrice()));
        
        factory = new AsusFactory();
        
        Component asusCase = factory.createCase();
        Component asusMB = factory.createMB();
        
        asusMB.addComponent(factory.createRAM());
        
        asusCase.addComponent(asusMB);
        asusCase.addComponent(factory.createGC());
        asusCase.addComponent(factory.createPS());
        
        System.out.println(String.format("Acer kokonaishinta %.2f: ",asusCase.getPrice()));
        
    }
    
}
