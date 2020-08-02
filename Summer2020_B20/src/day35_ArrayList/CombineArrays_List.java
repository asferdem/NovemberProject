package day35_ArrayList;

import java.util.ArrayList;

/*
write a program that can combine two String arrays into one arrayList
            ex:
                arr1 = {"A", "B", "C"};
                arr2 = {"D", "E", "F", "G"};
                list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */
public class CombineArrays_List {
    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> str= new ArrayList<>();
        for (String each :arr1){
            str.add(each);
        }
        for (String each :arr2){
            str.add(each);
        }

        System.out.println(str);



    }
}
