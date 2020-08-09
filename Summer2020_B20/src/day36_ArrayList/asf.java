package day36_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class asf {
    public static void main(String[] args) {
        String[] list = {"A","B","A","C","D","D"};


        for (int i = 0; i <list.length; i++) {
            for (int j = i + 1; j <list.length; j++) {
                if (list[i].equals(list[j])) { // got the duplicate element } } }
                    System.out.println(list[i]);

                }
            }
        }
    }
}