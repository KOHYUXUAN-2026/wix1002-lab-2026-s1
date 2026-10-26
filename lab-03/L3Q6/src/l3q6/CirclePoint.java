/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q6;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author yuxuankoh
 */
public class CirclePoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Enter the radius of circle: ");
        double radius = sc.nextDouble();
        System.out.print("Enter a coordinate point(x y): ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        
        double distance = Math.sqrt(x*x+y*y);
        if(distance<=radius)
            System.out.printf(Locale.US,"Point(%.2f,%.2f) is inside the circle%n",x,y);
        else
            System.out.printf(Locale.US,"Point(%.2f,%.2f) is outside the circle%n",x,y);
        
    }
    
}
