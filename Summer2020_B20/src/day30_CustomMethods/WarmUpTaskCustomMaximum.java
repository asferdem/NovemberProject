package day30_CustomMethods;

import java.util.Arrays;

/*
	3. create a function that can print out the combination of two integer arrays
	4.		step1: create a function that can check if the given integer is positive, negative or zero
		step2: Use the above method to  write a program that can check every single elements of an array of Integers
		MUST use for each loop
 */
public class WarmUpTaskCustomMaximum {
    public static void main(String[] args) {
        maxNum(10, 25);
        maxNum(2, 2);
        System.out.println("====================================");
        int arr[]={5,2,3,4,5,6,4,7,0,-5,-54,-55,-5,54,-45,-45,-45};
        printDecender(arr);
        System.out.println("====================================");
        int[] a1={1,2,3};
        int[] a2={ 4, 5,6 };
        combine2Arrays(a1,a2);
        System.out.println("====================================");
        isPos(100);
        isPos(-150);
        isPos(0);
        System.out.println("====================================");
        int arr3[]={5,2,3,4,5,6,4,7,0,-5};
        for (int each:arr3){
            isPos(each);
        }
    }
    //Task1 : create a function that can print out the maximum number between two numbers
    public static void maxNum(int a, int b) {
        if (a == b) {
            System.out.println("Equals");
            return;
        }
        if (a >= b) {
            System.out.println(a + " is maximum");
        } else {
            System.out.println(b + " is maximum");
        }
    }
    //Task2 :create a function that can print out the array of integers in descending order
    public static void printDecender(int[] arr){//{10,9,20,30,5,6,7};
        Arrays.sort(arr);
        for (int i=arr.length-1; i>=0;i--){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
}
//Task3:create a function that can print out the combination of two integer arrays
    //{1,2,3} { 4, 5,6 } ==> {1,2,3,4,5,6}
    public static void combine2Arrays(int[] arr1,int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;
        for (int each : arr1) {

            arr3[i] = each;
            i++;
        }
        for (int each : arr2) {
            arr3[i] = each;
            i++;

        }
        System.out.println(Arrays.toString(arr3));

    }
//step1: create a function that can check if the given integer is positive, negative or zero
//step2: Use the above method to  write a program that can check every single elements of an array of Integers
    public static void isPos(int num){

        if (num>0){
            System.out.println(num+" is positive");
        }else if(num<0){
            System.out.println(num+" is negative");
        }else{
            System.out.println(num+" is Zero");
        }
    }



}
