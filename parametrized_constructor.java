public class parametrized_constructor {
    int x,y;
     parametrized_constructor(int a,int b)
    {
         x=a;
         y=b;

    }
    parametrized_constructor(int a,String name)
    {
        System.out.println(""+name+" "+a);

    }
    void value()
    {
        System.out.println(+x+" "+y);
    }
    public static void main(String[] args) {
        parametrized_constructor obj=new parametrized_constructor(122, 11);
        parametrized_constructor object= new parametrized_constructor(1234, "sahil sharma");
        obj.value();
       
    }
    
}
