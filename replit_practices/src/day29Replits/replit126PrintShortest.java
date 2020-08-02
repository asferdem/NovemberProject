package day29Replits;

import java.util.Arrays;
import java.util.Scanner;

public class replit126PrintShortest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] str1 = str.split(",");
         System.out.println(Arrays.toString(str1));
        String shortest = str1[0];
        for (String each : str1) {
            if (each.length() < shortest.length()) {
                shortest = each;
            }
        }
        String result="";
        for (String each : str1) {
            if (each.length() == shortest.length()) {

                result += each +", ";
            }
        }
        result=result.substring(0,result.length()-1);
        System.out.println(result);
        String[] last=result.split(",");
        Arrays.sort(last);
        System.out.println(Arrays.toString(last));

    }
}