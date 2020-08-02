package day11_Nestedif_Switch;

public class Ternary {
    public static void main(String[] args) {
        int num = 100;
        String result ="";
        if (num % 2==0){
            result = "even";
        }else {
            result="odd";
        }
        System.out.println(result);
        System.out.println("=====================================================");

        String result2=(num % 2==0) ? "even": "odd";
        System.out.println(result2);

        System.out.println("=====================================================");
        int num1 = 100;
        int num2 = 20;
        int max = 0 ;
        if (num1>num2){
            max=num1;
        }else {
            max = num2;
        }
        System.out.println(max);
        System.out.println("=====================================================");
        int max1= (num1>num2) ? num1 :  num2;
        System.out.println(max1);
        System.out.println("=====================================================");
        int age = 22;
        boolean eligible= false ;
        if (age > 21){
            eligible= true;
        }else {
            eligible= false;
        }
        System.out.println(eligible);
        System.out.println("=====================================================");

        boolean eligible1 =(age>21 ) ? true : false ;
        System.out.println(eligible1);

        System.out.println("=====================================================");

        int age1 =17;
        String vote= (age>=18) ? "Can Vote" : "Can not vote";
        System.out.println(vote);

        System.out.println("=====================================================");

        int number1 = 25;
        int number2 = 35;

        String result1= (number1==number2) ? " Equal": "Not Equal";
        System.out.println(result1);



    }
}
