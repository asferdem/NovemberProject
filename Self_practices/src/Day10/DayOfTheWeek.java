package Day10;
/*

2. Write an if statement that will print day of the week based on value of the day variable.
        Ex:
            num = 1
        output:
            "Monday"
            num = 8
        output:
            "There is no such a day!"
            num = 3

        output:
            Wednesday

 */
public class DayOfTheWeek {
    public static void main(String[] args) {
        int num = 5;
        String result = "";
        if (num==1){
            result = " Monday";
        }else if ( num==2){
            result = " Thuesday";
        }else if (num == 3){
            result= " Wednesday";
        }else if ( num== 4){
            result = " Thursday";
        }else if (num == 5){
            result = " Friday";
        }else if ( num== 6){
            result = " Saturday";
        }else if (num== 7){
            result = " Sunday";
        }else {
            result = " There is no such a day";
        }
        System.out.println(result);
    }
}
