/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q3;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author yuxuankoh
 */
public class Commission {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Enter the sales volume: ");
        double sales = sc.nextDouble();
        
        double commission;
        if(sales<=100)
            commission = 0.05*sales;
        else if(sales<=500)
            commission = 0.075*sales;
        else if(sales<=1000)
            commission = 0.10*sales;
        else
            commission = 0.125*sales;
        
        System.out.printf(Locale.US,"Commission : %.2f%n",commission);
    }
    
}
