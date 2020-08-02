package day32_MethodOverloading;
import Library.Util;

import java.util.Arrays;

public class MethodCall {
    public static void main(String[] args) {
        String first="aYgul";
        String last="aabbccde";
        String fullName=Util.formatFullName(first,last);

        System.out.println(fullName);

        String uniques=Util.uniques(fullName);
        System.out.println(uniques.toLowerCase());
        String reverse=Util.reverse(fullName);
        System.out.println(reverse);
        System.out.println("===============================================");


        int[] a={200,400,500,600,50,40,400,60,800};
        int n=2500;

        a=Util.addElement(a,n);
        System.out.println(Arrays.toString(a));



    }
}
