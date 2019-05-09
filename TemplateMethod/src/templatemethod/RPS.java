/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Drsor
 */
public class RPS extends Game {
    
    private int[] playerWins;
    private int winner;
    private boolean gameEnd;
    private Scanner scanner;
    private HashMap<String, String> actions;
    
    public RPS () {}

    @Override
    void initializeGame() {
        System.out.println("Pelissä kaksi pelaajaa kilpailevat kumpi voittaa tietokoneen ensin pelissä kivi sakset paperi."
                + "\nEnsinmmäinen pelaaja joka voittaa tietokoneen vähintään viisi(5) kertaa voittaa sekä johtaa kahdella(2) pisteellä voittaa.");
        scanner = new Scanner(System.in);
        playerWins = new int[] {0, 0}; 
        gameEnd = false;
        actions = new HashMap<String, String>();
        actions.put("k", "Kivi");
        actions.put("s", "Sakset");
        actions.put("p", "Paperi");
    }

    @Override
    void makePlay(int player) {
        System.out.println("\nPelaaja"+(player+1)+" vuoro");
        String action;
        String botAction = handleBot();
        
        do {
            System.out.println("\nk: Kivi"
                + "\ns: Sakset"
                + "\np: Paperi");
            System.out.print("\nValitse: ");
            action = scanner.nextLine();
            
            if (action.equals("k") || action.equals("s") || action.equals("p")) {
                handleChoices(player, action, botAction);
            } else {
                System.out.println("Viallinen syöte");
                action = "fault";
            }
        } while (action.equals("fault"));
        
        handleRoundEnd(player);
    }
    
    private void handleRoundEnd (int player) {
        System.out.println("Pisteet: Pelaaja1: "+playerWins[0]+", Pelaaja2: "+playerWins[1]);
        if (playerWins[0] > 5 || playerWins[1] > 5) {
            if (playerWins[0]-playerWins[1]>1) {
                winner = 0;
                gameEnd = true;
            } else if (playerWins[0]-playerWins[1]<-1) {
                winner = 1;
                gameEnd = true;
            }
        }
    }
    
    private void handleChoices (int player, String playerChoice, String botChoice) {
        System.out.println("\nPelaaja valitsi: "+actions.get(playerChoice) +
                           ", Kone valitsi: "+actions.get(botChoice));
        if (!playerChoice.equals(botChoice)) {
            if (playerChoice.equals("k")) {
                if (botChoice.equals("s")) {
                    System.out.println("Pelaaja voitti tällä kertaa!");
                    playerWins[player] += 1;
                } else {
                    System.out.println("Kone voitti tällä kertaa!");
                }
            } else if (playerChoice.equals("s")) {
                if (botChoice.equals("p")) {
                    System.out.println("Pelaaja voitti tällä kertaa!");
                    playerWins[player] += 1;
                } else {
                    System.out.println("Kone voitti tällä kertaa!");
                }
            } else {
                if (botChoice.equals("k")) {
                    System.out.println("Pelaaja voitti tällä kertaa!");
                    playerWins[player] += 1;
                } else {
                    System.out.println("Kone voitti tällä kertaa!");
                }
            }
        } else {
            System.out.println("Tasapeli!");
        }
    }
    
    private String handleBot () {
        String toReturn = "";
        int choice = 0;
        
        Random rand = new Random();
        
        choice = rand.nextInt(3);
        
        switch(choice) {
            case 0:
                toReturn = "k";
                break;
            case 1:
                toReturn = "s";
                break;
            case 2:
                toReturn = "p";
                break;
        }
        
        return toReturn;
    }

    @Override
    boolean endOfGame() {
        return gameEnd;
    }

    @Override
    void printWinner() {
        System.out.println("Pelaaja "+(winner+1)+" voitti pelin!");
    }
    
}
