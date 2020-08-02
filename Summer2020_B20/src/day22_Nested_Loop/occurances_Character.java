package day22_Nested_Loop;

import java.util.Scanner;

/*
Write a program that can asks user to enter one string and one char and then returns the frequency of str2 in str1
			Ex
			     Input: AABAAC
			            A
			     Output: 4
 */
public class occurances_Character {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your String");
        String str = scan.nextLine();
        System.out.println("Enter Your character");
        char ch = scan.next().charAt(0);
        int count = 0;


        for (int i = 0 ; i <= str.length()-1; i++){

            char each= str.charAt(i);// a b a b c
            if (each==ch){
                count +=1;
            }

        }
        /*
        int index=0;
        while (index <= str.length()-1) {

            char each = str.charAt(i);// a b a b c
            if (each == ch) {
                count += 1;
                index++;
            }
        }
*/
        System.out.println(count);



    }
}
