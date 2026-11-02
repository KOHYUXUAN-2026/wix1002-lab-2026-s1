/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q7;
import java.util.Scanner;
/**
 *
 * @author yuxuankoh
 */
public class MortgageLoan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double P = sc.nextDouble();
        System.out.print("Enter interest in %: ");
        double i = sc.nextDouble();
        System.out.print("Enter total number of month(s): ");
        int N = sc.nextInt();
        
        if (P <= 0 || i <= 0 || N <= 0) {
            System.out.println("Principal, interest and months must be positive.");
            return;
        }
        
        double r = i / (12 * 100);
        double M = (P*r)/(1-Math.pow(1+r, -N));
        double totalInterest=0;
        
        System.out.printf("%-6s%18s%14s%12s%18s%18s%n","Month", "Monthly Payment", "Principal", "Interest","Unpaid Balance", "Total Interest");
        
        for(int month=1; month<=N;month++){
            double principalDue = M * Math.pow(1 + r, -(1 + N - month));
            double interestDue = M - principalDue;
            double balance = interestDue / r - principalDue;
            totalInterest += interestDue;
           
            System.out.printf("%-6d%18.2f%14.2f%12.2f%18.2f%18.2f%n",month, M, principalDue, interestDue,Math.abs(balance), totalInterest);
            
        }
           
        
        
    }
    
}
