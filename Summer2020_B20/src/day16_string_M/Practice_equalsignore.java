package day16_string_M;

import java.util.Scanner;

public class Practice_equalsignore {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Are you employed");
        //String answer=scan.next().toLowerCase();
        String answer=scan.next();
        if (answer.equalsIgnoreCase("yes")){
            System.out.println("Employed");
        }else{
            System.out.println("Not employed");
        }

    }
}
