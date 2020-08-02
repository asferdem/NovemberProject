package day21_loops;
/*
write a program that can divide two numbers without using / & % operators and retuns the devision and remainder
			ex:
				input:	10
						3

				0utput: 3 with a remainder of 1
 */
public class DivideTwoNumber {
    public static void main(String[] args) {
        int a= 10;
        int b= 3 ;
        int count = 0;
        if (b==0){
            System.out.println("Invalid input");
            System.exit(0);
        }

        while( a >= b){
            a-=b;
            count++;
        }

        System.out.println("reminde is : "+a);
        System.out.println("Devision is: "+count);
        System.out.println(count+" with a reminder of " +a);






    }
}
