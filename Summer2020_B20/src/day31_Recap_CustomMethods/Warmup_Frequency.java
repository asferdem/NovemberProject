package day31_Recap_CustomMethods;

import java.util.Arrays;

/*
write a return method called frequency that accepts two parameters: string str and char ch, the method returns the frequency of the ch from the str as an int
			Ex:
frequency("AAA", 'A') ==>  3 //frequency("ABAB", 'B') ==> 2
note: MUST use Arrays and for each loop //please copy paste the method to the util class
 */
            public class Warmup_Frequency {
            public static void main(String[] args) {
             String str="aabcccd";

             String uniqe="";

             char[] arr=str.toCharArray();

             for (char each:arr){

              int count =frequency(str,each);

              if (count==1){
               uniqe+=each;
              }
             }
             System.out.println(uniqe);
             System.out.println("=============================");
             String str2="aasdfredfcsfghjkugff";
             String uniques2=uniques(str2);
             System.out.println(uniques2);

             System.out.println("=============================");











 }




          public static int frequency(String str,char ch){
     int count = 0;
      char [] arr=str.toCharArray();
        for (char each : arr){
        if (each==ch){
            count++;
          }
          }
        return  count;
 }

          public  static  String uniques(String str) {
           String uniqe="";

           char[] arr=str.toCharArray();

           for (char each:arr){

            int count =frequency(str,each);

            if (count==1){
             uniqe+=each;
            }
           }
             return uniqe;

          }




}
