package classdemo;
abstract class Person
{
    abstract void eat();
}
public class Classdemo 
{

    
    public static void main(String[] args) 
    {
        Person p = new Person()
        {
            @Override
            void eat()
            {
                System.out.println("nice fruits");
            }
        };
        p.eat();
                

    }
    
}
