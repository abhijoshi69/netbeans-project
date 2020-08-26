package wildcarddemo;

public class Wildcarddemo <T>
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
    public boolean compare(Wildcarddemo <? extends Number > wcd)
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
       Wildcarddemo <Integer> obj1 = new Wildcarddemo <Integer>();
       obj1.setValue(10);
       Wildcarddemo <Integer> obj2 = new Wildcarddemo <Integer>();
       obj2.setValue(10);
        System.out.println("Value of the first object:"+obj1.getValue());
        System.out.println("Value of the second object:"+obj2.getValue());
        System.out.println("Are both equals:"+obj1.compare(obj2));
    }
    
}
