package isalivedemo;

public class Isalivedemo extends Thread
{
    public void run()
    {
        try
        {
            for(int i=1;i<=10;i++)
            {
                System.out.println("Child Thread");
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
        Isalivedemo a = new Isalivedemo();
        a.start();
        try
        {
            for(int i=1;i<=10;i++)
            {
                System.out.println("Main Thread "+i);
                Thread.sleep(1000);
                System.out.println("is Child Alive? "+a.isAlive());
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("is Child Alive? "+a.isAlive());
        System.out.println("is Main Thread Alive "+Thread.currentThread().isAlive());
    }
    
}
