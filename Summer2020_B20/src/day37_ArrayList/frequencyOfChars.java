package day37_ArrayList;

import Library.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
write a program that can find the frequency of character from a String
                        DO NOT use nested loop
                        "AABBCCDDEE"  ==> "ABCDE"
 */
public class frequencyOfChars {
    public static void main(String[] args) {
        String str="AAABBC";

        ArrayList<String> list=new ArrayList<>();

        list.addAll(Arrays.asList(str.split("")));


        String  nondup= Util.removeDup(str);
        for (String each:nondup.split("")) {
            int count = Collections.frequency(list, each);
            System.out.print(each + count);
        }
    }
}
