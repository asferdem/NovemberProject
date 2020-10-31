package com.cybertek.tests.day11_Utilreview_Actions;

public class Singleton {

    private Singleton(){ }

    private static String word;

    public static String getWord(){
        if (word==null){
            System.out.println("First time call. Word Object is null. " +
                    "Assigning value to it now!");
            word="something";

        }else{
            System.out.println("Word already has value");
        }
        return word;

    }





}
