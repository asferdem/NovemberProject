package day51_Expections;

import java.util.ArrayList;

public class ExceptionHandling {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        try {

            System.out.println(list.get(1));//unchecked

        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        System.out.println("next step");







    }
}
