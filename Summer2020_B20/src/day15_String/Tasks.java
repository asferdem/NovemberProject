package day15_String;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your Sentences : ");
        String sentence =scan.nextLine();
        //int lastIndexNum=sentence.length()-1;

        System.out.println(sentence.charAt(0));
        System.out.println(sentence.charAt(sentence.length()-1));
        System.out.println("=============================================");

        System.out.println("Enter your first name : ");
        String firstName = scan.next().toUpperCase();
        System.out.println("Enter your last Name : ");
        String lastName=scan.next().toUpperCase();

        System.out.println(firstName+" "+lastName);




    }
}
