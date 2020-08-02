package day22_Nested_Loop;

public class Nested_Loop_Practice4 {
    public static void main(String[] args) {

        for (int j = 1 ; j<=7 ; j++){

            for (int i =1 ; i<=j ; i++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("====================================");

        for(int k =7 ; k>=1 ; k--){
            for ( int l = k ; l>= 1 ; l--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
