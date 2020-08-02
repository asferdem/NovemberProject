package Day09;

public class triangle {
    public static void main(String[] args) {
        int angle1 = 60;
        int angle2 =50;
        int angle3=90;
        int sumAngle= angle1+angle2+angle3;
        boolean valid = sumAngle==180;
        if (valid==true){
            System.out.println( "Triangle is valid");
        }else {
            System.out.println(" Triangle is not valid");
        }
    }
}
