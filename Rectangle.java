// PARAMETRIZED AND COPY CONSTRUCTOR 

public class Rectangle {
    
    int length,width,area;
    Rectangle(int l,int w)
    {
        length=l;
        width=w;
       area=length*width;
       System.out.println("AREA OF RECTANGLE 1:"+area);

    }
    Rectangle(Rectangle ref)
    {
        length=ref.length;
        width=ref.width;
        area=length*width;
        System.out.println("AREA OF SECOND RECTANGLE :"+area);

    }
    void calculateArea()
    {
        System.out.println("area of second rectangle :"+area);

    }
    public static void main(String[] args) {
        Rectangle obj=new Rectangle(100,200);
        Rectangle obj2=new Rectangle(obj);
        obj2.calculateArea();


    }
}
