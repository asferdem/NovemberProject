package day34_WrapperClasses;

import java.util.ArrayList;

public class List_Intro {
    public static void main(String[] args) {
        ArrayList<Integer> scores=new ArrayList<>();

        scores.add(95);//index 0
        scores.add(100);// index 2
        scores.add(85);// index 3
        scores.add(75);

        scores.add(1,65);
        scores.add(5,70);

        //scores.add(7,70); ==>Index: 7, Size: 5 eror

        System.out.println(scores);
        scores.get(2);
        System.out.println(scores.get(2));

        System.out.println(scores.size());



    }
}
