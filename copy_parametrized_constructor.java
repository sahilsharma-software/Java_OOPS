public class copy_parametrized_constructor {

      int x,y;

    copy_parametrized_constructor(int a, int b)
    { 
        x=a;
        y=b;
        System.out.println(+a+" "+b);
    }
    copy_parametrized_constructor(copy_parametrized_constructor ref)
    {
        x=ref.x;
        y=ref.y;



        System.out.println(+x+" "+y);

    }

    copy_parametrized_constructor obj=new copy_parametrized_constructor(420 , 123);


    copy_parametrized_constructor obj2=new copy_parametrized_constructor(obj);
    
}
