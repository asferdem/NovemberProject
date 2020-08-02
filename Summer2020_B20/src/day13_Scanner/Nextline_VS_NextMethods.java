package day13_Scanner;

import java.util.Scanner;

public class Nextline_VS_NextMethods {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);//120000enter

        System.out.println("Enter your salary : ");
        double salary = scan.nextDouble();//120000

        scan.nextLine();// we pass enter button

        System.out.println("Enter your full name : " );
        String  fullName =  scan.nextLine();

        System.out.println("salary is " + salary);
        System.out.println("Full name : "+ fullName);

scan.close();


    }


}
