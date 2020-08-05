package day38_JavaRecap;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class Collections_Utility {
    public static void main(String[] args) {
        ArrayList<Character> chars   =new ArrayList<>();
        chars.addAll(Arrays.asList('R','S','O','D','A','C'));
        System.out.println(chars);
        Collections.sort(chars);

        System.out.println(chars);

        ArrayList<String> students=new ArrayList<>();
        students.addAll(Arrays.asList("Ali","veli","Fatih","Erva","Sueda"));

        Collections.swap(students,students.indexOf("Ali"),students.indexOf("Erva"));

        System.out.println(students);
        Collections.swap(students,students.indexOf("Erva"),students.indexOf("Ali"));
        System.out.println(students);


        ArrayList<String> items=new ArrayList<>();

        ArrayList<String> unique=new ArrayList<>();

        items.addAll(Arrays.asList("Coffee","Coffee","Egg","Battery","Battery","Battery","milk"));
        int i=Collections.frequency(items,"Battery");
        System.out.println("Battery is "+i +"times");
        System.out.println();

        for (String each : items){
          int count=  Collections.frequency(items,each);
          if (count==1){
              unique.add(each);
          }

        }
        System.out.println(unique);

        ArrayList<String> unique2=new ArrayList<>();
        unique2.addAll(items);
        System.out.println(unique2);

        unique2.removeIf(p -> Collections.frequency(unique2,p)>1);
        System.out.println(unique2);


        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(10,15,300,56,87,45,98,777,86,77,120,1000,1000,1000));

        Integer max=Collections.max(list);
        System.out.println("max is "+max);
        Integer min=Collections.min(list);
        System.out.println("min is "+min);



        Collections.replaceAll(list,1000,100000);
        System.out.println(list);
    }
}
