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
public class EncodedFileHandler extends FileHandler{
    
    public EncodedFileHandler(String fileName) {
        super(fileName);
    }

    @Override
    public String read() {
        String encodedData = super.read();
        String decodedData = decode(encodedData);
       
        return decodedData;
    }

    @Override
    public void write(String data) {
        String encodedData = encode(data);
        
        super.write(encodedData);
    }
    
    private String decode(String data) {
        String[] toDecode = data.split(" ");
        String toReturn = "";
                
        for (String s : toDecode) {
            int i = Integer.parseInt(s);
            char c = (char)i;
            toReturn += c;
        }
        
        return toReturn;
    }
        
    private String encode(String data) {
        String toReturn = "";
        
        for(char ch : data.toCharArray()) {
            toReturn += (byte)ch + " ";
        }
        
        return toReturn;
    }
    
}
