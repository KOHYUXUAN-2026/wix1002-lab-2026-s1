/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q8;
import java.util.Random;
/**
 *
 * @author yuxuankoh
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(101);
        System.out.println("n is "+n);
        
        int found = 0;
        int candidate = 2;
        
        while (found < n) {
            boolean prime=true;
            for (int divisor = 2; divisor * divisor <= candidate; divisor++) {
                if (candidate % divisor == 0) {
                    prime = false;
                    break;
                }
            }
            if(prime){
                found++;
                System.out.print(candidate+(found%10==0?"\n":" "));
            }
            candidate++;   
        }
            if(n%10!=0){
                System.out.println();
            }

        
    }
    
}
