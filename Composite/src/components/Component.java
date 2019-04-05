/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

/**
 *
 * @author Drsor
 */
public interface Component {
    double getPrice();
    void addComponent(Component c);
    void removeComponent(Component c);
}
