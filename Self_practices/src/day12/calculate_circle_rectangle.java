package day12;
/*
write a progrm that can calculate the area of any given circle
				MUST use Scanner
write a program that calculate the area of any given rectangle
				MUST use scanner
 */
import java.util.Scanner;

public class calculate_circle_rectangle {
    public static void main(String[] args) {
        System.out.println("Please enter your circle radius : ");
        Scanner scan = new Scanner(System.in);
        double radius = scan.nextDouble();
        double area = 3.14*(radius*radius);

        System.out.println("Circle Area : "+ area);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" Enter your width :");
        double width = scan.nextDouble();
        System.out.println(" Enter your length :");
        double length = scan.nextDouble();
        double areaRectangle = length*width;
        System.out.println( "Rectangle Area is:"+ areaRectangle);






    }
}
