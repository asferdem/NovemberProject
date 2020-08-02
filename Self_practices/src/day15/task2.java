package day15;

import java.util.Scanner;

/*
 Write a Java method to display the middle character of a string
        a) If the length of the string is even there will be two middle characters.
        b) If the length of the string is odd there will be one middle character.
                Input :
                    elephant
                Output:
                    The middle character in the string: ph
 */
public class task2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your word : ");
        String word=scan.next();
        int lenght = word.length();
        String print=" ";

        if (lenght%2==0){
            print=""+word.charAt(lenght/2-1)+word.charAt(lenght/2);
        }else{
            print=""+word.charAt(lenght/2);
        }
        System.out.println("The middle character in the string: "+print);


scan.close();


    }
}
