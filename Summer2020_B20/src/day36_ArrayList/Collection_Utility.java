package day36_ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class Collection_Utility {
    /*
    Collections : utility for collections
     */
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(15);
        list.add(40);
        list.add(10);

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        System.out.println("Max is: "+list.get(list.size()-1));
        System.out.println("min is "+list.get(0));





    }
}
