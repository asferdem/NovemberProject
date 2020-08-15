package day41_toString;

public class PrintingCustomClassObjects {
    public static void main(String[] args) {
        String str=new String("Cybertec" );

        System.out.println(str);
        System.out.println(new String("School" ).toString());


        System.out.println(str.toString());

        System.out.println("========================================");

        carpet c1=new carpet();
        c1.customOrder(5,6,19,true);
        System.out.println(c1.toString());





    }
}
