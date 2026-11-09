/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5q2;
import java.util.Random;
/**
 *
 * @author yuxuankoh
 */
public class NonduplicateRandomNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        boolean duplicate;
        
        int[] num= new int[10];
        
        for (int i =0;i<num.length;i++){
            int ranNum=r.nextInt(21);
            duplicate=false;
            
            for(int j=0;j<i;j++){
                if(ranNum==num[j]){
                    duplicate=true;
                    break;
                }
            }
            
            if(!duplicate){
                num[i]=ranNum;
            }
            else{
                i--;
            }
        }
        System.out.println("10 non-duplicate random numbers: ");
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        
         
    }
    
}
