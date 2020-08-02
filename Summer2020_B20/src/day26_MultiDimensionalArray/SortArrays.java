package day26_MultiDimensionalArray;

import java.util.Arrays;

/*
write a program that can sort the array in descending order
       ex:
            arr1: { 10, 11, 8, 9, 12, 5, 15};
            output:
                arr2: {15, 12, 11, 10, 9, 8, 5}

 NOTE: at the end, you must have have an array that contains
      the desending order of the original array
 */
public class SortArrays {
    public static void main(String[] args) {
        int[] arr1={10, 11, 8, 9, 12, 5, 15};
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2= new int[arr1.length];
/*
              arr2[0]=arr1[2];
              arr2[1]=arr1[1];
              arr2[2]=arr1[0];
            */
              int k=arr1.length-1;
              for (int i=0 ; i<=arr2.length-1; i++){
                  arr2[i]=arr1[k];
                  k--;
              }
        System.out.println(Arrays.toString(arr2));
    }
}
