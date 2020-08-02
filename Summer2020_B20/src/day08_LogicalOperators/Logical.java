package day08_LogicalOperators;

public class Logical {
    public static void main(String[] args) {
        // ! : it retuns you opposite
        boolean r1 = 9> 7 ; // true
        boolean r2 = !r1 ; // false
        System.out.println(r1);// true
        System.out.println(r2);// false
        System.out.println(!false);// true
        System.out.println(!true);// false
        boolean r3 = !false == true ; // true
        System.out.println(r3);

        boolean r4 = true == !true ;// false
        System.out.println(r4);
        boolean r5 = 9 >5 && 9>10 ; // true && false==> False
        boolean r6 = !true && false ; // false
        boolean r7 = !false && 9> 8 ; // true




    }
}
