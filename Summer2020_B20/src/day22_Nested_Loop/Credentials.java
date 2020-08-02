package day22_Nested_Loop;

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {
        /*
        user name :cyber
        password : tek123
        */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your user name");
        String u =scan.next();
        System.out.println("Enter your password ");
        String p =scan.next();
         int i=0;

        while (!( u.equals("cyber") && p.equals("tek123"))){
            if(i==3){
                System.out.println("Your account is locked!");
                System.exit(0);
            }
            System.out.println("Invalid Username and password, Please re- enter");
            System.out.println("Enter your user name");
            u=scan.next();
            System.out.println("Enter your password ");
            p=scan.next();

            i++;

        }
        System.out.println("logged in");

    }
}
