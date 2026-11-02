/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q6;
import java.util.Random;
/**
 *
 * @author yuxuankoh
 */
public class DigitCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Random r = new Random();
       int num = r.nextInt(Integer.MAX_VALUE);
       
       int digit =0;
       int remain= num;
       do{
           digit++;
           remain /=10;
       }while(remain!=0);
       
        System.out.println("Number: "+num);
        System.out.println("Number of digits: "+digit);
      
    
    }
    
}
