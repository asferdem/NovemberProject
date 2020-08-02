package day37_ArrayList;

import Library.Util;

import java.util.ArrayList;
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
        for (String each :str.split("")){
            list.add(each);
        }

        String  nondup= Util.removeDup(str);
        for (String each:nondup.split("")) {
            int count = Collections.frequency(list, each);
            System.out.print(each + count);
        }
    }
}
