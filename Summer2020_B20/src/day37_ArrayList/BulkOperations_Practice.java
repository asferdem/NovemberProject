package day37_ArrayList;

import day35_ArrayList.CombineArrays_List;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_Practice {
    public static void main(String[] args) {

        ArrayList<String> students= new ArrayList<>();

        students.add("Ali");
        students.add("veli");
        students.add("deli");
        students.add("aga");
        students.add("ramo");
        students.add("fatih");
        System.out.println(students);
       boolean b= students.containsAll(Arrays.asList("fatih","aga"));
        System.out.println(b);
        System.out.println("=========================================");
        ArrayList<String> group29= new ArrayList<>();

        group29.addAll(Arrays.asList("Fatih","Ayhan","Sema","Nese","Ziiyadin","Erva","Zeynep","Dardan"));
        System.out.println(group29);

        boolean r1=group29.containsAll(Arrays.asList("Dardan","Ayhan"));
        System.out.println(r1);
        System.out.println("==================================================");

        ArrayList<String> employeeList=new ArrayList<>();
        employeeList.addAll(Arrays.asList("Ahmet","Muhtar","Fatih","Ahmet","Ali","Veli"));

        System.out.println(employeeList);

        //employeeList.removeAll(Arrays.asList("Ahmet"));

        //System.out.println(employeeList);

        employeeList.retainAll(Arrays.asList("Ahmet"));
        System.out.println(employeeList);









    }
}
