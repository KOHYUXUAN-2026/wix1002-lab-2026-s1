/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l6q6;

/**
 *
 * @author yuxuankoh
 */
public class PalindromePrimeEmirp {

    static boolean isPrime(int num){
        if(num<2){
            return false;
        }
        for(int divisor = 2 ; divisor*divisor<=num ; divisor++){
            if(num%divisor==0){
                return false;
            }
        }
        return true;
    }
    
    static int reverse(int num){
        int reversed=0;
        while(num>0){
            reversed=(reversed*10)+(num%10);
            num /= 10;
        }
        return reversed;
    }
    
    static boolean isPalindrome(int num){
        return num==reverse(num);
    }
    
    static boolean isPalindromePrime(int num){
        return isPrime(num) && isPalindrome(num);
    }
    
    static boolean isEmirp(int num){
        return isPrime(num) && isPrime(reverse(num)) && !isPalindromePrime(num);
    }
    
    public static void main(String[] args) {
        System.out.println("The first 20 palindromic primes");
        int count =0;
        for(int number=2;count<20;number++){
            if(isPalindromePrime(number)){
                count++;
                System.out.printf("%6d ",number);
                if(count%10==0){
                    System.out.println();
                }
            }
        }
        
        System.out.println("The fisrt 20 emirps");
        count =0;
        for(int number=2;count<20;number++){
            if(isEmirp(number)){
                count++;
                System.out.printf("%6d ",number);
                if(count%10==0){
                    System.out.println();
                }
            }
        }
    }
    
}
