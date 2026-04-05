abstract class animal{
    String sound;
    abstract void sound();
     void sleep()
    {
        System.out.println("ANIMAL IS SLEEPING: ");
    }
}
class Lion extends animal{

    Lion(String sound)
    {
      this.sound=sound;
    }
    void sound()
    {
        System.out.println("SOUND OF LION :"+sound);
    }
}
class Crow extends animal{
    Crow(String sound)
    {
        this.sound=sound;
    }
    void sound()
    {
        System.out.println("SOUND OF CROW :"+sound);
    }
}
public class AbsAnimal {
    public static void main(String[] args) {
        Lion obj=new Lion("roar roar");
        obj.sound();
        System.out.println();
        obj.sleep();

        Crow objs=new Crow("KA KA KAAA KAA :");
        objs.sound();
        System.out.println();
        objs.sleep();
    }
    

}
