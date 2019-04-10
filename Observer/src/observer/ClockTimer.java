/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Drsor
 */
public class ClockTimer extends Thread {
    private ClockObservable CO;
    private int speed;
    
    public ClockTimer (ClockObservable CO, int speed) {
        this.speed = speed;
        this.CO = CO;
    }
    
    @Override
    public void run () {
        while (true) {
            try {
                sleep(this.speed);
                CO.incrementTime();
            } catch (InterruptedException ex) {
                Logger.getLogger(ClockTimer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
