
package enumdemo;
import static enumdemo.Profile.*;
public class Enumdemo 
{

   public static void main(String[] args)
   {
       Mobile m = new Mobile();
       m.changeProfile(SILENT);
       m.changeProfile(GENERAL);
       m.changeProfile(FLIGHT);
       m.changeProfile(OUTDOOR);
       m.changeProfile(MEETING);
       m.changeProfile(VIBRATION);
   }
    
}
