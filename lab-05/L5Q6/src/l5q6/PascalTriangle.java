/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5q6;
import java.util.Scanner;
/**
 *
 * @author yuxuankoh
 */
public class PascalTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row of Pascal Triangle to create: ");
        int n = sc.nextInt();
        
        System.out.println("The Pascal Triangle with "+n+" row(s)");
        
        int[][] matrix= new int[n][n];
        
        for(int i=0;i<matrix.length;i++){
            matrix[i][0]=1;
            matrix[i][i]=1;
            for(int j=1;j<i;j++){
                matrix[i][j]=matrix[i-1][j-1]+matrix[i-1][j];
            }
            
        }
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
            System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }   
       
    }
    
}
