/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5q1;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author yuxuankoh
 */
public class ArrayScore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        
        if(n==0){
            System.out.println("No student and scores.");
            return;
        }
        
        int [] scores = new int [n];
        
        double sum=0;
      
        for(int i=0; i<n;i++){
            scores[i]=r.nextInt(101);
            sum+=scores[i]; 
        }
        
        int highestScore= scores[0];
        int lowestScore=scores[0];
        
        for(int i=1;i<n;i++){
            if(scores[i]>highestScore){
                highestScore=scores[i];
            }
            if(scores[i]<lowestScore){
                lowestScore=scores[i];
            }   
        }
        
        double average= sum/n;
        System.out.println("\nList of Scores:");
        for (int i =0;i<n;i++){
            System.out.println(scores[i]);
        }
        
        System.out.println("Highest Score: " + highestScore);
        System.out.println("Lowest Score: " + lowestScore);
        System.out.println("Average Score: " + average);
    }
    
}
