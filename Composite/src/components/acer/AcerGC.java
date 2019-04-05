/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components.acer;

import components.Component;

/**
 *
 * @author Drsor
 */
public class AcerGC implements Component {
    
    String manufacturer = "Acer";
    double price = 80.0;

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void addComponent(Component c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeComponent(Component c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
