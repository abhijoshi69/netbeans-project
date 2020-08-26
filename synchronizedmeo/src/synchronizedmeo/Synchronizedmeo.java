package synchronizedmeo;
class Table
{
    int num,i,res;
    synchronized void display(int num)
    {
        for(i=1;i<=10;i++)
        {
            res=num*i;
            System.out.println(num+" * "+i+"= "+res);
        
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        }
    }
}
class Thread1 extends Thread
{
    Table t;
    Thread1(Table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.display(5);
    }
}
class Thread2 extends Thread
{
    Table t1;
    Thread2(Table t1)
    {
        this.t1=t1;
    }
    public void run()
    {
        t1.display(10);
    }
}
public class Synchronizedmeo 
{

   
    public static void main(String[] args) 
    {
        Table t = new Table();
        Thread1 d = new Thread1(t);
        d.start();
        Thread2 d1 = new Thread2(t);
        d1.start();
    }
    
}
