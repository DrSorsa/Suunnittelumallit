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
public class Charmeleon extends State{
    
    private static final Charmeleon INSTANCE = new Charmeleon();
    
    private Charmeleon () {}
    
    public static Charmeleon getInstance () {
        return INSTANCE;
    }
    
    @Override
    void levelUp(Pokemans pokemans) {
        System.out.println("Charmeleon kasvaa tasoa");
        changeState(pokemans, Charizard.getInstance());
    }

    @Override
    void levelDown(Pokemans pokemans) {
        System.out.println("Charmeleon laskee tasoa");
        changeState(pokemans, Charmander.getInstance());
    }

    @Override
    void attack(Pokemans pokemans) {
        System.out.println("Charmeleon hyökkää!");
    }

    @Override
    void growl(Pokemans pokemans) {
        System.out.println("Charmeleon sanoo: Ärrin!");
    } 
}
