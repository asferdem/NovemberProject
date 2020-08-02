package day35_ArrayList;

import java.util.ArrayList;

public class Arraylist_methods {
    public static void main(String[] args) {
        ArrayList<String> earltBirdList =new ArrayList<>();

        earltBirdList.add("ibrahim");
        earltBirdList.add("virginia");
        earltBirdList.add("ziadin");
        earltBirdList.add("Erfan");
        earltBirdList.add("Aalia");

        earltBirdList.set(2,"Aslan");
        earltBirdList.set(0,"lan");
        System.out.println(earltBirdList);
        earltBirdList.clear();//size 0
        System.out.println(earltBirdList);
        System.out.println("===========================================");
    // remove primitive int
        ArrayList<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        System.out.println(list);
        list.remove(2);
        list.remove(3);//remove 5

        System.out.println(list);
        System.out.println("========================================");
        // remove (object)
        ArrayList<Integer> list2 =new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);


        Integer a=1;
        list2.remove(a);
        System.out.println(list2);

        int b=1;
        list2.remove(b);
        System.out.println(list2);

        ArrayList<String> list3=new ArrayList<>();
        list3.add("ibrahim");
        list3.add("virginia");
        list3.add("ziadin");
        list3.add("Erfan");
        list3.add("Aalia");

        System.out.println(list3);

        list3.remove("ziadin");
        //list3.remove(2);
        System.out.println(list3);

        boolean r=list3.remove("erfan");
        System.out.println(list3);
        System.out.println(r);



    }
}
