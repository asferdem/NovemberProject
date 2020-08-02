package day13_Scanner;
/*
 write a java program that can convert any given numbers between 0 ~ 9 to words,
 if the number is greater than 9 or less than zero, out put should be "Invalid".
			MUST use Scanner and nested IF
 */
import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your number : ");
        int number= scan.nextInt();

        if (number>=0 && number<=6){
            if (number==0){
                System.out.println( number+ "= zero");
            }else if(number==1){
                System.out.println( number+ "= One");
            }else if (number==2){
                System.out.println( number+ "= Two");
            }else if (number==3){
                System.out.println( number+ "= Three");
            }else if (number==4){
                System.out.println( number+ "= Four");
            }else if (number==5){
                System.out.println( number+ "= Five");
            }else{
                System.out.println( number+ "= Six");
            }


        }else {
            System.out.println("invalid number");
        }

    }
}
