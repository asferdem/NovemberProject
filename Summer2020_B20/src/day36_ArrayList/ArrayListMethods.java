package day36_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        //indexOf()

        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(40);
        int a=list.indexOf(40);// return first element index
        System.out.println(list.indexOf(40));//3
        System.out.println(a);//3

        //lastIndexOf()
        System.out.println(list.lastIndexOf(40));//5

        //contains()
        boolean b=list.contains(100);

        System.out.println(b);//false

        //equals() compare list

        ArrayList<String> list1=new ArrayList<>();
        list1.add("cybertek");
        ArrayList<String> list2=new ArrayList<>();
        list2.add("cybertek");
        System.out.println(list1);
        System.out.println(list2);

        System.out.println( list1.equals(list2) );

        //isEmpty()

        ArrayList<Integer> list3=new ArrayList<>();
        list3.add(10);
        System.out.println(list3.isEmpty());//false







    }
}
