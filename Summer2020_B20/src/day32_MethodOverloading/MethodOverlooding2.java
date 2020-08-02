package day32_MethodOverloading;

public class MethodOverlooding2 {
    public static void main(String[] args) {


        add2(10,20);
        add3(10,20,30);
        add4(10,20,30,40);

        System.out.println("=====================================");

        addition(10,20);
        addition(10,20,30);
        addition(10,20,30,40);

    }




    public static void add2(double a,double b){
        System.out.println(a+b);
    }
    public static void add3(double a,double b,double c){
        System.out.println(a+b+c);
    }

    public static void add4(double a,double b,double c,double d){
        System.out.println(a+b+c+d);
    }
    //================================================================
    public static void addition(double a,double b){
        System.out.println(a+b);
    }
    public static void addition(double a,double b,double c) {
        System.out.println(a + b + c);
    }

    public static void addition(double a,double b,double c,double d) {
        System.out.println(a + b + c + d);
    }



}
