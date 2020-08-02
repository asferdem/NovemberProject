package Day17_String_Methods;

import java.util.Scanner;

public class for_loop1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Your Number : ");
        int num1=scan.nextInt();
        int num2=1;

        for (int n = 1; n<=10;++n){
            num2 =num1*n;

             if (num1>=1&&num1<=10){
                System.out.println(num1+" * "+n+" = "+num2);

            }else {
                 System.out.println("Invalid Number!");
             }
        }

    }
}
