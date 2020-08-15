package day34_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {
        String str="123";

     int a=Integer.parseInt(str);//123

     System.out.println(str+1);//1231
     System.out.println(a+1);//124

     Double d1=Double.parseDouble("7.5");
     System.out.println(d1+1);

     String str1="TRUE";
     boolean b=Boolean.parseBoolean(str1);
     System.out.println(b);
     System.out.println(!b);


     System.out.println("======================================");

     String str4="10000.5";
     double d2=Double.valueOf(str4);
     System.out.println(d2+1);

     String s3="False";
     boolean b2=Boolean.valueOf(s3);
     System.out.println(b2);







    }
}
