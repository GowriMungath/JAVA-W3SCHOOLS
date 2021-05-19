import java.util.*;
class customer
{
    String name;
    customer(String cname)
    {
        name=cname;
    }
    double account = 0;
    void deposit(double amount)
    {
        account+=amount;
    }
    void withdraw(double amount)
    {
        if(account<amount)
        {
            System.out.println("INSUFFICIENT BALANCE!");
        }
        else
        {
            account-=amount;
        }
    }
    void balance()
    {
        System.out.println("HELLO "+name.toUpperCase()+" YOUR ACCOUNT BALANCE IS "+account);
    }
}

class auditor
{
    double a = 10000000;
    void asset()
    {
        System.out.println("ASSET = "+a);
    }
}

public class Main
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("INDIAN OVERSEAS BANK");
        System.out.println("Enter your name : ");
        String  name = sc.next();
        System.out.println("WELCOME "+name.toUpperCase());
        customer c = new customer(name);
        auditor a = new auditor();
        do
        {
        System.out.println("1.Customer");
        System.out.println("2.Auditor");
        System.out.println("PRESS 0 TO EXIT");
        int ch = sc.nextInt();
        if(ch==1)
        {
             System.out.println("1.Deposit");
             System.out.println("2.Withdraw");
             System.out.println("3.Balance");
             int choice = sc.nextInt();
             switch(choice)
             {
                case 1:
                     System.out.println("Enter the amount:");
                     double am = sc.nextDouble();
                     c.deposit(am);
                     System.out.println("Rs "+am+" DEPOSITED SUCCESSFULLY!");
                     break;
                case 2:
                     System.out.println("Enter the amount:");
                     am = sc.nextDouble();
                     c.withdraw(am);
                     System.out.println("Rs "+am+" WITHDRAWN SUCCESSFULLY!");
                     break;
                case 3:
                     c.balance();
                     break;
                default:
                     System.out.println("Invalid Option!");
                     System.exit(0);
                     break;
             }
        }
        else if(ch==2)
        {
            a.asset();
        }
        else if(ch==0)
        {
            System.exit(0);
        }
        else
        {
            System.out.println("Invalid Option!");
            System.exit(0);
        }
        }
        while(true);
    }
}
