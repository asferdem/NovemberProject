package day21;
/*
Write a program that can asks user to enter one string and one char and
then returns the frequency of str2 in str1
            Ex
                 Input: AABAAC
                        A
                 Output: 4

 */
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("Enter Your word :");
        String word=scan.nextLine();
        System.out.println("Enter one Character :");
        String letter= scan.next();
        int num =0;

        for(int i =0; i<=word.length()-1; i++){
            if((""+ word.charAt(i)).equalsIgnoreCase(letter))
            {
                num++;
            }
        }
        System.out.println(num);









    }
}
