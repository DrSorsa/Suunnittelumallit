/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Drsor
 */
public class Main {
    
    public static void main (String[] args) {
        WorkerSingleton worker = WorkerSingleton.getInstance();
        worker.work(100);
    }
}
