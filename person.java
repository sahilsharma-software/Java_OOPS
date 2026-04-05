public class person {
    String name="Sahil Sharma";
    int age=19;
    float weight=60;
    float height=173;
    void eat()
    {
        System.out.println("sahil is eating ");
    }
    void playing()
    {
        System.out.println("Sahil is playing cricket ");

    }
    public static void main(String[] args) {
        
            person obj=new person();
            System.out.println(obj.name);
            System.out.println(obj.height);
            System.out.println(obj.age);
            System.out.println(obj.weight);


            obj.eat();
            obj.playing();

    }


    
}
