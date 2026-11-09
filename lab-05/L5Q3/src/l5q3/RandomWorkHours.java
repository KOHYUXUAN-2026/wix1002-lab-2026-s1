/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5q3;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author yuxuankoh
 */
public class RandomWorkHours {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        System.out.print("Enter number of employees: ");
        int n=sc.nextInt();
        
        int[][] hour=new int[n][7];
        int[] total=new int[n];
        
        for(int i=0;i<n;i++){
            total[i]=0;
            
            for(int j=0;j<hour[i].length;j++){
                hour[i][j]=r.nextInt(8)+1;
                total[i]+=hour[i][j];
            }
        }
        
        for(int i=0;i<n;i++){
            System.out.print("Work hours in seven days for employee "+(i+1)+" : ");
            
            for(int j=0;j<hour[i].length;j++){
            System.out.print(hour[i][j]+" ");
            }
            
            System.out.println("-> total "+total[i]);
    }
    }
}
