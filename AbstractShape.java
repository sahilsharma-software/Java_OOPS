abstract class Shape {
    abstract double area();
    abstract double perimeter();
    
    void displayShape(String type, double area, double perimeter) {
        System.out.println("YOUR SHAPE IS: " + type);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius; 
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double area() {
        return length * breadth;
    }

    @Override
    double perimeter() {
        return 2 * (length + breadth);
    }
}

public class AbstractShape {
    public static void main(String[] args) {
        Circle obj = new Circle(4);
        System.out.print("1).  ");
        double circleArea = obj.area();
        double circlePerimeter = obj.perimeter();
        obj.displayShape("Circle", circleArea, circlePerimeter);

        Rectangle objs = new Rectangle(4, 4);
        System.out.print("2).  ");
        double rectArea = objs.area();
        double rectPerimeter = objs.perimeter();
        objs.displayShape("Rectangle", rectArea, rectPerimeter);
    }
}
