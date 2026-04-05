public class Instance {
    // instance block deals with object creation . can access both static and non static keyword and also without any 
    // keyword ;
    int a=13;
    static double b=34.333;

    Instance()
    {
        System.out.println("CONSTRUCTOR CALL AFTER INSTANCE BLOCK ");
    }
    {
        System.out.println("SAHIL WANT TO BECOME A GOOD PROGRMAMER "+" "+a);
        System.out.println("SAHIL WANT TO BECOME A GOOD CODER "+"  "+b);

    }
    public static void main(String[] args) {
        
    
    Instance obj=new Instance();
    }
}
