package day30_CustomMethods;

import java.util.Arrays;

public class RetunMethods3 {
    public static void main(String[] args) {
        int[] nums={1,5,3,4,88,55,62,-25};
        int num1=maxArr(nums);
        System.out.println(num1);
        System.out.println(num1>200);
    }





    public static int maxArr(int[] arr){
        Arrays.sort(arr);
        int max=arr[arr.length-1];
        return max;
    }


}
