package OfficeHours.Practice_07_27_2020;

import java.util.Arrays;

public class CombineToArrays {
    public static void main(String[] args) {

    char[] a1={'A','B','C'};
    char[]  a2={'D','E','F','G','H'};

    char[] a3=new char[a1.length+a2.length];
/*
    a3[0]=a1[0];
    a3[1]=a1[1];
    a3[2]=a1[2];

    a3[3]=a2[0];
    a3[4]=a2[1];
    a3[5]=a2[2];

 */

    int k = 0;
    for (char each: a1){
        a3[k]=each;
        k++;
    }
    for (char each:a2){
        a3[k]=each;
        k++;
    }

        System.out.println(Arrays.toString(a3));
    }
}
