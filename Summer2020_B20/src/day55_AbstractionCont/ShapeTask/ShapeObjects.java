package day55_AbstractionCont.ShapeTask;

public class ShapeObjects {
    public static void main(String[] args) {

        Circle circle1=new Circle(2.5);
        System.out.println(circle1);
        System.out.println("Circle volume is :"+circle1.hasVolume);



        Rectangle rectangle1=new Rectangle(10,5);
        System.out.println(rectangle1);

        Cylinder cylinder1=new Cylinder(3.5,6);
        System.out.println(cylinder1);

        //Circle circle3=new Circle(-10);
       // System.out.println(circle3);


    }
}
