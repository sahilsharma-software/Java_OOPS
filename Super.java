public class Super {
    int number=2006;
    public void behaviour()
    {
    System.out.println("SAHIL LIKES TO TRAVEL");
    }
    Super(int num)
    {
      
    System.out.println("YOU NEED TO DO HARD WORk ALONG WITH SMART WORk TO SUCCEED IN LIFE"+num);
    }  
}
 class child extends Super
{
      int number=2004;
     public void behaviour()
      {
        super.behaviour();
        System.out.println("WANT TO EARN A PACKAGE OF  RS 12 LAKH PER YEAR  AS A FRESHER"+" variable of sub class"+number+"variable of super class"+super.number);
      }
      child()
      {
        super(1000);
        System.out.println("BELIVE IN GOD !");
      }
      public static void main(String[] args) {
        child obj=new child();
        obj.behaviour();
        
      }
}
