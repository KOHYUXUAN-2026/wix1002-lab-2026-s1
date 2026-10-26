/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q5;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author yuxuankoh
 */
public class CramerRule {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Enter a,b,c,d,e,f: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();
        
        double divisor = (a*d)-(b*c);
        if(divisor==0){
            System.out.println("The equation has no solution");
        }
        else{
            double x =((e*d)-(b*f))/divisor;
            double y =((a*f)-(e*c))/divisor;
            System.out.printf(Locale.US,"x : %.2f, y : %.2f%n",x,y);
        }
    }
    
}
