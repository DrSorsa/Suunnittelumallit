/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Observable;

/**
 *
 * @author Drsor
 */
public class ClockObservable extends Observable {
    private int seconds, minutes, hours = 0;
    
    public ClockObservable (int speed) {
        ClockTimer timer = new ClockTimer (this, speed);
        timer.start();
    }
    
    public String getTime () {
        String strSec, strMin, strHours = "";
        
        strSec = (seconds < 10) ? "0"+seconds : ""+seconds;
        strMin = (minutes < 10) ? "0"+minutes : ""+minutes;
        strHours = (hours < 10) ? "0"+hours : ""+hours;
        
        return String.format("%s:%s:%s", strHours, strMin, strSec);
    }
    
    public void incrementTime () {
        seconds++;
        if (seconds >= 60) {
            seconds = 0;
            minutes++;
            if (minutes >= 60) {
                minutes = 0;
                hours++;
            }
        }
        
        setChanged();
        notifyObservers(this);
    }
}
