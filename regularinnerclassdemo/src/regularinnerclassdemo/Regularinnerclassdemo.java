
package regularinnerclassdemo;

public class Regularinnerclassdemo 
{
   private int data=30;
   class Inner
   {
       void msg()
       {
            System.out.println("Data is "+data);
       }
   }

   
    public static void main(String[] args) 
    {
       Regularinnerclassdemo obj = new Regularinnerclassdemo();
       Regularinnerclassdemo.Inner in = obj.new Inner();
       in.msg();
    }
    
}
