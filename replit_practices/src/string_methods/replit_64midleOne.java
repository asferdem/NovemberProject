package string_methods;

import java.util.Scanner;

public class replit_64midleOne {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int length= word.length();
        String result = "";
        if(length%2==0){
            if(length==2){
                result = word+word;
            }else{
                result = word.substring(length/2-1,length/2+1);
            }
        }else{
            if(length==1){
                result = word+word+word;
            }else{
                result = word.substring(length/2,length/2+1);
            }
        }
        System.out.println(result);
    }
}
