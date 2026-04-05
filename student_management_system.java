// STUDENT MANAGEMENT SYSTEM(CLASS AND OBJECT)

import java.util.Scanner;
public class student_management_system {
    private
    String[] name=new String [100];
    String[] father_name =new String[100];
    String[] mother_name =new String[100];
    int number,increment=0;
    String new_name;
    String delete_student;
    static char exit;
    public
    void add_student(Scanner object)
    {
        System.out.println("ENTER HOW MANY STUDENTS YOU WANT TO ADD");
        number=object.nextInt();
        object.nextLine();
        
        for(int i=increment;i<number+increment;i++)
        {   
            System.out.println("**********************");
            System.out.println("STUDENT :"+(i+1));
            System.out.println("STUDENT NAME ");
            name[i]=object.nextLine();
    
            System.out.println("FATHER NAME ");
            father_name[i]=object.nextLine();
            System.out.println("MOTHER NAME ");
            mother_name[i]=object.nextLine();
            System.out.println("***********************");    
        }
        increment+=number;
    }
    void display_students(Scanner object)
    {

        if(increment!=0)
        {
            for(int i=0;i<increment;i++)
            {
          System.out.println("****************************");
          System.out.println("STUDENT "+(i+1)+" DETAILS");
          System.out.println("STUDENT NAME "+name[i]);
          System.out.println("FATHER NAME"+" "+father_name[i]);
          System.out.println("MOTHER  NAME "+mother_name[i]);
          System.out.println("*****************************");
            }
        }
        else
        {
            System.out.println("NO DATA FOUND  ");
        }
    }
    void update_information(Scanner object)
    {
        if(increment!=0)
        { 
        System.out.println("ENTER STUDENT NAME WHOSE DATA DO YOU WANT TO UPDATE ");
        new_name=object.nextLine();
        for(int i=0;i<increment;i++)
        {
            if(new_name.equals(name[i]))
            {
                System.out.println("***********************");
                System.out.println(" PREVIOUS DATA OF STUDENT IS GIVEN BELOW ");
                System.out.println("NAME"+name[i]);
                System.out.println("FATHER NAME "+father_name[i]);
                System.out.println("MOTHER NAME "+mother_name[i]);
                System.out.println("************************************");
                  

                System.out.println("ENTER NEW RECORD ");
                System.out.println("ENTER STUDENT NAME ");
                name[i]=object.nextLine();
                System.out.println("ENTER FATHER NAME  ");
                father_name[i]=object.nextLine();
                System.out.println("ENTER MOTHER NAME ");
                mother_name[i]=object.nextLine();
                System.out.println("RECORD SUCCESSFULLY ");
            }
            }
        }
        }




    
    void delete_record(Scanner object)
    {
        if(increment!=0)
        {
        System.out.println("PRESS 1). TO DELETE ALL RECORD ");
        System.out.println("PRESS 2). TO DELETE A SINGLE STUDENT RECORD ");
        int choose;
        choose=object.nextInt();
        object.nextLine();
        if(choose==1)
        {
            increment=0;
            System.out.println("RECORD DELETED COMPLETELY ");

        }
    
    else if(choose==2)
    {

        System.out.println("ENTER STUDENT NAME WHOSE DATA YOU WANT TO DELETE ");
        delete_student=object.nextLine();
        boolean found=false;
        for(int i=0;i<increment;i++)
        {
        if(delete_student.equals(name[i]))
        {
            for(int j=i;j<increment-1;j++)
            {
                name[j]=name[j+1];
                father_name[j]=father_name[j+1];
                mother_name[j]=mother_name[j+1];

            }
            --increment;
            System.out.println("RECORD DELETE SUCCESSFULLY");
            found= true;
            break;


        }
        else{
            System.out.println("NO STUDENT RECORD WITH THIS NAME ");
        }
    
        }
    }
    else 
    {
        System.out.println("NO STUDENT DATA YOU HAVE ");

    }
}
else{
    System.out.println("NO student record found ");
}


    }
    


    public static void main(String[] args) {
        student_management_system object=new student_management_system();
        Scanner obj=new Scanner(System.in);
        int choice;
    
         do
         {
        System.out.println("PRESS 1). TO ADD STUDENTS DETAILS ");
        System.out.println("PRESS 2). TO DISPLAY STUDENT DETAILS ");
        System.out.println("PRESS 3). TO UPDATE INFORMATION ");
        System.out.println("PRESS 4). TO DELETE RECORD  ");
        System.out.println("PRESS 5). TO EXIT ");
        choice=obj.nextInt();
        obj.nextLine();
        switch (choice) {
            case 1:
            {
                object.add_student(obj);
            }
            break;
            case 2:
            {
                object.display_students(obj);

            }
            break;
            case 3:
            {
                object.update_information(obj);
                
            }
            break;
            case 4:
            {
                object.delete_record(obj);
            }
            break;
            case 5:
            {
              System.out.println("PRESS (S) OR (s) TO EXIT  ");
              exit=obj.next().charAt(0);
            }
            break;
        
            default:
            {
                System.out.println("WRONG OUTPUT ");


            }
                break;
        }


         }
         while(exit!='s'   &&   exit!='S');

     obj.close();   
        
    }
}
