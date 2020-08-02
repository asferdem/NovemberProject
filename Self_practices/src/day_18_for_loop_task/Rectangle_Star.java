package day_18_for_loop_task;

public class Rectangle_Star {
    public static void main(String[] args) {

        for (int i =1 ; i <= 8 ; ++i){
            System.out.println("* * * * * *");

        }
        System.out.println("========================");
        for (int b=0;(b<11);++b){
            if ( b==0 || b==10){
                System.out.println("* * * * * *");
            }else{
                System.out.println("*         *");

            }
        }

    }
}
