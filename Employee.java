// DEFAULT CONSTRUCTOR 

public class Employee {
    int employeeId;
    String name;
    int salary;
    Employee()
    {
        name="unknown";
        employeeId=0;
        salary=0;

    }
    void showDetails()
    {
        System.out.println("EMPLOYEE ID :"+employeeId+" "+" name :"+name+" "+"salary:"+salary);

    }
    public static void main(String[] args) {
        Employee obj=new Employee();
        obj.showDetails();
    }
}
