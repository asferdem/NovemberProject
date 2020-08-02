package day20_While_Loop;

import java.util.Scanner;

/*
 write a program that can remove the duplicates from any given String
            Ex:
                input: abcabcaabb
                output: abc
 */
public class RemoveDublicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Word :");
        String str = scan.nextLine();
        //            0123

        String result= "";//"a"

        for (int i = 0 ; i<= str.length()-1 ;i++){

            String s=""+str.charAt(i);// a,a,b,b
                    if (!result.contains(s)){// if char is already cantained in result
                        result +=s;

                    }

        }
        System.out.println(result);






    }
}
