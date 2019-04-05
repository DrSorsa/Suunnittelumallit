/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

import components.Component;

/**
 *
 * @author Drsor
 */
public interface Factory {
    Component createCase();
    Component createGC();
    Component createMB();
    Component createPS();
    Component createRAM();
}
