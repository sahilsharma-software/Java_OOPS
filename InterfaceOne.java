interface Shape
{
   // double areaCircle,areaRectangle,perimeterCircle,perimeterRectangle;
    double calculateArea();
    double calculatePerimeter();
     default void showDetailsCircle(double areaCircle, double perimeterCircle)
    {
        System.out.println("DETAILS OF CIRCLE IS :");
        System.out.println("AREA OF CIRCLE :"+areaCircle);
        System.out.println("PERIMETER OF CIRCLE :"+perimeterCircle);
    }
    default void showDetailsRectangle(double areaRectangle,double perimeterRectangle) 
    {

        System.out.println("DETAILS OF RECTANGLE IS :");
        System.out.println("AREA OF RECTANGLE :"+areaRectangle);
        System.out.println("PERIMETER OF RECTANGLE :"+perimeterRectangle);
    }
    


}
class Circle implements Shape{
    double radius;
    Circle(double radius)
    {
        this.radius=radius;
    }
    @Override
   public double calculatePerimeter()
    {
        return (2*Math.PI*radius);
    }
    @Override
    public double calculateArea() {
        return (Math.PI*radius*radius);
    }
}
class Rectangle implements Shape{
    double length,breadth;
    Rectangle(double length,double breadth)
    {
        this.length=length;
        this.breadth=breadth;

    }
    @Override
    public double calculatePerimeter()
    {
        return (2*(length+breadth));
    }
    
    public double calculateArea()
    {

      return (length*breadth);
    }

}

public class InterfaceOne {
    
    private static double perimeterCircle;

    public static void main(String[] args) {
    Circle obj=new Circle(4);
    Rectangle objs =new Rectangle(2, 5);

    double areaCircle=obj.calculateArea();
    double  perimeterCircle=obj.calculatePerimeter();

 
    double areaRectangle=objs.calculatePerimeter();
    double perimeterRectangle=objs.calculateArea();

    obj.showDetailsCircle(areaCircle, perimeterCircle);
    System.out.println("\n");
    objs.showDetailsRectangle(areaRectangle, perimeterRectangle);

    


    }
    
}
