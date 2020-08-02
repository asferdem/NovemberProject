package day15;
/*
Ask user to enter two words. Print first word without its first character then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:

 */
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter word 1: ");
        String word1=scan.next();
        System.out.println("Enter word 2: ");
        String word2=scan.next();

        int lenght1=word1.length();
        int lenght2=word2.length();

        String print1=word1.substring(1,lenght1);
        String print2=word2.substring(1,lenght2);
        System.out.println(print1+print2);
        scan.close();
    }
}
