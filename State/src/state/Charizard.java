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
public class Charizard extends State {
    
    private static final Charizard INSTANCE = new Charizard();
    
    private Charizard () {}
    
    public static Charizard getInstance () {
        return INSTANCE;
    }

    @Override
    void levelUp(Pokemans pokemans) {
        System.out.println("Charizard on korkeimmalla mahdollisella tasolla!");
    }

    @Override
    void levelDown(Pokemans pokemans) {
        System.out.println("Charizardin taso laskee");
        changeState(pokemans, Charmeleon.getInstance());
    }

    @Override
    void attack(Pokemans pokemans) {
        System.out.println("Charizard hyökkää!");
    }

    @Override
    void growl(Pokemans pokemans) {
        System.out.println("Charizards sanoo: Ärrin Murrin!");
    }
    
}
