
 interface InnerMain {
    String name="ELECTRIC OLA :";  // PUBLIC   STATIC FINAL 
    int speed=120;    // public    static   final 
    void start();  // public + abstract
    void speed();  // public +abstract


}
class customer implements InnerMain{

    @Override
    public 
    void speed()

    {
        System.out.println("speed is around 120 km/h"+speed);
    }
    @Override
    public void start()
    {
        System.out.println("TURN ON :"+name);
    }

}
public class Main {
    private static String name;
    

    public static void main(String[] args) {
        
    
    customer obj=new customer();
    obj.start();
    obj.speed();
    
    System.out.println("SPEED IS "+InnerMain.speed+" \n"+" NAME IS :"+InnerMain.name);
    
    
}
}