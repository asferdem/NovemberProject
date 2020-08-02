package day12_Switch_Statement_Scanner;

public class Day_Switch {
    public static void main(String[] args) {
        int num = 10 ;
        //String res = "";
        switch (num){
            case 1 :
                System.out.println(num+"-)Monday");
                break;
            case 2:
                System.out.println(num+"-)Tuesday");
                break;
            case 3:
                System.out.println(num+"-)Wednesday");
                break;
            case 4:
                System.out.println(num+"-)Thursday");
                break;
            case 5:
                System.out.println(num+"-)Friday");
                break;
            case 6:
                System.out.println(num+"-)Saturday");
                break;
           case 7:
                System.out.println(num+"-)Sunday");
                break;
            default:
                System.out.println("There is no such a day");

        }

    }
}
