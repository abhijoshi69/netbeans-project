package bankdemoamt;

import java.util.Scanner;

class Account
{
    int balance=600;
    synchronized void with(int amt)
    {
        System.out.println("Withdrawal in Process");
        if(balance<amt)
        {
            try
            {
                System.out.println("Tera Balance Low hai!!");
                System.out.println("WithDrawal is in wait mode.Proceed for Deposit!!");
                System.out.println("Enter amt to Deposit");
                wait();
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
        balance=balance-amt;
        System.out.println("WithDrawal Successful!!");
        System.out.println("Balance After Withdrawal is "+balance);
    }
    synchronized void depo(int amt)
    {
        System.out.println("Deposit in Process!!");
        System.out.println("Paisa Daal be Krutik");
        balance=balance+amt;
        System.out.println("Deposit is Successful!!");
        System.out.println("Balance after Deposit is "+balance);
        notify();
    }
}
class Withdrawal extends Thread
{
    Account a;
    int amt;
    public Withdrawal(Account a,int amt)
    {
        this.a=a;
        this.amt=amt;
        
    }
    public void run()
    {
        a.with(amt);
    }
}
class Depositor extends Thread
{
    Account a;
    int amt;
    public Depositor(Account a,int amt)
    {
        this.a=a;
        this.amt=amt;
    }
    public void run()
    {
        a.depo(amt);
    }
}
public class Bankdemoamt 
{

  
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amt to withdrawal");
        int x = sc.nextInt();
        Account krutik = new Account();
        Withdrawal w = new Withdrawal(krutik,x);
        w.setPriority(10);
        w.start();
        int y = sc.nextInt();
        Depositor d = new Depositor(krutik,y);
        d.start();
       
        
    }
    
}
