/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

import components.Component;
import components.acer.*;

/**
 *
 * @author Drsor
 */
public class AcerFactory implements Factory {

    @Override
    public Component createCase() {
        return new AcerCase();
    }

    @Override
    public Component createGC() {
        return new AcerGC();
    }

    @Override
    public Component createMB() {
        return new AcerMB();
    }

    @Override
    public Component createPS() {
        return new AcerPS();
    }

    @Override
    public Component createRAM() {
        return new AcerRAM();
    }
    
}
