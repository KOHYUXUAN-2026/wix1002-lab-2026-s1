/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q4;
import java.util.Scanner;
/**
 *
 * @author yuxuankoh
 */
public class SecondsConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int seconds = sc.nextInt();
        int hours = seconds/3600;
        int minutes = (seconds%3600)/60;
        int remainSeconds = (seconds%3600)%60;
        System.out.println(seconds+" seconds is "+hours+" hours, "+minutes+" minutes and "+remainSeconds+" seconds");
    }
    
}
