package day21;

import java.util.Scanner;

/*
Write a program that asks user to enter a string.
If string started with uppercase and ends with
lowercase letter then print true,
otherwise print false
        Ex:
           Input: Cybertek
           output: true
           Input: CyberteK
           output: false
 */
public class Tasks1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word : ");
        String word = scan.nextLine();
        char first =word.charAt(0);
        char last=word.charAt(word.length()-1);

        boolean bt= first == word.toUpperCase().charAt(0) &&
                     last== (word.toLowerCase().charAt(word.length()-1));

        if (bt){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        System.out.println("============================================");
         /*
        System.out.println("Enter a String");
        String  str = scan.next();
​
        String first ="" + str.charAt(0);
        String last = "" + str.charAt(str.length()-1);
​
        String firstUp = first.toUpperCase();
        String lastLower =last.toLowerCase();

        if(str.startsWith(firstUp) && str.endsWith(lastLower)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
​
        if(first.equals(firstUp)&&last.equals(lastLower)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

*/


    }
}
