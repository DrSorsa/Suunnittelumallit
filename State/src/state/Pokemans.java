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
public class Pokemans {
    private State state;
    
    public Pokemans () {
        this.state = Charmander.getInstance();
    }
    
    public void levelUp() {
        state.levelUp(this);
    }
    public void levelDown() {
        state.levelDown(this);
    }
    public void attack() {
        state.attack(this);
    }
    public void growl() {
        state.growl(this);
    };
    protected void changeState(State state) {
        this.state = state;
    }
}
