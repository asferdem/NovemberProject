package day14_Recap;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class NextLine_methods_rest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = scan.nextInt();

         scan.nextLine();
        System.out.println("enter your Full Name : ");
        String fullname = scan.nextLine();
scan.close();
    }

}
