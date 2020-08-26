
package typecastingdemo1;
class Employee 
{
    public Employee()
    {
        System.out.println("Employee");
    }
    public void print()
    {
        System.out.println("Employee details");
    }
}
class Manager extends Employee
{
        public Manager()
        {
            System.out.println("Manger ");
        }


    @Override
    public void print()
    {
        System.out.println("Manager details");
    }
}
class Supervisor extends Employee
{
    public Supervisor()
    {
        System.out.println("Supervisor");
    }
    @Override
    public void print()
    {
        System.out.println("Supervisor details");
    }
}
public class Typecastingdemo1 
{

  
    public static void main(String[] args) 
    {
      Employee e1,e2;
      Manager m1;
      Supervisor s1;
//      e1 = new Manager();
//      e2 = new Supervisor();
      Employee e3 = new Employee();
    //  m1 = (Manager)e1;
     // s1 = (Supervisor)e2;
      e3.print();
       
    }
    
}
