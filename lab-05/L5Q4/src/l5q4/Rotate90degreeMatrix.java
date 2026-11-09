/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5q4;

/**
 *
 * @author yuxuankoh
 */
public class Rotate90degreeMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] original={
            {1,5,7},
            {3,6,9},
            {5,3,8}
        };
        
        System.out.println("3 by 3 Matrix");
        
        for(int row=0;row<original.length;row++){
            for(int col=0;col<original[row].length;col++){
                System.out.print(original[row][col]+" ");
            }
            System.out.println();
        }
        
        int[][] rotated= new int[3][3];
        
        for(int row=0;row<original.length;row++){
            for(int col=0;col<original[row].length;col++){
                rotated[col][2-row]=original[row][col];
            }
        }
        
        System.out.println("After rotates 90 degress clockwise");
        
        for(int row=0;row<rotated.length;row++){
            for(int col=0;col<rotated[row].length;col++){
                System.out.print(rotated[row][col]+" ");
            }
            System.out.println();
        }
        
                

    }
    
}
