package day27_Recap;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Practice1 {
    public static void main(String[] args) {
        String[] classMate={"Ayse","Erdem","Ali"};

        System.out.println(classMate[1]);
        System.out.println("=================================");

        for(int i =0 ;i<= classMate.length-1 ; i ++){
             if(classMate[i].startsWith("A")) {
                 continue;
             }
                 System.out.println(classMate[i]);

        }
        System.out.println("============================================");

        int[] number= new int[5];
        System.out.println(Arrays.toString(number));

        number[3]=25;
        number[0]=100;
        number[3]=300;
        System.out.println("===========================");
        Scanner scan= new Scanner(System.in);
        System.out.println("How many names do you want to enter");

        String[] str = new String[scan.nextInt()];
        scan.nextLine();

        for (int i=0 ; i<=str.length-1; i++) {
           System.out.println(" Enter a names");
           str[i] = scan.nextLine();
       }
        System.out.println(Arrays.toString(str));























    }
}
