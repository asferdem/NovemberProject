package day11_Nestedif_Switch;

public class DayInAmounth {
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
