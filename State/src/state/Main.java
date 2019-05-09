/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import java.util.Scanner;
/**
 *
 * @author Drsor
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pokemans pokemans = new Pokemans();

        int toiminto;
        do {
            System.out.println("\nValitse toiminto:"
                    + "\n1. Nosta tasoa "
                    + "\n2. Laske tasoa "
                    + "\n3. Hyökkää "
                    + "\n4. Karju "
                    + "\n0. Lopeta ");
            System.out.print("\nAnna toiminto: ");
            toiminto = sc.nextInt();
            
            switch (toiminto) {
                case 1: pokemans.levelUp(); break;
                case 2: pokemans.levelDown(); break;
                case 3: pokemans.attack(); break;
                case 4: pokemans.growl(); break;
            }
        } while (toiminto != 0);

    }
    
}
