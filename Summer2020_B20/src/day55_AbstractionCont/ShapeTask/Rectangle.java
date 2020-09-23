package day55_AbstractionCont.ShapeTask;
/*
create a sub class of shape called Rectangle
            attributes: width, length, name(static), area, perimeter, hasVolume(static), volume
            override the abstract methods
            (if the shape does not have volume, return 0 for the colume)
            add a constructor that takes two arguments for W & L of rectangle the and initialize the instance variables: width, length, area, perimeter, volume
            add a static block that can initialize the static variables of the rectangle
 */
public final class Rectangle extends Shape{
    public double width;
    public double length;

    public Rectangle(double width, double length) {
        if (width<=0||length<=0){
            throw new RuntimeException("can not be negative or zero");
        }
        this.width = width;
        this.length = length;
        area=calculateArea();
        perimeter=calculatePerimeter();
        volume=calculateVolume();
    }
    public double calculateArea(){

        return width*length;
    }
    public  double calculatePerimeter(){

        return 2*(width*length );
    }
    public  double calculateVolume(){

        return 0;
    }
    static {
        name="Rectangle";
        hasVolume=false;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }
}

