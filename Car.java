import java.time.Year;
public class Car {

    // private field attributes
    private String make;
    private String model;
    private int year;
    
 
    // getter   method  for year
    public int getYear()
    {
        return year;
    }

    // setter method  for year
    public void setYear(int year)
    {
        if(year>1995   && year<=2024)
        {
            this.year=year;   // if you enter a valid year

        }
        else
        {
            throw new IllegalArgumentException(" INVALID YEAR: "+year); // for non valid year
        
        }
    }
     // getter method for make

     public String getMake()
     {
        return make;
     }

     // setter method for make 

     public void setMake(String make)
     {
        this.make=make;
     }

     // getter method for make 

     public String getModel()
     {
        return model;
     }

     // setter method for model

     public void setModel(String model)
     {
        this.model=model;

     }


    // constructor for initializing fields

     Car(int year, String make, String model)
     {
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);

     }

     // main method 

     public static void main(String[] args) {

        // intitializing values in constructor--
        Car car =new Car(2000,"-BMW-","i8");
        
        // output by using get year method 

        System.out.println("YEAR "+car.getYear());
        System.out.println("model "+car.getModel());
        System.out.println("MAKE"+car.getMake());

        // updating above attributes 

        car.setMake("TOYOTA");
        car.setModel("COROLLA");
        car.setYear(2007);

        // disply updating field values and you 

        System.out.println("YEAR : "+car.getYear());
        System.out.println("MAKE  :"+car.getMake());
        System.out.println("MODEL  :"+car.getModel());

     }
}