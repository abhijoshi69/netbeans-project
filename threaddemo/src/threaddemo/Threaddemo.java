
package threaddemo;


public class Threaddemo extends Thread
{
    @Override
    public void run()
    {
        for(int i=1;i<5;i++)
        {
            try
            {
                Thread.sleep(100);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
   
    
  
    public static void main(String[] args) 
    {
      Threaddemo d = new Threaddemo();
      Threaddemo d1 = new Threaddemo();
      Threaddemo d2 = new Threaddemo();
      d.start();
      try
      {
          d.join();
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
      d1.start();
      d2.start();
    }
    
}
