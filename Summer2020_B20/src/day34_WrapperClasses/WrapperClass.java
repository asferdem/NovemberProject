package day34_WrapperClasses;

import java.lang.reflect.Array;
import java.util.Arrays;

public class WrapperClass {
    public static void main(String[] args) {

        Integer num=100;
        int a=100;

        byte t= 100;
        int z=t;

        Integer t2=a;
        Byte b=10;
        int aa=b;
      Integer n3=new Integer(123);

        int[] arr = new int[3];
        System.out.println(Arrays.toString(arr));

        int p1=50;
        Integer p2=p1;//Autoboxing


        Integer q2=500;
        int q1=q2;//unboxing


    }
}
