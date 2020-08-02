package day19_For_Loop_break;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your word : ");
        String word = input.nextLine();
        int i =word.length();
        String reverse="";

        for ( int i1=i-1 ;i1>=0;--i1){
            reverse +=word.charAt(i1);

        }
        System.out.print(reverse.toUpperCase());
        System.out.println();
        System.out.println("===================");



    }



}
