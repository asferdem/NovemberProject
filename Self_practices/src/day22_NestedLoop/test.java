package day22_NestedLoop;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your String :");
        String str =scan.next();
        String nondup="";

        for(int i=0 ;i <= str.length()-1; i++){
            String ch= " "+str.charAt(i);
            if(nondup.contains(ch)){
                continue;
            }else{
                nondup+=ch;
            }

        }
        String result ="";
        System.out.println(nondup);
        for (int j=0 ; j<=nondup.length()-1; j ++){
            char ch = nondup.charAt(j);  // B, C, D   every single characters from nonDup
            int count = 0; // 2,  2,   2    frequnecy of every single ch

            for(int i=0; i <= str.length()-1; i++){  // returns the frequnecy of each ch from string str
                if(str.charAt(i) == ch){
                    count++;
                }
            }

            result += ""+ch+ count;

        }

        System.out.println(result);
        }



    }

