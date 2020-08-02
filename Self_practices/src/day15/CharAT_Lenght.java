package day15;

import java.util.Scanner;

public class CharAT_Lenght {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Sentences: ");
        String sentences=input.nextLine();
        char first =sentences.charAt(0);

        int totalCharacter = sentences.length();
        int lastCharacter =totalCharacter-1;
        char last = sentences.charAt(lastCharacter);
        System.out.println("Your Sentences is "+" "+totalCharacter+" Characters" );
        System.out.println("Your First Character is: "+first);
        System.out.println("Your last Character is : "+last);



        String upper=sentences.toUpperCase();
        System.out.println(upper);

    }
}
