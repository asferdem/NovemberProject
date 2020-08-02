package day24_Arrays;

import java.util.Scanner;

public class Uniqe_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str =scan.nextLine();
        String unique="";

        for ( int j = 0 ; j <=str.length()-1; j++){
            char ch1= str.charAt(j);
            int count1= 0;
            for (int i =0 ; i<=str.length()-1; i ++){

                char each=str.charAt(i);
                if (ch1==each){
                    count1+=1;
                }
            }
            if (count1==1){
                unique += ch1;
            }
        }


        System.out.println(unique);

    }
}
