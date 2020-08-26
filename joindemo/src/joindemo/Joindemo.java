package joindemo;


public class Joindemo extends Thread
{
    public void run()
    {
        try
        {
            for(int i=1;i<=10;i++)
            {
                System.out.println(i);
                Thread.sleep(1000);
            }
            
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
        

   
    public static void main(String[] args) 
    {
        Joindemo j = new Joindemo();
        Joindemo j1 = new Joindemo();
        Joindemo j2 = new Joindemo();
        j.start();
        try
        {
            j.join(10000);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        j1.start();
        j2.start();
    }
    
}
