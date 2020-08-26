package bankamtdemo;

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
                System.out.println("Tera Balance Low Hai!!");
                System.out.println("Withdrawal is in wait mode. Proceed for Deposit!!");
                wait();
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            
        }
        balance=balance-amt;
        System.out.println("Withdrawal Successful!!");
        System.out.println("Balance After Withdrawal is "+balance);
    }
    synchronized void depo(int amt)
    {
        System.out.println("Deposit in Process!!");
        System.out.println("Paisa Daal be Krutik");
        balance=balance+amt;
        System.out.println("Deposit is Successful!!");
        System.out.println("Balance after Deposit "+balance);
        notify();
    }
}
class Withdrawal extends Thread
{
    Account a;
    public Withdrawal(Account a)
    {
        this.a=a;
    }
    public void run()
    {
        a.with(1000);
    }
}
class Depositor extends Thread
{
    Account a;
    public Depositor(Account a)
    {
        this.a=a;
    }
    public void run()
    {
        a.depo(2000);
    }
}
public class Bankamtdemo 
{

    
    public static void main(String[] args) 
    {
        Account krutik = new Account();
        Withdrawal w = new Withdrawal(krutik);
        Depositor d = new Depositor(krutik);
        w.setPriority(10);
        w.start();
        d.start();
        
    }
    
}
