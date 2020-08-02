package day20;

import java.util.Scanner;

public class DivisionRemainder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int count = 0;
        for (int i= b; i<=a; i+=b){
            count++;
        }
        System.out.println(count);


    }
}
