/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q6;
import java.util.Scanner;
/**
 *
 * @author yuxuankoh
 */
public class EnergyCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the amount of water in gram: ");
        double water = sc.nextInt();
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double initialF = sc.nextDouble();
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double finalF = sc.nextDouble();
        
        double M = water/1000;
        double initialC = (initialF-32)/1.8;
        double finalC = (finalF-32)/1.8;
        
        double Q =M*(finalC-initialC)*4184;
        System.out.printf("The energy needed is %e\n",Q);
        
    }
    
}
