package day16_string_M;

import java.util.Scanner;

/*
Write a program StartEndWords:
    you have 2 words that must be 5 characters, and check if last letter of first word and first letter of second work are same.
        if either one not 5 chars length:    print "need to be exactly 5 chars length"
        if last letter of 1st word and first letter of 2nd word match:  print "Fizz"
        if they do not match:  print "Buzz - did not match"
        NOTE: you will need nested If
 */
public class Task1_freze_buzz {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your first word");
        String word1=scan.next();
        System.out.println("Enter your Second word");
        String word2= scan.next();


        boolean result =word1.length()==5 && word2.length()==5;

        if (result) {
            boolean b1=word1.endsWith(""+word2.charAt(0));
            boolean b2=word2.startsWith(""+word1.charAt(word1.length()-1));

            if (b1 && b2){
                System.out.println("Fizz");
            }else{
                System.out.println("Buzz");
            }

        }else{
            System.out.println("need to be exactly 5 chars length");
        }














        /*if (result){
            if ((word1.charAt(word1.length()-1))==word2.charAt(0)){
                System.out.println("Fizz");

            }else{
                System.out.println("Buzz");
            }

        }else{
            System.out.println("need to be exactly 5 chars length");
        }

         */






    }
}
