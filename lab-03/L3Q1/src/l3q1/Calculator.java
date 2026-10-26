/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q1;
import java.util.Scanner;
/**
 *
 * @author yuxuankoh
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integer number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.print("Enter the operand: ");
        char operand = sc.next().charAt(0);
        
        switch (operand) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                }
                break;
            case '%':
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                }
                break;
            default:
                System.out.println("Invalid operator: " + operand);      
        }
    }
    
}
