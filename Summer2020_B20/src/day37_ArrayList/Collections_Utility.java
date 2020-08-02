package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collections_Utility {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(30,20,56,87,45,12,10,56,89,45,63,58));
        System.out.println(list);

        //maximum number
        Integer max=Collections.max(list);
        System.out.println("Max is :"+max);
        //minimum
        Integer min=Collections.min(list);
        System.out.println("Min is :"+min);

        System.out.println("===============================================");


        ArrayList<String> names= new ArrayList<>();
        names.addAll(Arrays.asList("Fatih","Erdem","Aygul","Erva","zeynep","Fatih"));
        System.out.println(names);

        Collections.replaceAll(names,"Fatih","Erva");
        System.out.println(names);




    }
}
