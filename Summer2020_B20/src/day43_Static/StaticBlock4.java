package day43_Static;



import java.util.ArrayList;
import java.util.Arrays;

public class StaticBlock4 {

     static int[] arr=new int[3];

     static ArrayList<Integer> list=new ArrayList<>();
     static {
         arr[0]=1;
         arr[1]=2;
         arr[2]=3;

         list.add(4);
         list.add(5);
         list.add(6);

     }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(arr));
        System.out.println(list);





    }




}
