package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<>();
        cars.addAll(Arrays.asList("Volvo","GMC","BMW","Mercedes","Tesla","Honda","Infinity","Tesla","WV","Lexux","BMW","Mazda"));
        //cars.remove("BMW");
        //cars.remove(2);
        System.out.println(cars);

        //cars.removeAll(Arrays.asList("BMW"));

        cars.removeIf(p->p.toLowerCase().contains("m"));
        //cars.retainAll(Arrays.asList("Tesla"));

        System.out.println(cars);


        System.out.println("=================================================");

        ArrayList<String> shoppingList=new ArrayList<>();
        shoppingList.addAll(Arrays.asList("Eggs","Milk","Paper Towels","Toilet Paper","Mango","Orange","Avakado","Orange"));

        boolean b=shoppingList.contains("Pepsi");//false
        System.out.println(shoppingList);
        System.out.println(b);

        boolean c=shoppingList.containsAll(Arrays.asList("Eggs","Milk","Orange","water"));//false

        System.out.println(c);
        System.out.println(shoppingList.size());

        shoppingList.set(shoppingList.size()-1,"Apple");
        System.out.println(shoppingList);
        shoppingList.set(shoppingList.indexOf("Paper Towels"),"Dish Washer");
        System.out.println(shoppingList);

        shoppingList.clear();
        System.out.println(shoppingList);


    }
}
