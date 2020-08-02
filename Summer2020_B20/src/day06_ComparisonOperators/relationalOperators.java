package day06_ComparisonOperators;

public class relationalOperators {
    public static void main(String[] args) {
        boolean r1 = 10 > 9 ;// true
        System.out.println(r1);
        boolean e2 = 100<9000;
        System.out.println(e2);// true

        boolean r3 = 87>= 85 ;
        System.out.println(r3);//true
        boolean r4  = 90<= 85 ;
        System.out.println(r4);//false

        boolean r5 = 85==85;
        System.out.println(r5);// true
        boolean r6="fatih"!="erdem";
        System.out.println(r6);// true
        boolean r7 = 's'== 'S';
        System.out.println(r7);// false
        boolean r55 = 'A'== 65;// true
        System.out.println(r55);
        boolean r44 = 100 == 100.0 ;//true
        boolean r33 = 10== (int)10.9999999;// true
        int num = 100;

        boolean even = 100%2 == 0 ;// true ****
        int num1= 101;
        boolean odd = 99%2 != 0 ;// true *****
        System.out.println(even);
        System.out.println(odd);
        int x = 1000;
        boolean ev = x%3 == 0 ;// false
        System.out.println(ev);




    }
}
