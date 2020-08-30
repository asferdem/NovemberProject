package day45_ConstructorContinue;

import java.util.ArrayList;
import java.util.Arrays;

/*
  create a class called ShoppingList
                create 5 objects of Item and store them into List of Items
                calculate the total cost of all Items in the list
 */
public class ShoppingList {
    public static void main(String[] args) {

        Item item1=new Item("Egg",1.5,24);
        Item item2=new Item("Water",6,24);
        Item item3=new Item("Coke",1.5,30);
        Item item4=new Item("Milk",2.5,6);
        Item item5=new Item("Bread",1.5,3);


        ArrayList<Item> list=new ArrayList<>();
        list.addAll(Arrays.asList(item1,item2,item3,item4,item5));

        double totalCost=0;
        for (Item each:list){
            totalCost+=each.calCost();
        }

        System.out.println("Total price : $"+totalCost);


    }
}
