/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q5;
import java.util.Random;
/**
 *
 * @author yuxuankoh
 */
public class DigitSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(10001);
        int digit1 = num%10;
        int digit2 = (num/10)%10;
        int digit3 = (num/100)%10;
        int digit4 = (num/1000)%10;
        int digit5 = (num/10000)%10;
        int sum = digit1+digit2+digit3+digit4+digit5;
        System.out.println("Number : "+num);
        System.out.println("Digit 1 : "+digit1);
        System.out.println("Digit 2 : "+digit2);
        System.out.println("Digit 3 : "+digit3);
        System.out.println("Digit 4 : "+digit4);
        System.out.println("Digit 5 : "+digit5);
        System.out.println("Sum of digits : "+sum);
    }
    
}
