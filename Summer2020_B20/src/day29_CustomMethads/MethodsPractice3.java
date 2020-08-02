package day29_CustomMethads;

import javax.swing.*;

public class MethodsPractice3 {
    public static void main(String[] args) {

        oddnumbers();
        evennumbers();

    }







    public static void oddnumbers(){
        for (int i= 1 ; i <=100 ;i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void evennumbers(){
        for (int i= 0; i <=100 ;i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
    }



}
