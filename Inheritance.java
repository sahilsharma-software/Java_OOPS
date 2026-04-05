//      inheritance   ------>>> simple inheritance 

import java.util.Scanner;

class A{
       protected String name,school_Name;
       void playing()
       {
        System.out.println("SAHIL IS PLAYING CRICKET");
       }


}
class B extends A{
    Scanner obj=new Scanner(System.in);        
    void details()
    {
        System.out.println("ENTER YOUR NAME :");
        name=obj.nextLine();
        System.out.println("ENTER YOUR SCHOOL NAME :");
        school_Name=obj.nextLine();
        System.out.println("HOBBY OF SAHIL SHARMA IS GIVEN BELOW \n");
        this.playing();     
    }
    

}
public class Inheritance {
    public static void main(String[] args) {
        
    
    B objs =new B();
    objs.details();

    }
    
}
