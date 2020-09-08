package day50_Inheritance_Overlriding.ShapeTask;
/*
Area of the rectangle:  width * length
 Perimeter of rectangle: (width + length) * 2
 */
public class Rectangle extends Shape{
    public double width;
    public  double length;

    public Rectangle(double width,double length){
        this.width=width;
        this.length=length;
        area=calculateArea();
        perimeter=calculatePerimeter();
    }

    public double calculateArea(){

        return width*length;
    }
    public double calculatePerimeter() {
        return 2*(length+width);
    }

}
