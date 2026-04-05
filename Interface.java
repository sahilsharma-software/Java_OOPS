interface flying{
    void fly();   // public +  abstract   
}
interface swimming{
    void swim();  // public +abstract
}
class Duck implements flying,swimming
{
    @Override
     public void fly()
    {
        System.out.println("DUCK IS FLYING ");
    }
    @Override
    public void swim()
    {
        System.out.println("DUCK IS SWIMMING ");
    }
}
public class Interface {
    public static void main(String[] args) {
        {
            Duck obj =new Duck();
            obj.fly();
            obj.swim();
        }
    }
    
}
