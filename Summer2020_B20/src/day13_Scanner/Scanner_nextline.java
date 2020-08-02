package day13_Scanner;

import java.util.Scanner;

public class Scanner_nextline {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter your Full Name :");
        String fullName = scan.nextLine();

        System.out.println("Enter Your Adress :");
        String adress = scan.nextLine();

        System.out.println("Full Name : "+fullName);
        System.out.println("Your Adress is : "+ adress);
        scan.close();
    }
}
