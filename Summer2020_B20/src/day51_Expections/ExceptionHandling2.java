package day51_Expections;

public class ExceptionHandling2 {
    public static void main(String[] args) {
    String exceptionMessage="";
        try {
        System.out.println(10/0);
    }catch (ArithmeticException e){
        exceptionMessage=e.getMessage();
    }



        System.out.println(20/2);
        System.out.println("Message : "+exceptionMessage);






    }
}