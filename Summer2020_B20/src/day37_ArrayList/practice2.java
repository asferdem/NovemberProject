package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class practice2 {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,4,5,6));
        System.out.println(list);

        list.removeIf(p-> Collections.frequency(list,p)==1);
        System.out.println(list);

        System.out.println("=================================");


        ArrayList<String> names= new ArrayList<>();

        names.addAll(Arrays.asList("Anna","Canada","David","Lan","Abida","Farida"));
        System.out.println(names);

        names.removeIf(p-> p.toLowerCase().charAt(0) != p.charAt(p.length()-1));
        System.out.println(names);
    }
}

