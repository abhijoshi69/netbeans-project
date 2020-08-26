package lockdemo;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Lockdemo implements Runnable
{
    
    Lock l = new ReentrantLock();
    void createThread(String name)
    {
        Thread t = new Thread(this,name);
        t.start();
    }
    public void run()
    {
        try
        {
            if(l.tryLock(3000, TimeUnit.MILLISECONDS)==true)
            {
                try
                {
                    
                    System.out.println(Thread.currentThread().getName()+" has acquired the lock");
                    Thread.sleep(2000);
         
                }
                finally
                {
                    l.unlock();
                    System.out.println(Thread.currentThread().getName()+" has released the lock");
                }
            }
            else
            {
                System.out.println(Thread.currentThread().getName()+" has not acquired the lock");
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
   
    public static void main(String[] args) 
    {
        Lockdemo l1 = new Lockdemo();
        l1.createThread("A");
        l1.createThread("B");
        l1.createThread("C");
    }
    
}
