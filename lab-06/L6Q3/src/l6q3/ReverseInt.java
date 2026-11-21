/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l6q3;
import java.util.Random;
/**
 *
 * @author yuxuankoh
 */
public class ReverseInt {

    public static int[] reversed(int[] num){
        int[] reverseNum = new int[10];
        for(int i=0;i<num.length;i++){
            int temp = num[i];
            while(temp!=0){
                int digit=temp%10;
                reverseNum[i]= reverseNum[i]*10+digit;
                temp=temp/10;
            }
        }
        return reverseNum;
        
    }
    public static void main(String[] args) {
        Random r = new Random();
        int[] num= new int[10];
        System.out.print("Original numbers: ");
        for(int i=0;i<num.length;i++){
            num[i]=r.nextInt(10000);
            System.out.print(num[i]+ " ");
        }
        System.out.println();
        int[] result=reversed(num);
        System.out.print("Reversed numbers: ");
        for(int i =0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
        System.out.println();
    }
    
}
