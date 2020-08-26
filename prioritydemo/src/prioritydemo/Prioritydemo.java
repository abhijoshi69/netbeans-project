
package prioritydemo;
class A extends Thread
{
    @Override
    public void run()
    {
        System.out.println("A running");
        System.out.println("running thread name is "+currentThread().getName());
        System.out.println("running thread priority is "+currentThread().getPriority());
    }
}
class B extends Thread
{
    @Override
    public void run()
    {
        System.out.println("B running");
        System.out.println("running thread name is "+currentThread().getName());
        System.out.println("running thread priority is "+currentThread().getPriority());
    }
}
public class Prioritydemo 
{
    

    
    public static void main(String[] args) 
    {
      A a = new A();
      B b = new B();
      a.setName("A Thread");
      b.setName("B Thread");
      a.setPriority(3);
      b.setPriority(5);
      a.start();
      b.start();
    }
    
}
