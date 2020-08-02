package day15_String;

import java.util.Scanner;

public class practice2_Concat {
    public static void main(String_substring_methods[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName= scan.nextLine();// Cybertek
        System.out.println("Enter your last name");
        String lastName= scan.nextLine();// School

        String fullName=firstName.concat(lastName);// CybertekSchool
        System.out.println("Your full name is: ".concat(fullName));





    }
}
