package day11_Nestedif_Switch;

public class DayINAmount2 {
    public static void main(String[] args) {
        int month = 12;
        boolean validNumber = month >= 1 && month <= 12;
        boolean days28 = month==2;
        boolean days30 = (month == 4 || month == 6 || month == 9 || month == 11);
        boolean days31 = (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12);
        String result = "";

        if (validNumber) {
            if (days28){
                result= "28 Days";
            }else if(days30){
                result = " 30 Days";
            }else {
                result= " 31 Days";
            }

        }else{
            result= "invalid";

        }
        System.out.println(result);


    }
}
