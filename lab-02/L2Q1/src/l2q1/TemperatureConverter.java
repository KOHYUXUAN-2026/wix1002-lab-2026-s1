/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q1;
import java.util.Scanner;
/**
 *
 * @author yuxuankoh
 */
public class TemperatureConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in degree Fahrenheit:");
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit-32)/1.8;
        System.out.printf("Celsius: %.2f%n",celsius);
// TODO Sode application logic here
    }
    
}
