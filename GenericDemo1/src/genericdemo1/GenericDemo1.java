package genericdemo1;


public class GenericDemo1 
{   
    <T> void display(int a,int b)
    {
        System.out.println("The values are "+a+" and "+b);
    }
    <T> T display(T c)
    {
         return c;
    }
    
   
    public static void main(String[] args) 
    {
        GenericDemo1 d = new GenericDemo1();
        d.display(12,23);
        System.out.println(d.display(12));
        
    }
    
}
