/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q1;
import java.util.Scanner;
/**
 *
 * @author yuxuankoh
 */
public class IntegerFactor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter an Integer: ");
      int num = sc.nextInt();
      
      if(num<=0){
          System.out.println("Please enter a positive number.");
          return;
      }
      
      System.out.print("The factors are: 1");
      for(int i=2;i<=num;i++){
          if(num%i==0)
              System.out.print(","+i);
      }
      System.out.println();
    }
    
}
