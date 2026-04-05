public class ThisVariable {
    void Fun()
    {
        System.out.println("SAHIL WANT TO EARN BIG AND DO SOMETHING BIG ");
        this.Eat();
        this.Travel();
        
    }
    void Eat()
    {
        System.out.println("SAHIL WANT TO TASTE EVERY DISH IN THE WORLD ");

    }
    void Travel()
    {
        System.out.println("SAHIL WANT TO TRAVEL WHOLE WORLD STARTING FROM INDIA COMPLETELY ");
    }
    public static void main(String[] args) {
        ThisMethod obj=new ThisMethod();
        obj.Fun();
    }
    
}
 