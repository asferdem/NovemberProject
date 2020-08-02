package day06_ComparisonOperators;

public class swap2 {
    public static void main(String[] args) {

        int a =10;
        int b= 15;
        a=a + b;// a=25 b still = 15
        b= a-b ;// b =10 a=25
        a= a-b;// a= 15 b=10
        System.out.println(b); // 10
        System.out.println(a);// 15

    }
}
