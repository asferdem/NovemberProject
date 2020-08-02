package Day17_String_Methods;

import java.util.Scanner;

/*
Ask user to enter a word. If the first or second or both letter of the word is x,
print the word without x(s). If x is the third letter it should be printed.
If the first and second are x, both should be ignored.

					Input:
						xxode
					Output:
						ode
					Input:
						oxidex
					Output:
						oidex
 */
public class Task2_CharAt {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your word : ");
        String word= scan.next();
        if (word.startsWith("x") || word.charAt(1)=='x'){
            System.out.println(word.substring(2));
        }else if (word.charAt(1)== 'x'||word.charAt(0)=='x'){
            System.out.println(word.replace('x',' '));
        }else{

            System.out.println(word);
        }












    }
}
