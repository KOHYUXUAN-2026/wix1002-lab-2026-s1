/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l6q1;

/**
 *
 * @author yuxuankoh
 */
public class TriangleNum {
    
    public static int triNum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;           
    }
    
    public static void main(String[] args) {
        System.out.println("The first 20 triangular numbers: ");
        for(int i=1;i<=20;i++){
            System.out.print(triNum(i)+" ");
        }
        System.out.println();
    }
    
}
