package day46_ConstructorCalls;

import java.util.ArrayList;
import java.util.Arrays;

public class EmploeeObjects {
    public static void main(String[] args) {

        Employee employee1=new Employee("Cristina");
        System.out.println(employee1);
        System.out.println("===========================");

        Employee employee2=new Employee("Fatih","SDET");
        System.out.println(employee2);
        System.out.println("===========================");

        Employee employee3=new Employee("ali","QA",123456);
        System.out.println(employee3);
        System.out.println("===========================");

        Employee employee4=new Employee("Fatih","SDET",456123,120000);
        System.out.println(employee4);
        System.out.println("===========================");

        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>(list);
        ArrayList<Integer> list2=new ArrayList<>( Arrays.asList(1,2,3,4,5) );
    }
}
