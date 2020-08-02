package day06_ComparisonOperators;

public class implicit_explicit {
    public static void main(String[] args) {
        short s1 = 100;
        long  l1 = s1;// implicit casting automaticly done
        long l2= (long)s1; // manually not neccesery
        int I1 = 300;
        double D1 = I1; // = (double)I1 ==>300.0


        System.out.println(D1);
        System.out.println("=================================================");
        long L1 = 4400;
        short sh1 = (short)L1;
        System.out.println(sh1);// 4400
        int num1 = 1000;
        byte b1= (byte)num1;// -24
        System.out.println(b1);
        double dd2 = 34.5;
        float f1 = (float)dd2;//34.5
        float f2 = (int)dd2;//34.0

        System.out.println(f1);
        System.out.println(f2);


    }
}
