package staticinnerdemo;

public class Staticinnerdemo 
{
   static int data=30;
   static class Inner
   {
       void msg()
       {
            System.out.println("Data is "+data);
       }
   }

    
    public static void main(String[] args) 
    {
       Staticinnerdemo.Inner obj = new Staticinnerdemo.Inner();
       obj.msg();
    }
    
}
