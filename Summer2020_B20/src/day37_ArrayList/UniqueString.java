package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
        1. write a program that can find the unique characters from a string
                        DO NOT use nested loop
                        "ABABCDEE"
                        output: C D

 */
public class UniqueString {
    public static void main(String[] args) {
       String str="ABABCDEEAA";
        String uniques="";
        ArrayList<String> list=new ArrayList<>();

        for (String each :str.split("")){
            list.add(each);
        }
        System.out.println(list);
        for (String each:list) {
            int count = Collections.frequency(list, each);
            if (count == 1) {
                uniques+=(each);
            }
        }
        System.out.println(uniques);
    }
}
