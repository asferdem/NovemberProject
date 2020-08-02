package day32_MethodOverloading;

import java.util.Arrays;

/*
 write a method that can add element to an array, the method accepts an array and and a number,
    then returns the new array by appending the number to the last index of the given array
        Ex:
            int[] arr = {1,2,3};
            int num = 4;
            addElement(arr, num); ===> {1,2,3,4}
 */
public class AddElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int num = 11;
        //addElement(arr, num); ===> {1,2,3,4}

        int[] arr2=new int[arr.length+1];
        arr2[arr2.length-1]=num;
        int i =0;

        for(int each: arr){
            arr2[i]=each;
            i++;
        }

        System.out.println(Arrays.toString(arr2));

        System.out.println("=================================================");


        int[] score = {50,60,75,80,90};
        int n1= 87;
        score=addElement(score,n1);
        System.out.println(Arrays.toString(score));
    }

    public static int[] addElement(int[] arr,int num){

        int[] arr2=new int[arr.length+1];
        arr2[arr2.length-1]=num;
        int i =0;

        for(int each: arr){
            arr2[i]=each;
            i++;
        }
        return arr2;
    }







}
