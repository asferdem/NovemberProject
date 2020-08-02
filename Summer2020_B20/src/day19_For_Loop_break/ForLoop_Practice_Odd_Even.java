package day19_For_Loop_break;
/*
   1. write a program that can print all the ODD numbers between 0 ~ 100 that can be divisible by 3 & 5
    2. write a program that can print all the EVEN numbers between 0
 */
public class ForLoop_Practice_Odd_Even {
    public static void main(String[] args) {



        //i : 1 3 5 7 9 11 .....99
    for ( int i= 1; i<=99 ; i+=2){
        if( i%3==0 && i %5==0) {
            System.out.print(i + " ");
        }

    }
        System.out.println();
        System.out.println("==========================================");


        for (int i=0 ; i <=100 ;i++){
            if (i %2 !=0){
                if (i%3==0 & i %5==0)
                System.out.print(i +" ");
            }

        }
        System.out.println();
        System.out.println("===========================================================");
        //task2
        for (int i =0 ; i <=100 ; i+=2){
            if( i %3 == 0 && i %5 == 0){
                System.out.print( i +" ");
            }
        }
        System.out.println();

















    }
}
