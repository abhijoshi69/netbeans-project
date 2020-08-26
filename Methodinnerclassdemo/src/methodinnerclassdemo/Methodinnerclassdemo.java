package methodinnerclassdemo;

public class Methodinnerclassdemo 
{
 
    private int data=30;
    void display()
    {
        class Local
        {
            void msg()
            {
                System.out.println(data);
            }
        }
        Local l = new Local();
        l.msg();
    }

    
    public static void main(String[] args) 
    {
       Methodinnerclassdemo ib = new Methodinnerclassdemo();
       ib.display();
    }
    
}
