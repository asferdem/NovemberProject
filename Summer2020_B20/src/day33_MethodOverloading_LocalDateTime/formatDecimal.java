package day33_MethodOverloading_LocalDateTime;

import java.text.DecimalFormat;

public class formatDecimal {
    public static void main(String[] args) {
        DecimalFormat df =new DecimalFormat("0.000");

        double a=22/7.0;
        System.out.println(a);
        System.out.println(df.format(a));




    }



}
