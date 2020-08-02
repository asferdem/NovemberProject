package day13_Scanner;

import java.util.Scanner;

public class next_practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first Name : ");
        String firstName= scan.next();

        System.out.println("Enter your gender ; ");
        String lastName = scan.next();
        scan.next() ;

        String fullname = firstName+" "+lastName;


        System.out.println("Full Name is : "+ fullname);
scan.close();
    }
}
