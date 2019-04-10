/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Observable;
import java.util.Observer;


/**
 *
 * @author Drsor
 */
public class ClockObserver implements Observer {
    
    private ClockObservable CO;
    
    public ClockObserver (ClockObservable CO) {
        this.CO = CO;
    }

    @Override
    public void update(Observable o, Object o1) {
        System.out.println(CO.getTime());
    }

}
