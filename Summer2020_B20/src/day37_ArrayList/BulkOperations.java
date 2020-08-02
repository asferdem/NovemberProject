package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
// contains.All()
        boolean r1=list.contains(1);// true
        ArrayList<Integer> elements= new ArrayList<>();
        elements.add(1);
        elements.add(2);
        elements.add(4);
        boolean r2=list.containsAll(elements);
        System.out.println(r2);
        System.out.println("===========================================");
//Arrays.asLIst()
        ArrayList<Integer> list2=new ArrayList<>();

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        // verify 1,2,4 are contained in the list2

       boolean r3= list2.containsAll( Arrays.asList(1,2,4) );
        System.out.println(r3);
        System.out.println("======================================");
        // addAll()
        ArrayList<Integer> numbers= new ArrayList<>();
        Integer[] nums={30,25,40,15,55,65,75,85,95,100};

        numbers.addAll( Arrays.asList(30,25,40,15,55,65,75,85,95,100));
       // numbers.addAll( Arrays.asList(nums));

        System.out.println(numbers);
        System.out.println("=================================");

        //removeAll()
        ArrayList<Integer> list3=new ArrayList<>();
        list3.addAll(Arrays.asList(30,25,40,15,55,65,75,85,95,100,25));
        System.out.println(list3);
         // remove (25,15,100)
        list3.removeAll(Arrays.asList(25,15,100));
        System.out.println(list3);

        System.out.println("==============================");
// retainAll()
        ArrayList<Integer> list4=new ArrayList<>();

        list4.addAll(Arrays.asList(1,1,2,2,3,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,11,12));
        System.out.println(list4);

        list4.retainAll(Arrays.asList(1,2,3,9));
        System.out.println(list4);






    }
}
