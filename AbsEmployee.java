abstract class Employee{
    String employeeName;
    int employeeId;
    abstract double calculateSalary();
    void showDetails(String employeeName,int employeeId)
    {
        System.out.println("EMPLOYEE NAME: "+employeeName);
        System.out.println("EMPLOYEE ID: "+employeeId);
    }

}
class FullTimeEmployee extends Employee
{
    private double monthlySalary;
    FullTimeEmployee( double monthlySalary)

    {

        this.monthlySalary=monthlySalary;
    }
    @Override
    double calculateSalary()
    {

        return monthlySalary;
    }
}
class PartTimeEmployee extends Employee{
     
    double workingHours,hourlyRate;

    PartTimeEmployee(double hourlyRate,double workingHours )
    {
    
        this.workingHours=workingHours;
    }
    @Override
    double calculateSalary()
    {

        return (hourlyRate*workingHours);
        

    }


}
public class AbsEmployee {
    public static void main(String[] args) {
        FullTimeEmployee obj=new FullTimeEmployee(100000);
        obj.showDetails("SAHIL SHARMA", 23303279);
       System.out.println( obj.calculateSalary());

        PartTimeEmployee objs=new PartTimeEmployee(500,8);
        obj.showDetails("SOURAV KUMAR", 23303290);
        System.out.println(objs.calculateSalary());
    }
    
}
