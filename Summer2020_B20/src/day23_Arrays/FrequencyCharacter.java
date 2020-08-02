package day23_Arrays;

import java.util.Scanner;

/*
write a prgram that can return the frequency of every single characters from the string:
			ex:
				str1 = "aabbccaa";
				output: a4b2c2
HINT:
	easier approach:
	1. remove duplicates ==> str2 = "abc"
	2. then find each of str2' character' frequency in str1 ==> 4, 2, 2
    3. result: a4b2c2

previous section we leaned how to find the frequency of one character.
you will need to repeat the same steps
 */
public class FrequencyCharacter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your Text :");
        String str = scan.nextLine();// A
        String nonDup="";      // BCD
        String result= "";

        for (int i = 0 ; i <= str.length()-1; i++){// remove duplucate ==>
           String ch = ""+str.charAt(i);// B B C C D D
            if (nonDup.contains(ch)){
                continue;
            }else{
                nonDup += ch;
            }

        }

        // B2C2D2
        // BBCCDD                   nonDup= BCD ==> B2C2D2

       for (int j = 0 ; j <=nonDup.length()-1; j++){

           char ch=nonDup.charAt(j);// B
           int count=0;
           for (int i =0 ; i<=str.length()-1; i++){
               if (str.charAt(i)== ch){
                   count++;
               }
           }
           result+= ""+ch+count;

       }

        System.out.println(result);


        }

    }

