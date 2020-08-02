package string_methods;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        // leave above code alone :)
        // assume you have String array of 5 items
        //and print firt and last char of each items in one line

        //TODO: Write your code below
        for(String each: words){

            char c1 = each.charAt(0);
            char c2 = each.charAt(each.length()-1);
            System.out.println(" "+c1+c2);
        }

    }
}
