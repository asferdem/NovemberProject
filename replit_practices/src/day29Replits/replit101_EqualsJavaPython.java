package day29Replits;

import java.util.Scanner;

public class replit101_EqualsJavaPython {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String sentence = scan.nextLine().toLowerCase();
    int countj=0;
    int countP=0;
    for (int i = 0 ; i<=sentence.length()-4;i++){
        if (sentence.substring(i,i+4).equals("java")){
            countj ++;
        }
    }
        for (int i = 0 ; i<=sentence.length()-6;i++){
            if (sentence.substring(i,i+6).equals("python")){
                countP ++;
            }
        }
        System.out.println(countj);
        System.out.println(countP);

        System.out.println(countj==countP);


    }
}
