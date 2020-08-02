package day17_String_practice;

public class Poll_VS_Heap {
    public static void main(String[] args) {
        String s1="Cybertek";// string pool
        String s2 ="Cybertek";// pool

        String s3=new String("Cybertek");//heap
        String s4=new String("Cybertek");//heap but different location heap

        String s5="cybertek";//poolbut different  because of keys sensitive

        System.out.println(s1==s2); //true

        System.out.println(s1==s3);// false

        System.out.println(s3==s4);// false because different locations

        System.out.println(s5==s2);// false






    }

}
