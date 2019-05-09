/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import java.io.*;
/**
 *
 * @author Drsor
 */
public abstract class FileHandler implements FileHandler_IF {
    
    private String fileName;
    
    public FileHandler (String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void write(String data) {
        try {
         BufferedWriter out = new BufferedWriter(new FileWriter("src/decorator/"+this.fileName));
         out.write(data);
         out.close();
         System.out.println("Write work complete!");
      }
      catch (IOException e) {
          e.printStackTrace();
      }
    }

    @Override
    public String read() {
        String toReturn = "";
        try (BufferedReader reader = new BufferedReader(new FileReader("src/decorator/"+fileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                toReturn += line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return toReturn;
    }
    
}
