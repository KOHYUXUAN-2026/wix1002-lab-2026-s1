/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l6q2;
import java.util.Scanner;
/**
 *
 * @author yuxuankoh
 */
public class MultiPrint {

    public static void multiPrint(int n,char c){
        for(int i=0;i<n;i++){
            System.out.print(c);
        }
    }
    
    public static void rightTriangle(int size){
        for(int row=1;row<=size;row++){
            multiPrint(row,'*');
            System.out.println();
        }
    }
    
    public static void centredTriangle(int size){
        for(int row=1;row<=size;row++){
            multiPrint(size-row,' ');
            multiPrint(2*row-1,'*');
            System.out.println();
        }
    }
    
    public static void diamond(int size){
        centredTriangle(size);
        for(int row=size-1;row>=1;row--){ //print the same rows upside down without repeating the widest row.
            multiPrint(size-row,' ');
            multiPrint(row*2-1,'*');
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        if(size<1){
            System.out.println("The size must be at least one.");
            return;
        }
        System.out.println("Triangle:");
        rightTriangle(size);
        System.out.println("Centred Triangle:");
        centredTriangle(size);
        System.out.println("Diamond:");
        diamond(size);
    }
    
}
