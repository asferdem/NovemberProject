package day16_string_M;
/*
 Ask user to enter two words. Print first word without its first character then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */
import java.sql.SQLOutput;
import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your word 1:");
        String word1=scan.next();//Apple
        System.out.println("Enter your word 2");
        String word2=scan.next();//Banana

        System.out.println(word1.substring(1)+word2.substring(1));//ppleanana
        //String res=word1.substring(1).concat(word2.substring(1));







    }
}
