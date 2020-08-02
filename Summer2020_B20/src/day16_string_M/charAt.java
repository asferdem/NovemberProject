package day16_string_M;

import java.util.Scanner;

/*
Ask user to enter a word. Print true is the first and last characters of the string are same characters, print false otherwise.
            Input:
                abba
            Output:

 */
public class charAt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter word 1:");
        String word1=scan.next();

        char firstChar=word1.charAt(0);
        char lastChar=word1.charAt(word1.length()-1);

        System.out.println(firstChar==lastChar);
        scan.close();


    }
}
