abstract class appliance{
    abstract void turnOn();
    abstract void turnOff();
}
class washingMahcine extends appliance{
    @Override
    void turnOn()
    {
        System.out.println("INSERT THE MAIN PLUG ");


    }
    void turnOff()
    {
        System.out.println("OFF THE MAIN PLUG :");

    }
}
class refrigerator extends appliance{
   @Override
   void turnOn()
   {
   System.out.println("USE MAIN PLUG :");
   }
   void turnOff()
   {
    System.out.println("PLUG OUT MAIN PLUG :");

   }
}
public class AbstractOne {
    public static void main(String[] args) {
        washingMahcine wash =new washingMahcine();
        refrigerator ref=new refrigerator();
        
        wash.turnOn();
        wash.turnOff();

        ref.turnOff();
        ref.turnOn();
    }
    
}
