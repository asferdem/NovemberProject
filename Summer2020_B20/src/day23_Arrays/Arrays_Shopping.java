package day23_Arrays;

public class Arrays_Shopping {
    public static void main(String[] args) {

        String[] shoppingList = new String[7];
        shoppingList[0]="Toilet Paper";
        shoppingList[1]="Sanitizer";
        shoppingList[4]="Eggs";
        shoppingList[6]="Oil";
        shoppingList[2]="Beer";
        shoppingList[3]="Bread";
        shoppingList[5]="Milk";
        for (int i =0 ; i<=shoppingList.length-1; i++){
            System.out.println(shoppingList[i]);
        }

    }
}
