public class Students {

    // private fields 
    private String name;
    private int age;
    private String skills;

    // getter method for name
    public String getName()
    {
        return name;
    }

    // setter method for name

    public void setName(String name)
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
        if(age>=18  &&  age<=30)
        {
            this.age=age;
        }
        else
        {
            throw new IllegalArgumentException(" STUDENT AGE MUST BE BETWEEN 18 AND 30 IS ELIGIBLE");
        }

        
    }

    // getter method for skills 
    public String getSkills()
    {
        return skills;
    }
    //setter method  for skills

    public void setSkills(String skills)
    {
        this.skills=skills;
    }

    //CONSTRUCTOR FOR INITIALIZING VALUES 
    Students(String name,int age,String skills)
    {
        this.setAge(age);
        this.setName(name);
        this.setSkills(skills);
    }

    public static void main(String args[])
    {

        Students stu=new Students("sahil sharma", 25,"coding in java and cpp ");
        System.out.println("STUDENT NAME: "+stu.getName()+" \n "+" STUDENT AGE:  "+stu.getAge()+" "+" \n "+stu.getSkills());
    }

    
}
