package day15_String;

import java.util.Scanner;

public class String_substring_methods {
    public static void main(String[] args) {
        String sentences="Java is fun";
                        //012345678910

        String word =sentences.substring(0,4); // Java

        System.out.println(word);

        String word2= sentences.substring(8,11);//fun
        System.out.println(word2);
    }
}
