package day15_String;

import java.util.Scanner;

public class Practice1 {
    public static void main(String_substring_methods[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName=scan.next();// Cybertek
        char ch1 =firstName.charAt(0);

        System.out.println("Enter your last name");// School
        String lastName= scan.next();
        char ch2=lastName.charAt(0);

        System.out.println("Your initial is: "+ ch1+"."+ch2);



    }
}
