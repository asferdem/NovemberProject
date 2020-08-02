package day11_Nestedif_Switch;

public class Ternary_practice1 {
    public static void main(String[] args) {
        int age1 =17;
        String citizen = "USA";
        String result ="";
        if (age1>=18 && citizen== "USA"){
            result = "Can Vote";
        }else {
            result = " Can not Vote";
        }
        System.out.println(result);
        System.out.println("=====================================================");

        String vote= (age1>=18 && citizen=="USA") ? "Can Vote" : "Can not vote";
        System.out.println(vote);

        System.out.println("=====================================================");

        int number1 = 35;
        int number2 = 35;

        String result1= (number1==number2) ? " Equal": "Not Equal";
        System.out.println(result1);
    }
}
