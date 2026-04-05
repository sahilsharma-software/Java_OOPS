public class ThisConstructor {
    ThisConstructor()
    {
        System.out.println("SAHIL WANT TO BE A GOOD PROGRAMMER ");

    }
    ThisConstructor(int number)
    {
      System.out.println("YOUR NUMBER IS :"+number);
      this();

    }
    public static void main(String[] args) {
        ThisConstructor obj=new ThisConstructor(100);

    }


    
}
