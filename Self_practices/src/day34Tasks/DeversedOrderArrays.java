package day34Tasks;

import java.util.Arrays;

public class DeversedOrderArrays {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k=arr.length-1;
        int[] arr1=new int[arr.length];
        for (int each:arr){
            arr1[k]=each;
            k--;
        }
        System.out.println(Arrays.toString(arr1));

    }
}
