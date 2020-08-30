package day45_ConstructorContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class Constructor {



    public Constructor(){
        System.out.println("No arg Constructor");
    }

    public Constructor(int a){
        System.out.println("With int Argument");
    }
    public Constructor(String b){
        System.out.println("String Arg");
    }
    public Constructor(int c,int d){
        System.out.println("Two arg ");
    }






    public static void main(String[] args) {

        Constructor obj1=new Constructor(10);
        Constructor obj2= new Constructor("asf");
        Constructor obj3=new Constructor();
        Constructor obj4=new Constructor(10,20);
        ArrayList<Integer> list1=new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5));

        ArrayList<Integer> list2=new ArrayList<>(list1);
        //list2.addAll(list1);
        System.out.println(list2);


    }
}
