abstract class shape{
    abstract double calculateArea();
    void displayShape(String shape)
    {

        System.out.println("shape is :"+shape);
    }
}
class circle extends shape{
    double radius;
    public char[] displayShape;
    circle(double radius)
    {
        this.radius=radius;
    }
    
    @Override
    double calculateArea() {
        return Math.PI*radius*radius;        
    }
}
class rectangle extends shape{
    double length,breadth;
    rectangle(double length,double breadth)
    {
    this.length=length;
    this.breadth=breadth;
    }
    @Override
    double calculateArea() {    
        return (length*breadth);
    }

}
public class AbstractClass {
    public static void main(String[] args) {
        circle obj =new circle(4);
        rectangle rec=new rectangle(3,4);
        System.out.println(" area of circle is :"+obj.calculateArea());
        obj.displayShape("circle");

        System.out.println("area of rectangle:"+rec.calculateArea());
        rec.displayShape("rectangle");



    }
    
}
