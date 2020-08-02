package day07_Unary_ShortHand;

public class post_VS_Pre {

    public static void main(String[] args) {
        int b= 10;
        int s=22;
        System.out.println(s++);//22 not immediately
        System.out.println(s);//23
        System.out.println(s--);
        System.out.println(s);
        System.out.println("==================================");
        int c= 25;
        int d= c++;// d=25s
        System.out.println(c);
        System.out.println(d);
        System.out.println("==================================");
        int f=8;
        int e=f--;
        System.out.println(e);//8
        System.out.println(f);//7

        int A =1;
        A = -A-- + A++ / -A-- * --A;
        // A= -1 +  0  / -1 * -1
        System.out.println(A);// -1
        System.out.println("==================================");
        int m = 50;
        m = --m + m++ + m-- + m++;
        // m= 49 + 49 + 50 + 49
        System.out.println(m);
        System.out.println("==================================");
        int z= 4;
        int y = z * 4 - z++;
        // y = 4  * 4 - 4
        System.out.println(y);













    }
}
