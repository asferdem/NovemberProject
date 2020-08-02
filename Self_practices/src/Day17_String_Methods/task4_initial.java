package Day17_String_Methods;

import java.util.Scanner;

/*
 write a program that asks user's first and last name, then prints out the initials of the user
 */
public class task4_initial {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your First Name: ");
        String name = input.next();

        System.out.println("Enter your last Name: ");
        String surName = input.next();
        String initial=name.substring(0,1)+surName.substring(0,1);
        initial=initial.toUpperCase();
        System.out.println("Initial is : "+initial);




    }
}
