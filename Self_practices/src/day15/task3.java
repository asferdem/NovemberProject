package day15;

import java.util.Scanner;

/*
Ask user to enter a word. Print true is the first and last characters of the string are same characters, print false otherwise.
            Input:
                abba
            Output:

 */
public class task3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your word :");
        String word=scan.next();
        int lenght=word.length();
        if (word.charAt(0)==word.charAt(lenght-1)){
            System.out.println("True");
        }else{
            System.out.println("False");
            scan.close();
        }



    }
}
