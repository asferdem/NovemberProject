package day17_String_practice;

public class string_methods {
    public static void main(String[] args) {
        //charAt() ==>char
        String str="Cybertek";
         //         01234567

        char c1=str.charAt(1);
        System.out.println(c1);

        // +:
        String str2="Cybertek";
              str2=str2+" School";
              System.out.println(str2);

        // length()==>int

        String str3= "Cybertek School";

        int i1=str3.length();//15

        System.out.println(i1);//15

        // Last index: length-1
        System.out.println(str3.charAt(i1-1));// k (15-1)

        //upperCase & lowerCase

        String str4= "cybertek";

        str4=str4.toUpperCase();// CYBERTEK
        System.out.println(str4);
        System.out.println(str4);

        String str5= "JAVA";

        str5=str5.toLowerCase();//java

        //trim() remove white space

        String str6 ="          Cybertek School                   ";

        System.out.println(str6);

               str6=str6.trim();//"Cybertek"

        System.out.println(str6);

        //substring()

        String str7="I Like Java Language";
        //                  7   11
          String word=str7.substring(7,11);//Java
        System.out.println(word);

        String word2=str7.substring(12);//language
        //String word2=str.substring(12,str7.length());
        System.out.println(word2);

        //indexOf & lastIndexOf ==>int

        String str8="Hello Batch 20, Have a Wonderful day, We are happy to see you";

        int i2=str8.indexOf("W");
        System.out.println(i2);//23
        System.out.println(str8.charAt(23));//W
        int i3= str8.indexOf("We");//make it unique "We" ==>38
        System.out.println(i3);
        int i11=str8.indexOf("happy");
        System.out.println(i11);
        System.out.println(str8.charAt(45));

        String str9= "Java Java Java";
           int i4=str9.lastIndexOf("J");//10
           int i5=str9.indexOf("J");
        System.out.println(i4);
        System.out.println(i5);

        // replace & replaceFirst

        String s1 ="I like Java, Java is programing Language";
        System.out.println(s1);
        s1=s1.replace("Java","C#");
        System.out.println(s1);


        String s2 ="I like Java, Java is programing Language";
        System.out.println(s2);
        s2=s2.replaceFirst("Java","C#");
        System.out.println(s2);

















    }
}
