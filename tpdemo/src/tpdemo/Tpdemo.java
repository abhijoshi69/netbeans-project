
package tpdemo;

public class Tpdemo <T>
{
    private T t;
    public void setValue(T t)
    {
        this.t = t;
    }
    public T getValue()
    {
        return t;
    }
    public boolean compare(Tpdemo <? extends Number > wcd)
    {
        if(t==wcd.t)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

   
    public static void main(String[] args) 
    {
      Tpdemo <Integer> obj = new Tpdemo <Integer>();
      obj.setValue(10);
      Tpdemo <Integer> obj1 = new Tpdemo <Integer>();
      obj1.setValue(10);
        System.out.println("Value of first object "+obj.getValue());
        System.out.println("Value of second object "+obj1.getValue());
        System.out.println("Are both values equal "+obj.compare(obj1));
        
    }
    
}
