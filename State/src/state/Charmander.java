/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author Drsor
 */
public class Charmander extends State {
    
    private static final Charmander INSTANCE = new Charmander();
    
    private Charmander () {}
    
    public static Charmander getInstance () {
        return INSTANCE;
    }

    @Override
    void levelUp(Pokemans pokemans) {
        System.out.println("Charmander kasvaa tasoa");
        changeState(pokemans, Charmeleon.getInstance());
    }

    @Override
    void levelDown(Pokemans pokemans) {
        System.out.println("Charmander on jo alhaisimmalla tasolla!");
    }

    @Override
    void attack(Pokemans pokemans) {
        System.out.println("Charmander hyökkää!");
    }

    @Override
    void growl(Pokemans pokemans) {
        System.out.println("Charmander sanoo: Murrin!");
    }
}
