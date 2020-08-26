
package wildcarddemo1;


public class Wildcarddemo1 <T>
{
    private T t;
    public void setValue(T t)
    {
        this.t=t;
        
    }
    public T getValue()
    {
        return t;
    }
    public boolean compare(Wildcarddemo1 <? extends Number> wcd)
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
       Wildcarddemo1 <Integer> d = new Wildcarddemo1 <Integer>();
       d.setValue(10);
       Wildcarddemo1 <Integer> d1 = new Wildcarddemo1 <Integer>();
       d1.setValue(10);
        System.out.println("Value of the first object is "+d.getValue());
        System.out.println("Value of the second object is "+d1.getValue());
        System.out.println("Are both the values equal "+d.compare(d1));
    }
    
}
