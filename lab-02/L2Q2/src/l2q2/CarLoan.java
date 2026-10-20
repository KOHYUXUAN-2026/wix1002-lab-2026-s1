/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q2;
import java.util.Scanner;
/**
 *
 * @author yuxuankoh
 */
public class CarLoan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of the car:");
        double P = sc.nextDouble();
        System.out.print("Enter down payment:");
        double D = sc.nextDouble();
        System.out.print("Enter interest rate in %:");
        double R = sc.nextDouble();
        System.out.print("Enter loan duration in year:");
        double Y = sc.nextDouble();
        double M = (P-D)*(1+R*Y/100)/(Y*12);
        System.out.printf("Monthly payment for car loan: RM%.2f%n",M);
        
    }
    
}
