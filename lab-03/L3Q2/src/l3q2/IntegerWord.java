/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q2;
import java.util.Random;
/**
 *
 * @author yuxuankoh
 */
public class IntegerWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(6);
        
        String word = switch(num){
            case 0 -> "zero";
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";    
            case 4 -> "four";
            default -> "five";   
        };
        System.out.println(num+" is "+word+".");
    }
    
}
