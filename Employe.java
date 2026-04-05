public class Employe {
     // field attributes
     private String name;
     private int age;
     private int salary;
     private String position;

     // getter method for name
     
     public String getName()
     {
        return name;

     }
     // setter method for name 
     public void  setName(String name)
     {
        this.name=name;
     }

     // getter method for age

     public int getAge()
     {
        return age;

     }

     // setter method for age 
     public void setAge(int age)
     {
        if(age>=18  && age<=60)
        {
            this.age=age;

        }
        else
        {
            throw new IllegalArgumentException("THIS 18 IS NOT ELIGIBLE FOR WORK IN MY COMPANY :"+age);
        }
     }
     // getter method for salary 
     public int getSalary()
     {
        return salary;

     }
     // setter method for salary 
     public void setSalary(int salary){
        if(salary>=15000   &&  salary<=10000000)
        {
            this.salary=salary;
        }
        else
        {
            throw new IllegalArgumentException("PLEASE ENTER A VALID SALARY FIXED BY OUR GOVERNMENT"+salary);
        }
     }
     // getter method for position 
     public String getPosition()
     {
      return position;
     }
     // setter method for position 
     public void setPosition(String position)
     {
      this.position=position;
     }
     Employe(String name,int age,int salary,String position)
     {
      this.setName(name);
      this.setAge(age);
      this.setPosition(position);
      this.setSalary(salary);
     }

     public static void main(String[] args) {
      Employe obj=new Employe("SAHIL SHARMA", 19, 1000000, "CEO of microsoft");

      System.out.println("name of employee: "+"  "+obj.getName());
      System.out.println("AGE OF EMPLOYEE: "+" "+obj.getAge()+" \n"+" SALARY OF EMPLOYEE : "+" "+obj.getSalary()+" \n"+" "+" POSITION OF EMPLOYEE"+obj.position);
     }
    

    
}
