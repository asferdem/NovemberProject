package Custom_ClassPractice;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    public static void main(String[] args) {
        Item item1= new Item("Water",1.75,6);
        Item item2= new Item("egg",1.20,12);
        Item item3= new Item("bread",0.85,3);
        Item item4= new Item("lemon",2.30,10);
        Item item5= new Item("cheese",8,2);

        ArrayList<Item> list=new ArrayList<>();
        list.addAll(Arrays.asList(item1,item2,item3,item4,item5));

        double totalCost=0;
        for (Item each:list){
            totalCost+=each.calcCost();
        }

        System.out.println("Total price : $"+totalCost);





    }




}
