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
public abstract class State {
    abstract void levelUp(Pokemans pokemans);
    abstract void levelDown(Pokemans pokemans);
    abstract void attack(Pokemans pokemans);
    abstract void growl(Pokemans pokemans);

    void changeState(Pokemans pokemans, State state) {
        pokemans.changeState(state);
    }

}
