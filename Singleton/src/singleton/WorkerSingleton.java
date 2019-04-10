/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Drsor
 */
public class WorkerSingleton extends Thread {
    private static WorkerSingleton INSTANCE = null;
    private int workRemaining, workDone;

    private WorkerSingleton () {};
    
    public static synchronized WorkerSingleton getInstance () {
        if (INSTANCE == null) {
            INSTANCE = new WorkerSingleton();
        }
        return INSTANCE;
    }
    
    public void work(int workRemaining) {
        this.workRemaining = workRemaining;
        this.start();
    }
    
    @Override
    public void run () {
        while (workRemaining > workDone) {
            try {
                sleep(100);
                workDone++;
                if (((workDone/(double)workRemaining)*100) % 10 == 0) {
                    System.out.println(((workDone/(double)workRemaining)*100)+"% of work done!");
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(WorkerSingleton.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.destroy();
    }
    
    public void destroy () {
        System.out.println("Work completed!");
        this.INSTANCE = null;
    }
    
}
