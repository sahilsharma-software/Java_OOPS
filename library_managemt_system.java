// LIBRARY MANAGEMENT SYSTEM(CLASS AND OBJECT)

import  java.util.Scanner;
public class library_managemt_system {
    int number,increment=0;
    String[] book_name= new String[100];
    String [] author_name= new String[100];
    int [] price =new int[100];
    String search_book;
    
   public
   void add_new_books(Scanner object)
   {
   
    System.out.println("ENTER HOW MANY BOOKS YOU WANT TO ADD ");
    number=object.nextInt();
    
    
    for(int i=0;i<number;++i)
    {
        System.out.println("*************************************************");
        System.out.println("ENTER BOOKS NAME ");
        book_name[increment]=object.nextLine();
        object.nextLine();
        System.out.println("ENTER AUTHOR NAME ");


        author_name[increment]=object.nextLine();

        object.nextLine();
        
        System.out.println("ENTER PRICE OF BOOK ");
        price[increment]=object.nextInt();
        System.out.println(" "+i+1+"  "+" BOOK HAS BEEN SUCCESSFULLY ADDED ");
        System.out.println("*************************************************");
        ++increment;
    }
  }
  void display_books(Scanner object)
  {
    System.out.println("AVAILABLE BOOKS "+"== "+increment);
    if(increment!=0)
    {
        
        for(int j=0;j<increment;j++)
        {
            System.out.println("DETAILS OF BOOK "+j+1+" ");
            System.out.println("BOOKS NAME "+book_name[j]);
            System.out.println("AUTHOR NAME "+author_name[j]);
            System.out.println("PRICE OF BOOK "+price[j]);
        }
    }
    else
    {
        System.out.println("YOU DON'T ADD ANY BOOK YET !");
        System.out.println("PLEASE ADD A BOOK ");
    }

    
  }
  void issue_books(Scanner object)
  {
    if(increment!=0)
    { 
        System.out.println("ENTER BOOK NAME WHICH YOU WANT TO ISSSUE ");
        search_book=object.nextLine();
        object.nextLine();
        for(int k=0;k<increment;k++)
        {
            if(search_book.equals(book_name[k]))
            {
                System.out.println("BOOK FOUND ");
                System.out.println("BOOK AUTHOR "+author_name[k]);
                System.out.println("PRICE "+price[k]);

            }
        }
    

    }
    else
    {
           System.out.println("DOES  NOT FIND BOOK !");
    
    }
  }
      




   public static void main(String[] args) {

    library_managemt_system object =new library_managemt_system();
    int choice;
    Scanner obj=new Scanner(System.in);
    while(true)
    {
    System.out.println("ENTER YOUR CHOICE ");
    System.out.println("PRESS 1). TO ADD NEW BOOKS ");
    System.out.println("PRESS 2. TO DISPLAY BOOKS  ");
    System.out.println("PRESS 3). TO ISSUE A BOOK ");
    System.out.println("PRESS 4). TO EXIT  ");
    

    choice=obj.nextInt();
    if(choice==1)
    {
        object.add_new_books(obj);
    }
    else if(choice==2)
    {
        object.display_books(obj);
    }
    else if(choice==3)
    {

        object.issue_books(obj);

    }

    else if(choice==4)
    {
      System.exit(0);

    }
    else
    {
        System.out.println("WRONG OUTPUT ");

    

    }
    }
}
    
}
