
package ddemo;


public class Ddemo implements Runnable
{
    @Override
    public void run()
    {
        
    }
    

   
    public static void main(String[] args) 
    {
      Ddemo d = new Ddemo();
      Thread t = new Thread(d);
      t.start();
        System.out.println(t.isAlive());
    }
    
}
