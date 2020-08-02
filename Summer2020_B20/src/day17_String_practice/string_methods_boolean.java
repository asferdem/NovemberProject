package day17_String_practice;

public class string_methods_boolean {
    public static void main(String[] args) {

        // equals==>  case sensitive
        String s1="Cat";//pool
        String s2=new String("Cat");// heap
        String s3= new String("Cat");


        System.out.println(s1==s2);//false
        System.out.println(s1.equals(s2));//true

        System.out.println(s2.equals(s3));// true

        //equalsIgnoreCase==> ignore case sensitive
        String s4 = "java";
        String s5 = "Java";
        System.out.println(s4.equals(s5));// false

        System.out.println(s4.equalsIgnoreCase(s5));// true

        //isEmpty==> length is zero or not ==
        String str= "  ";
        System.out.println(str.isEmpty());// false

        str=str.trim();//""
        System.out.println(str.isEmpty());// true

        //contains

        String str3= "Java,C#,Python,Ruby,C++";

        System.out.println(str3.contains("Java"));//true
        System.out.println(str3.contains("java"));//false

        // System.out.println(str3.toLowerCase().contains("java"));// true

        // startsWith & endsWith

        String str5= "Cybertek";
        System.out.println(str5.startsWith("C"));//true

        System.out.println(str5.startsWith("Cyb"));//true

        System.out.println(str5.startsWith("E")||str5.startsWith("C"));// true
        //                         false       ||    true

        String str6= "Corana Virus";
        System.out.println(str6.endsWith("v"));// false
        System.out.println(str6.endsWith("Virus"));// True




    }
}
