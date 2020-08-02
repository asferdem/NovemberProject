package day24_Arrays;

import java.util.Scanner;

/*
write a program that asks user how many numbers he wants to enter,
and get all the user inputs and store them into an array variable,
and then write the program that can return maximum and minimum numbers
 */
public class Max_MIn_Arrays {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How many numbers would you like to enter");
        int num = scan.nextInt();
        int[] arr = new int[num];

        for (int i =0 ; i<num ;i++){
            System.out.println(" Enter your number :");
            int number=scan.nextInt();
            arr[i] = number;
        }
        int max =arr[0];
        int min = arr[0];

        for (int i = 0 ;i<= arr.length-1;i++ ){

            if(arr[i]>max){
                    max=arr[i];
                }
                if (arr[i]<min){
                    max=arr[i];
                }
            }

        System.out.println("Maximum Number is: "+max);

        System.out.println("Minimum Number is: "+min);





    }

}
