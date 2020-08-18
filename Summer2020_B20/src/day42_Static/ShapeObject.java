package day42_Static;

public class ShapeObject {

    public static void main(String[] args) {

        Circle c1=new Circle();
        c1.setInfo(25);
        c1.calcArea();
        c1.calcPerimeter();
        System.out.println(c1.calcArea());
        System.out.println(c1.calcPerimeter());

        System.out.println(c1);

        Circle c2=new Circle();

        System.out.println(c2);
        //static int b=300; it has to be declare outside


    }
}
