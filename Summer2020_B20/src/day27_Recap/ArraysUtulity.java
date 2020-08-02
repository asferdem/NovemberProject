package day27_Recap;

import java.util.Arrays;

public class ArraysUtulity {
    public static void main(String[] args) {
      String[] names= {"Ali","Veli","Deli","Bilo"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        int[] num={80,75,65,110,90,45,56,78,};

        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        System.out.println("max is "+num[num.length-1]);
        System.out.println("max is "+num[0]);
        System.out.println("============================================");

        String[]  s1={"A","B","C"};
        String[]  s2={"A","B","C"};

        System.out.println(  Arrays.equals(s1,s2)     );
        String[]  s3={"C","B","A"};
        System.out.println(  Arrays.equals(s1,s3)     );



    }
}
