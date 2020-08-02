package day08_LogicalOperators;

public class even_odd {
    public static void main(String[] args) {
        int number = 0;
        boolean even = number % 2 == 0 ;
        boolean odd = !even ;

        if (even){
            System.out.println(number + " is even number");
        }
         if (odd) {
             System.out.println(number + " is odd number");
         }

    }
}
