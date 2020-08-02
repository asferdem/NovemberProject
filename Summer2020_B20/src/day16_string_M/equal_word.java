package day16_string_M;

import java.util.Scanner;

public class equal_word {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter your first word");
        String word1=scan.next();
        System.out.println("enter your second word");
        String word2=scan.next();
        /*
        if (word1.equals(word2)){
            System.out.println("They are equal");
        }else {
            System.out.println("They are not equal");
        }


         */
        String result=(word1.equalsIgnoreCase(word2)) ? "Equal":"Not equal";
        System.out.println(result);
    }
}
