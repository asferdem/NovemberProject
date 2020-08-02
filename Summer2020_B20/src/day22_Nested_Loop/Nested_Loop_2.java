package day22_Nested_Loop;

public class Nested_Loop_2 {
    public static void main(String[] args) {

        for (int j = 1 ; j<=5 ;j++){

            for (int i = 1 ; i<=5 ; i++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("==========================================");

        for (int k=1 ; k<=4;k++){

            for (int l = 1 ; l <=7 ; l++){
                System.out.print("*");
            }
            System.out.println();



        }
        System.out.println("===================================");
        int j = 1;
        while (j<=4){

            for (int l = 1 ; l <=10 ; l++){
                System.out.print("*");
            }
            System.out.println();

            j++;
        }





    }
}
