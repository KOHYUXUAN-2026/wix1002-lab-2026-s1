/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q3;
import java.util.Scanner;
/**
 *
 * @author yuxuankoh
 */
public class ExamStatistics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a score [negative score to quit]:");
        int score = sc.nextInt();
        int count=0;
        int min=0,max=0;
        double sum=0;
        double square=0;
        
        while(score>=0){
            if(count==0||score<min){
                min=score;
            }
            if(count==0||score>max){
                max=score;
            }
            count ++;
            sum +=score;
            square +=score*score;
            System.out.print("Enter a score [negative score to quit]:");
            score = sc.nextInt();
        }
        double s2 = (square-(sum*sum)/count)/(count-1);
        if(count==0){
            System.out.println("No positive score entered.");
            return;
        }
        else{
            
            System.out.println(s2);
            System.out.println("Minimum Score: "+min);
            System.out.println("Maximum Score: "+max);
            System.out.printf("Average Score: %.2f%n",(sum/count));
        }
        if(count>1){
            double s = Math.sqrt(s2);
            System.out.printf("Standard Deviation: %.2f%n",s);
        }
        else{
            System.out.println("Standard deviation needs at least two score.");
        }
        
            
            
        
    }
    
}
