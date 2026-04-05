public class InstanceStudent {
    //  fields
    String name;
    int grade;
    // instance block 
    {
        name="Sahil Sharma";
        grade=12;

        System.out.println("NAME OF STUDENT "+name);
        System.out.println("GRADE OF STUDENT "+grade);
    }
    // constructor 
    InstanceStudent()
    {
        System.out.println("CHECK THE ORDER OF PREFEANCE OF INSTANCE BLOCK AND CONSTRUCTOR ");
    }
    public static void main(String[] args) {
        InstanceStudent obj=new InstanceStudent();
        
    }

    
}
