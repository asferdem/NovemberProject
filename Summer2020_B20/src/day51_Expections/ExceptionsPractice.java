package day51_Expections;

public class ExceptionsPractice {
    public static void main(String[] args) {

        System.out.println("Hello");
       /*
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){

        }
*/
        sleep(3);
        System.out.println("World");
        /*try {
            Thread.sleep(3000);
        }catch (InterruptedException e){

        }
        */
        sleep(5);
        System.out.println("Byeeeee");

    }

    public static void sleep(int seconds){
        try {
            Thread.sleep(seconds*1000);
        }catch (InterruptedException e){

        }
    }



}
