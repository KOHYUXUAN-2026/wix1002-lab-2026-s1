/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l6q5;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author yuxuankoh
 */
public class MultiplicationGame {
    static boolean check(int a,int b,int c){
        return a*b==c;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        int score=0;
        
        while(true){
            System.out.println("Enter negative number to quit.");
            int first=r.nextInt(13);
            int second = r.nextInt(13);
            System.out.print(first+ " x "+second+" = ");
            int num =sc.nextInt();
            if(num<0){
                break;
            }
            if(check(first,second,num)){
                score++;
            }
        }
        
        System.out.println("Your score is "+score);
    }
    
}
