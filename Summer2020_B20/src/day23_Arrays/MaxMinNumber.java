package day23_Arrays;
/*
int[] arr = {10,20, 3,4,5,6,7,-10,-100, 300, 400};
write a program that can return the min and maximum number from the arrays
 */
public class MaxMinNumber {
    public static void main(String[] args) {
        int [] num ={10,20, 3,4,5,6,7,-10,-100, 300, 400};

        int max=num[0];
        int min = num [0];

        for (int i = 1 ; i<= num.length-1; i++){
            if (num[i]>=max){
                max=num[i];
            }
            if (num[i]<=min){
                min=num[i];
            }


        }
        System.out.println("Max number is :"+max);
        System.out.println("Min number is :"+min);


    }
}
