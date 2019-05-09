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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final String FILE_NORMAL = "normalString.txt";
        final String FILE_ENCODED = "decodedString.txt";
        final String DATA_TO_WRITE = "Did you ever hear the Tragedy of Darth Plagueis the wise?"
                + " I thought not. It's not a story the Jedi would tell you. It's a Sith legend."
                + " Darth Plagueis was a Dark Lord of the Sith, so powerful and so wise he could"
                + " use the Force to influence the midichlorians to create life... He had such a"
                + " knowledge of the dark side that he could even keep the ones he cared about"
                + " from dying. The dark side of the Force is a pathway to many abilities some"
                + " consider to be unnatural. He became so powerful... the only thing he was"
                + " afraid of was losing his power, which eventually, of course, he did."
                + " Unfortunately, he taught his apprentice everything he knew, then his"
                + " apprentice killed him in his sleep. It's ironic he could save others"
                + " from death, but not himself.";
        
        FileHandler fileHandler = new NormalFileHandler(FILE_NORMAL);
        fileHandler.write(DATA_TO_WRITE);
        System.out.println(fileHandler.read());
        
        fileHandler = new EncodedFileHandler(FILE_ENCODED);
        fileHandler.write(DATA_TO_WRITE);
        System.out.println(fileHandler.read());
        
    }
    
}
