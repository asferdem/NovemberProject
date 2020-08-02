package Day17_String_Methods;

import java.util.Scanner;

/*
write a program that can reverse the following string:

                String str = "Java";
                output: avaJ

            please provide two solutions:
                        first solution, you MUST use substring method
                        second solution, you MUST use charAt method
 */
public class task5_Reverse {
    public static void main(String[] args) {
        String str="Java";

        System.out.println(str.substring(3)+str.substring(2,3)+str.substring(1,2)+str.substring(0,1));

        System.out.println(str.substring(str.length()-3)+str.substring(0,1));

        System.out.println(""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0));

        System.out.println("===============================================");

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your  5 letter word: ");
        String str1=scan.next();

        int l=str1.length();

        if(l>1&&l<=5){
          if(l==2){
              System.out.println(str1.substring(1)+str1.substring(0,1));
          }else if (l==3){
              System.out.println(str1.substring(l-1)+str1.substring(l-2,2)+str1.substring(l-3,1));
          }else if(l==4){
              System.out.println(str1.substring(l-1)+str1.substring(l-2,3)+str1.substring(l-3,2)+str1.substring(l-4,1));
          }else{
              System.out.println(str1.substring(l-1)+str1.substring(l-2,4)+str1.substring(l-3,3)+
                                 str1.substring(l-4,2)+str1.substring(l-5,1));
          }

        }else{
            System.out.println("Invalid Word!");
        }








    }
}
