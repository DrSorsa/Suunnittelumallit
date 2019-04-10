/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author Drsor
 */
public class Main {
    public static void main (String[] args) {
        int speed = 100;
        ClockObservable cObservable = new ClockObservable(speed);
        ClockObserver cObserver = new ClockObserver (cObservable);
        cObservable.addObserver(cObserver);
    }
}
