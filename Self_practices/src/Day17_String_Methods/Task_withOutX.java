package Day17_String_Methods;

import java.util.Scanner;

/*
1. Ask user to enter a word. If the work contains starts with x,
print the word without x.
					Input:
						xcode
					Output:
						code

 */
public class Task_withOutX {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter your word : ");
        String word=in.next();
        if(word.startsWith("x")){
            System.out.println(word.substring(1));
        }



    }
}
