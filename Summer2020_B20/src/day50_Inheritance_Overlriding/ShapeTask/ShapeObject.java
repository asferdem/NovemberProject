package day50_Inheritance_Overlriding.ShapeTask;

public class ShapeObject {
    public static void main(String[] args) {

        Circle circle1=new Circle(5);

        System.out.println("Circle area :"+circle1.calculateArea());
        System.out.println("Circle perimeter :"+circle1.calculatePerimeter());

        Rectangle rectangle1=new Rectangle(4,5);

        System.out.println("Rectangle area :"+ rectangle1.calculateArea());
        System.out.println("Rectangle perimeter :"+rectangle1.calculatePerimeter());

    }
}
