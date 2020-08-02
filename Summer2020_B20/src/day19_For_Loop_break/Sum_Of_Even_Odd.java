package day19_For_Loop_break;

public class Sum_Of_Even_Odd {
    public static void main(String[] args) {
     /*
      write a program that can calculate the sum of all the even numbers between 1 ~ 100
    write a program that can calculate the sum of all the odd numbers between 1 ~ 100
      */
        int sumofEven = 0;
        for(int i =0 ; i <=100 ; i+=2){
            sumofEven+=i;
        }
         System.out.println("Sum of even Number : "+ sumofEven);

        System.out.println("================================");
        int sumOfOdd = 0;
        for ( int i = 1 ; i <100 ; i+=2){
            sumOfOdd +=i;
        }
        System.out.println("Sum of Odd Number : "+ sumOfOdd);
    }
}
