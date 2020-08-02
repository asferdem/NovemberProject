package day22_Nested_Loop;

import java.util.Scanner;

/*
1. Write a program that asks user to enter a string. If string started with uppercase
   and ends with lowercase letter then print true, otherwise print false
		Ex:
		   Input: Cybertek
		   output: true
		 */
public class Letter_Check {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Text :");
        String word=scan.next();

        char first=word.charAt(0);
        char last=word.charAt( word.length()-1 );

        boolean start= first >= 'A' && first <='Z';// upper case
        boolean end= last >='a' && last <= 'z';// lower case

        System.out.println(start && end);




    }
}
