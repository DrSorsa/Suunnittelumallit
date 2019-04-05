/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

import components.Component;
import components.asus.*;

/**
 *
 * @author Drsor
 */
public class AsusFactory implements Factory {

    @Override
    public Component createCase() {
        return new AsusCase();
    }

    @Override
    public Component createGC() {
        return new AsusGC();
    }

    @Override
    public Component createMB() {
        return new AsusMB();
    }

    @Override
    public Component createPS() {
        return new AsusPS();
    }

    @Override
    public Component createRAM() {
        return new AsusRAM();
    }
    
}
