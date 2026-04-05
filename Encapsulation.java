import java.util.Scanner;

public class Encapsulation {
    
     private int totalMoney=10000;
     private int money;
     Scanner scanner =new Scanner(System.in);
     // member method for deposited money 
     public void depositeMoney(Scanner scanner)
     {

        System.out.println("ENTER MONEY WHICH YOU WANT TO DEPOSITED: ");
        money=scanner.nextInt();
        totalMoney+=money;
        System.out.println("SUCCESSFULLY DEPOSITED:");
        System.out.println("TOTAL BALANCE: "+totalMoney);



     }
     // member method for withdraw money 
     public void withdrawMoney(Scanner scanner)

     {
        System.out.println("ENTER MONEY WHICH YOU WANT TO WITHDRAW: ");
        money=scanner.nextInt();
        totalMoney-=money;
        System.out.println("SUCCESSFULLY WITHDRAW :");
        System.out.println("TOTAL BALANCE: "+totalMoney);
     }

     // member method for check balance \
     public void checkBalance(Scanner scanner)
     {

        System.out.println(" YOUR TOTAL BALANCE:"+totalMoney);

     }



    
    
}
class Bank{
     static Encapsulation obj=new Encapsulation();

     static int choice;
   static char exit;
    public static void main(String[] args) {
    Scanner object=new Scanner(System.in);
    do{
    System.out.println("PRESS 1). FOR DEPOSITED MONEY ");
    System.out.println("PRESS 2). FOR WITHDRAW ");
    System.out.println("PRESS 3). CHECK BALANCE");
    System.out.println("PRESS 4). TO EXIT ");
    choice =object.nextInt();
    switch (choice) {
        case 1:
        {
            obj.depositeMoney(object);
        }
        break;
        case 2:
        {
            obj.withdrawMoney(object);
        }
            
            break;
        case 3:
        {
            obj.checkBalance(object);
        }
        break;
        case 4:
        {
            System.exit(0);
        }
        break;
        default:
        {
            System.out.println("WRONG INPUT ");
            System.out.println("ENTER (S)  OR (s)  TO EXIT :");
            exit=object.next().charAt(0);
        }
         break;
        }
     }
     while(exit!='s'  &&  exit!='S');
      
    }
}

