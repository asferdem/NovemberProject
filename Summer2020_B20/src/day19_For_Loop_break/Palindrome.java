package day19_For_Loop_break;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter Your Word : ");
        String word = scan.next();
        String reverse = "";

        for (int i =word.length()-1 ; i>=0 ; i-- ){
            reverse +=word.charAt(i);
           // reverse += reverse.substring(i,i+1);
        }
        System.out.println(reverse);
        System.out.println(reverse.equals(word));


    }
}
