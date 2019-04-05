/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components.asus;

import components.Component;
import java.util.ArrayList;

/**
 *
 * @author Drsor
 */
public class AsusMB implements Component {
    
    String manufacturer = "Asus";
    double price = 200.0;
    ArrayList<Component> connectedComponents = new ArrayList<Component> ();

    @Override
    public double getPrice() {
        double temp = this.price;
        
        for (Component c : connectedComponents) {
            temp += c.getPrice();
        }
        return temp;
    }

    @Override
    public void addComponent(Component c) {
        connectedComponents.add(c);
    }

    @Override
    public void removeComponent(Component c) {
        connectedComponents.remove(c);
    }
    
}
