public class copy_default_constructor {

    int a;
    String name;
    copy_default_constructor()
    {
        a=90;
        name="sahil sharma";
        System.out.println(+a+" "+name);

    }
    copy_default_constructor(copy_default_constructor ref)
    {
       a=ref.a;
       name=ref.name;
        System.out.println(+a+" "+name);

    }

    public static void main(String[] args) {
        copy_default_constructor obj =new copy_default_constructor();
        copy_default_constructor obj2 =new copy_default_constructor(obj);

    }


    
}
