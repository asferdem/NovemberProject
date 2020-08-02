package day20_While_Loop;

import java.util.Scanner;

public class WhileLoop_PaswordCheck {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String password = "Cybertek123";
        System.out.println("Enter your Password : ");
        String input =scan.nextLine();

        while (!input.equals(password)){
            System.out.println("Please re-enter your Password ");
            input=scan.nextLine();
        }

        System.out.println("Logged in");

    }
}
