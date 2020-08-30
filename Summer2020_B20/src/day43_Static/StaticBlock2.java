package day43_Static;

import day42_Static.Tester;

public class StaticBlock2 {
    static  int a;
    static String b;
    static Tester tester1 ;

    static {
       //a=100;
      // b="Fatih";
        tester1=new Tester();
        tester1.setInfo("fatih",'M',123,"sdet",100000);
    }

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(tester1);
    }









}
