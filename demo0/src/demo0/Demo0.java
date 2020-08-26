
package demo0;


public class Demo0 
{
    static int data=30;
    static class Inner
    {
        void msg()
        {
            System.out.println(data);
        }
    }

    
    public static void main(String[] args) 
    {
       Demo0.Inner obj = new Demo0.Inner();
       obj.msg();
    }
    
}
