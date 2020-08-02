package string_methods;

import java.util.Scanner;

public class replit67 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your word");
        String word=scan.next();

        int length=word.length();
        if (length<5){
            System.out.println("Too short!");
        }else if (length>5){
            System.out.println("Too long!");
        }else {
            System.out.println(""+word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0));
        }




    }
}
