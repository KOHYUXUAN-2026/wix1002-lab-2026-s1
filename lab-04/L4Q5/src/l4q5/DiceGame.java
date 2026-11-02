/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q5;
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
        Random r = new Random();
        int[] score= new int[2];
        int player=0;
        
        while(true){
            
            int roll;
            
            do{
                roll=r.nextInt(6)+1;
                score[player]+=roll;
                System.out.println("Player "+(player+1)+" rolls "+roll+" ->total "+score[player] +((roll==6&&score[player]<=100)?"(Rolls again)":""));
            }while(roll==6&&score[player]<=100);
            
            if(score[player]>100){
                System.out.println("Player "+(player+1)+" wins.");
                break;
            }
            
            player=1-player;       
        }
        
        
              
    }
    
}
