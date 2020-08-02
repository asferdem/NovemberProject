package OfficeHours.Practice_07_07_2020;

import java.util.Scanner;

public class Reverse_with_For_While {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your Text");
        String str = scan.nextLine();
        //            0123456  index number
        /*str.charAt(6);//'0'
        str.charAt(5);//'2'
        str.charAt(4);//'0'
        str.charAt(3);
        str.charAt(2);
        str.charAt(1);
        str.charAt(0);

                */
        String rev= "";
        for (int i =str.length()-1 ; i>=0; i--){
            rev+=str.charAt(i);

        }
        System.out.println(rev);
        System.out.println("=======================================");

        String res2= "";

        int index=str.length()-1;

        while (index>=0){

            res2+=str.charAt(index);

            index--;

        }
        System.out.println(res2);



    }
}
