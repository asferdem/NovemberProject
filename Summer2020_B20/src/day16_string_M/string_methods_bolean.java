package day16_string_M;

public class string_methods_bolean {
    public static void main(String[] args) {
    // isEmpty()

    String name1= "Cybertek";

    System.out.println(name1.isEmpty());//false

    String name2="";
    System.out.println(name2.isEmpty());//treue

    // equals()
    String str1= "Java";// String pool
    String str2=new String("Java");// heap

        System.out.println(str1==str2);//False

        System.out.println(str1.equals(str2));// true

        String str3= new String("Java");
        String str4=new String("Java");

        System.out.println(str3==str4);//false

        System.out.println(str3.equals(str4));// true

        String str5="Java";// pool
        String str6="java";// pool
        System.out.println(str5==str6);// true
        System.out.println(str5.equals(str6));//true

        //equelsIgnoreCase()
        String str7="JAVA";
        String str8= "java";

        System.out.println(str7.equalsIgnoreCase(str8));//true ignore case sensitivities

        //contains()
        String str = "i like learn java programming language";
        System.out.println(str.contains("python"));//false
        System.out.println(!str.contains("python"));//true

        System.out.println(str.contains("java"));//true

        //startsWith()

        String s1= "Muhtar";
        System.out.println(s1.startsWith("M"));//true
        System.out.println(s1.startsWith("j"));//false

        System.out.println(s1.startsWith("Mu"));// true

        // endsWith()











    }
}
