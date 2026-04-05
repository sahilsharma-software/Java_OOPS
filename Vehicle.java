public class Vehicle {
    String brand;
    int year;
    Vehicle(String b,int y)
    {
        brand=b;
        year=y;
    }
    void info()
    {
        System.out.println("BRAND NAME : "+brand+" YEAR :"+year);
    }
}
class Car extends Vehicle
{
    String model;
    Car(String brand,int year,String modelNew)
    {
        super(brand,year);
        model=modelNew;
    }
    void info()
    {
        super.info();
        System.out.println("MODEL NAME IS  :"+model);
    }

  public static void main(String[] args) {
    Car obj =new Car("ROLLS ROYCE", 1950,"PURANA MODEL");
    obj.info();

  }

}
