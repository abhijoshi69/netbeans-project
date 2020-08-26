
package abstractdemo;
interface student
{
    void show();
}
interface faculty
{
    void display();
}

public class Abstractdemo implements student,faculty 
{
    @Override
    public void show()
    {
        System.out.println("Show method");   
    }
    @Override
    public void display()
    {
        System.out.println("Display method");
    }
    
    
    public static void main(String[] args) 
    {
        Abstractdemo obj = new Abstractdemo();
        obj.show();
        obj.display();
       
    }
    
}
