package synchronizeddemo;


public class Synchronizeddemo 
{
    synchronized void printTable(int n)
    {
        for(int i=1;i<5;i++)
        {
            System.out.println(n*i);
            try
            {
                Thread.sleep(400);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
 class MyThead1 extends Thread
 {
     Table t;
     MyThread1(Table t)
     {
         this.toString()=t;
     }
 }

   
    public static void main(String[] args) 
    {
        
    }
    
}
