package day27_Recap;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[]  arr= {1,2,3,4,5};
        for (int i = 0 ; i<=arr.length-1 ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("=====================================");
        for (int each : arr){
            System.out.print(each+" ");
        }
        System.out.println();
        System.out.println("==============================================");
        for (int i = arr.length-1 ; i>=0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("=======================================");
        int[] scores = { 10,20,30,40,50,60,70,80,90,100,110};

        for (int each : scores){
            if (each %3!=0){
                continue;
            }
            System.out.print(each+" ");
        }
        System.out.println();
        System.out.println("======================================");
       String[] str={"AB","ABC","A","AB","ABCD"};

       for (String each : str){
           if (!each.contains("C")){
               continue;
           }
           System.out.println(each);
       }
        System.out.println("=============================================");
       int[] num={80,75,65,110,90,45,56,78,};
       int max=num[0];
       int min =num[0];
       for (int each : num){
           if (each>=max){
               max=each;
           }
           if (each<=min){
               min=each;
           }
       }
        System.out.println("Max number is "+ max);
        System.out.println("Min number is "+ min);
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        System.out.println("Max number is "+ num[num.length-1]);
        System.out.println("Min number is "+ num[0]);






    }
}
