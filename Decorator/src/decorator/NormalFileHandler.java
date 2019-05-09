/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Drsor
 */
public class NormalFileHandler extends FileHandler {
    
    public NormalFileHandler(String fileName) {
        super(fileName);
    }

    @Override
    public String read() {
        return super.read();
    }

    @Override
    public void write(String data) {
        super.write(data);
    }
    
    
}
