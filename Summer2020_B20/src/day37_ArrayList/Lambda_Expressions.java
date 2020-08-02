package day37_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class Lambda_Expressions {
    public static void main(String[] args) {

        ArrayList<Integer> nums=new ArrayList<>();
        nums.addAll(Arrays.asList(1,1,1,2,2,3,4,5,4,6,7,8,9));

        //Predicate<Integer> lessThan5= p-> p<5 ;
        //nums.removeIf(lessThan5);
        nums.removeIf(p -> p<5);
        System.out.println(nums);
        System.out.println("====================================");
        Predicate<Integer> oddNumbers= p ->p %2 !=0;

        ArrayList<Integer> numbers =new ArrayList<>();
        for (int i =0 ; i<=100; i++){
            numbers.add(i);
        }
        System.out.print(numbers);
        System.out.println();
        //numbers.removeIf(oddNumbers);
        //System.out.print(numbers);
        //System.out.println();


        numbers.removeIf(p -> p%2==0);
        System.out.print(numbers);
        System.out.println();

        System.out.println("==================================================");
        ArrayList<String> names=new ArrayList<>();
        names.addAll(Arrays.asList("Fatih","FAyhan","Sema","Nese","Ziiyadin","Ferva","Zeynep","Dardan"));
        System.out.println(names);

        names.removeIf(p -> p.startsWith("F") && p.endsWith("a"));
        System.out.println(names);

        System.out.println("===============================================");
        ArrayList<Integer> num=new ArrayList<>();
        num.addAll(Arrays.asList(1,1,1,2,2,3,4,4,5,6,6,7,8,9,9));

        num.removeIf(each-> Collections.frequency(num,each)!=1);//remove not unique
        System.out.println(num);
        System.out.println("===========================================");



    }
}
