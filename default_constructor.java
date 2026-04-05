public class default_constructor {
    int age,weight,height;
    default_constructor()
    {
        age=19;
        weight=60;
    height=173;

    }
    void info()
    {
        System.out.println(+age+"  "+weight+" "+height);
    }
    public static void main(String[] args) {
        default_constructor obj=new default_constructor();
        obj.info();
    }
    
}
