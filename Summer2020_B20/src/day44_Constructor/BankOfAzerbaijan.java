package day44_Constructor;

import java.util.ArrayList;
import java.util.Arrays;
//import static day44_Constructor.HumanResources.*;// all static class

/*
create class called BankOfAzerbaijan
        in the main method:
                1. create a List of Employees
                2. add random two employees from HumanResources to the List
                3. use for each loop to print out the employee name salary
 */
public class BankOfAzerbaijan {
    public static void main(String[] args) {

        ArrayList<Employee> list=new ArrayList<>();
       /* list.add( HumanResources.employee1);
        list.add( HumanResources.employee3);
        list.add( HumanResources.employee5);

        list.addAll(Arrays.asList(employee1,employee3,employee5));// because we import up all
        */
        list.addAll(Arrays.asList(HumanResources.employee1,HumanResources.employee3,HumanResources.employee5));

        System.out.println("Total Employee: " +list.size());

        for (Employee each:list){
            System.out.println(each.name+" : "+each.salary);

        }






    }









}
