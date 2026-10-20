/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q3;
import java.util.Random;
/**
 *
 * @author yuxuankoh
 */
public class RandomNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int num1 = rand.nextInt(41)+10;
        int num2 = rand.nextInt(41)+10;
        int num3 = rand.nextInt(41)+10;
        int sum = num1 + num2 + num3;
        double average = sum/3;
        System.out.println("Int 1: "+num1+"\nInt 2: "+num2+"\nInt 3: "+num3);
        System.out.println("Sum : "+sum);
        System.out.printf("Average : %.2f%n",average);
        
    }
    
}
