               //  BANK MANAGEMENT SYSTEM (CLASS AND OBJECT)
import java.util.Scanner;
public class Bank_account {  
    
    String account_holder=null;
    String account_number;
    float balance=0,money,cashout;
    int age;
    static char exit;
    public
    void new_bank_account(Scanner object)
    {
        System.out.println("WELCOME TO STATE BANK OF INDIA ");
        System.out.println("ENTER ACCOUNT HOLDER NAME ");
        object.nextLine();
        account_holder=object.nextLine();
        System.out.println("ENTER AGE ");
        age =object.nextInt();

    }
    void account_display(Scanner object)
    {

        System.out.println("CHILDREN BANK OF INDIA ");
        System.out.println("ACCOUNT HOLDER NAME "+" "+account_holder);
        System.out.println("AGE   "+age );
        System.out.println("ACCOUNT NUMBER ==>  SBI3421295949");
    }
    void deposite(Scanner object)
    {
        System.out.println("ENTER HOW MUCH MONEY YOU WANT TO ENTER ");
        money=object.nextFloat();
        balance+=money;
        System.out.println("UPDATED BALANCE "+balance);
    }
    void withdraw( Scanner object)
    {
        System.out.println("ENTER HOW MUCH MONEY YOU WANT TO WITHDRAW ");
       cashout=object.nextFloat();
       balance-=cashout;
       System.out.println("BALANCE "+balance);

        

    }
    void balance_history(Scanner object )
    {
        System.out.println("YOUR BALANCE IS "+balance);

    }
    public static void main(String[] args) {
        Bank_account object =new Bank_account();
         do
         {
        int choice;
    

        

        System.out.println("ENTER YOUR CHOICE ");
        Scanner obj=new Scanner(System.in);
        System.out.println("PRESS 1). TO ADD BANK ACCOUNT ");
        System.out.println("PRESS 2). TO DISPLAY ACCOUNT");
        System.out.println("PRESS 3). TO DEPOSITE MONEY ");
        System.out.println("PRESS 4). TO WITHDRAW MONEY");
        System.out.println("PRESS 5). TO SHOW YOUR BALANCE ");
        System.out.println("PRESS 6).  TO EXIT ");
        choice =obj.nextInt();
        switch (choice) {
            case 1:
            {
                object.new_bank_account(obj) ;

            }   
            break;
            case 2:
            {
                object.account_display(obj);

            }
            break;
            case 3:
            {
               object.deposite(obj);
            }
            break;
            case 4:
            {
                object.withdraw(obj);
            }
            break;
            case 5:
            {

                object.balance_history(obj);


            }
            break;
        
            default:
            {
                System.out.println("ENTER 'S' OR 's' TO EXIT  ");
                exit=obj.next().charAt(0);

            }
            break;
            
        }
    }
    while(exit!='s'  &&   exit !='S');



        
    }

    
}
