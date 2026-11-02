/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q2;
import java.util.Scanner;
/**
 *
 * @author yuxuankoh
 */
public class SumSeries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer n: ");
        int n = sc.nextInt();
        int series=0,sum=0;
        for(int i=1;i<=n;i++){
            series +=i;
            sum +=series;
        }
        System.out.println("Sum: "+sum);
        }
    }
   
