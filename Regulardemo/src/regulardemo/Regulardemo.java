
package regulardemo;


public class Regulardemo <X,Y> 
{
    private X first;
    private Y second;
    public Regulardemo(X a1,Y a2)
    {
        first=a1;
        second=a2;
        
    }
    public X getFirst()
    {
        return first;
    }
    public Y getSecond()
    {
        return second;
    }
  
    
    public static void main(String[] args) 
    {
        Regulardemo d = new Regulardemo("Test",3);
        System.out.println("String is"+d.getFirst());
        System.out.println("Integer is"+d.getSecond());
        Regulardemo <Integer,String> obj2 = new Regulardemo <Integer,String>(2,"Demo");
        System.out.println("Integer is "+obj2.getFirst() );
        System.out.println("String is "+obj2.getSecond());
    }
    
}
