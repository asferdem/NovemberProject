package Day17_String_Methods;

import java.util.Scanner;
/*
Ask user to enter two words. Then add them together and print.
But if the last letter if the first word and the first letter of the last letter is the same,
 print that character once.
					Input:
						one
						eight
					Output:
						oneight
 */
public class task3_firs_last_same {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first word : ");
        String word1=scan.next();

        System.out.println("Enter your second word : ");
        String word2=scan.next();
         int w1=word1.length();
         if (word1.charAt(w1-1)==word2.charAt(0)){
             System.out.println(word1.substring(0,w1)+word2.substring(1));
         }else{
             System.out.println(word1+word2);
         }



    }
}
