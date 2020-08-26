
package genericdemo;


public class Genericdemo <X,Y>
{
    private X first;
    private Y second;
    public Genericdemo(X a1,Y a2)
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
       Genericdemo d = new Genericdemo("Abhishek",33.3F);
        System.out.println("String is "+d.getFirst());
        System.out.println("Integer is "+d.getSecond());
        Genericdemo <Integer,String> obj = new Genericdemo <Integer,String> (2,"Joshi");
        System.out.println("Integer is "+obj.getFirst());
        System.out.println("String is "+obj.getSecond());
    }
    
}
