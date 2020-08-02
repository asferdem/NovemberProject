package day15_String;
//import java.lang.String; // not mandatory
//import java.util.Scanner;
public class String_Intro {
    public static void main(String_substring_methods[] args) {
        String str= "Cybertek";
        //Scanner input=new Scanner(System.in);
        String str1 = "School";// memories  string pool (literal)


        String str2 = new String("very good");// memories String  java heap
        String str3 = new String("Stuff");


        String s1= "Cat";
        String s2= "Cat";

        System.out.println(s1==s2);// true
        String d1= "Dog";
        String d2= "dog";
        System.out.println(d1==d2);//false

        String t1 = new String("Tiger");// memory java heap but different location
        String t2= new String("Tiger");
        System.out.println(t1==t2);// false




        System.out.println("==========================================");
        String c1 = "Cybertek";// String pool
        String c2 = new String ("Cybertek");// Java heap
        String c3 = new String("Cybertek");// java heap
        String c4 = "Cybertek";// string pool
        String  c5="cybertek";// String pool

        System.out.println(c1==c2);// false but different location
        System.out.println(c2==c3); // false same location but different area

        System.out.println(c1==c4);// true only one in string poll
        System.out.println(c4==c5);// same pool but different word that is why false
        System.out.println("==========================================");
        String st1 = "java";
        st1="JavaScript";// re ashing it

        System.out.println(st1);//javaScript

        st1="java";
        System.out.println(st1);// java






    }




}
