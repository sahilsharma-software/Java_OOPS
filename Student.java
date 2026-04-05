// PARAMETRIZED CONSTRUCTOR

public class Student {
    
    String Name;
    int Roll_no;
    int Grade;
    Student(String name,int roll_no,int grade)  // parametrized constructor 
    {
     Name=name;
     Roll_no=roll_no;
     Grade=grade;
    }
    void displayInfo()
    {
     System.out.println("NAME OF STUDENT   "+Name+"    "+"roll no of student  "+Roll_no+"  "+" grade of student  "+Grade);
    }
    public static void main(String[] args) {
        // constructor automatically calls
        Student obj=new Student("sahil sharma",23303279,12);
        obj.displayInfo();
    }

    
}
