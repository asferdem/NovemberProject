package day36_ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Collections_Practice {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(50);
        list.add(15);

        Collections.sort(list);
        System.out.println(list);

        ArrayList<Integer> descending=new ArrayList<>();
        for (int i=list.size()-1;i>=0;i--){
            //System.out.print(list.get(i)+" ");
            descending.add(list.get(i));

        }
        System.out.println(descending);


        ArrayList<String> names=new ArrayList<>();
        names.add("ibrahim");
        names.add("virginia");
        names.add("ziadin");
        names.add("Erfan");
        names.add("Aalia");

        System.out.println(names);
        Collections.swap(names,0,4);

        System.out.println(names);

        Collections.swap(names,1,2);
        System.out.println(names);

        Collections.swap(names,0,names.size()-1);
        System.out.println(names);



        ArrayList<Character> charlist=new ArrayList<>();
        charlist.addAll(Arrays.asList('A','A','A','B','C','C'));
        System.out.println(charlist);

      int count=  Collections.frequency(charlist,'A');
        System.out.println(count);
        int count1=Collections.frequency(charlist,'B');
        System.out.println(count1);



    }
}
