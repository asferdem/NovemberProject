package Day10;
/*
write a program that can find the number of days in a month
        (Assume that Feb has 28 days)
        ex:
            month = 3
        output:
            31 days
            month = 4
        output:
            30 days
            month = 13
        output:
            Invalid month

        HINT:
            28 days: 2
            30 days: 4,6,9,11
            31 days: 1,3,5,7,8,10,12
 */
public class DaysInAmount {
    public static void main(String[] args) {
        int month = 15;
        String result = "";
        if (month == 2){
            result = " 28 Days ";
        }else if (month== 4 || month ==6|| month==9 || month== 11){
            result = " 30 Days";
        }else if (month== 1 || month ==3|| month==5 || month== 7 || month== 8 || month== 10 || month== 12 ){
            result = " 31 Days";
        }else {
            result = " Invalid Month";
        }
        System.out.println(result);

    }
}
