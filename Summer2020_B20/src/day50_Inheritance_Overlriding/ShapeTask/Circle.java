package day50_Inheritance_Overlriding.ShapeTask;

import OfficeHours.Practice_08_19_2020.Pizza;

/*
Area of the circle:    3.14 * radius * radius
Perimeter of circle:   3.14 * 2 * radius
 */
public class Circle extends Shape {
    public double radius;
    public double diameter;
    static double PI=3.14;
    public Circle(double radius){
        this.radius=radius;
        diameter=2*radius;
        area=calculateArea();
        perimeter=calculatePerimeter();
    }

    public double calculateArea(){
        return (PI *radius*radius) ;
    }
    public double calculatePerimeter(){

        return (PI*diameter);
    }

}
