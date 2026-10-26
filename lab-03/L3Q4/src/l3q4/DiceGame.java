/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q4;
import java.util.Random;
/**
 *
 * @author yuxuankoh
 */
public class DiceGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int p1first = rand.nextInt(6)+1;
        int p1second = rand.nextInt(6)+1;
        int p2first = rand.nextInt(6)+1;
        int p2second = rand.nextInt(6)+1;
        
        int player1 = p1first + p1second;
        int player2 = p2first + p2second;

        System.out.println("Player 1 rolls " + p1first + " and " + p1second + ": " + player1);
        System.out.println("Player 2 rolls " + p2first + " and " + p2second + ": " + player2);

        if (player1 > player2) {
            System.out.println("Player 1 wins!");
        } else if (player2 > player1) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a draw!");
    }
   
    }
}
