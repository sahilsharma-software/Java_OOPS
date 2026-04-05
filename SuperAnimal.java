public class SuperAnimal {
    
    String name;
    String sound;

    SuperAnimal(String n,String s)
    {
        name=n;
        sound=s;
    System.out.println("ANIMAL NAME AND ANIMAL SOUND");
    }
    void makeSound()
    {
        System.out.println("ANIMAL NAME"+name);
        System.out.println("Sound "+sound);
    }
}
class Dog extends SuperAnimal
{
    String breed;
    Dog()
    {
      super("cat","meow-meow");
      super.makeSound();
    }
    void makeSound()
    {
        breed="german-shepherd";
        System.out.println("BREDD OF DOG IS "+breed);


    }
    public static void main(String[] args) {
        Dog obj=new Dog();
        obj.makeSound();
    }
}
