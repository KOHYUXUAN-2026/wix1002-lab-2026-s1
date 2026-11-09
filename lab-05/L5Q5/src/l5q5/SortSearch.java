/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5q5;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author yuxuankoh
 */
public class SortSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        int[] num = new int[20];
        for(int i =0;i<num.length;i++){
            num[i]=r.nextInt(101);
        }
        
        System.out.println("A list of 20 random integer within 0 to 100");
        System.out.print(num[0]);
        for(int i=1;i<num.length;i++){
            System.out.print(","+num[i]);
        }
        System.out.println();
        
        for(int pass=1;pass<num.length;pass++){
            boolean swap=false;
            for(int i =0;i<num.length-pass;i++){
                if(num[i]<num[i+1]){
                    int hold=num[i];
                    num[i]=num[i+1];
                    num[i+1]=hold;
                    swap=true;
                }
            }
            if(!swap)
                break;
        }
        
        System.out.println("Array in descending order");
        System.out.print(num[0]);
        for(int i=1;i<num.length;i++){
            System.out.print(","+num[i]);
        }
        System.out.println();
        
        System.out.print("Enter a number to search: ");
        int search=sc.nextInt();
 
        //linear search
        boolean Linearfound=false;
        int linearCount=0;
        for(int i=0;i<num.length;i++){
            linearCount++;
            if(num[i]==search){
                Linearfound=true;
                break;
            }
        }
        if(Linearfound){
            System.out.println(search+" found");
        }
        else{
            System.out.println("Not found.");
        }
        System.out.println("Linear Search - "+linearCount+" loop(s)");
        
        //Binary search
        for(int pass=1;pass<num.length;pass++){
            boolean swap=false;
            for(int i =0;i<num.length-pass;i++){
                if(num[i]>num[i+1]){
                    int hold=num[i];
                    num[i]=num[i+1];
                    num[i+1]=hold;
                    swap=true;
                }
            }
            if(!swap)
                break;
        }
        
        boolean binaryfound=false;
        int binarycount=0;
        int low=0;
        int high=num.length-1;
        
        while(low<=high){
            binarycount++;
            int middle=(low+high)/2;
            if(num[middle]==search){
                binaryfound=true;
                break;
            }
            else if(num[middle]<search){
                low=middle+1;
            }
            else{
                high=middle-1;
            }
        }
        
        if(binaryfound){
            System.out.println(search+" found");
        }
        else{
            System.out.println("Not found");
        }
        System.out.println("Binary Search - "+binarycount+" loop(s)");
        }
        
     
        
        
}
