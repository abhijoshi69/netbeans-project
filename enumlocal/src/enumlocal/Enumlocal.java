
package enumlocal;
import static enumlocal.Profile.*;
public class Enumlocal 
{
    
  
    public static void main(String[] args)
    {
         Computer c = new Computer();
         c.changeProfile(AEROPLANE);
         c.changeProfile(SILENT);
         c.changeProfile(FLIGHT);
         c.changeProfile(SHUTDOWN);
         c.changeProfile(RESTART);
         c.changeProfile(SLEEP);
         
    }
    
}
