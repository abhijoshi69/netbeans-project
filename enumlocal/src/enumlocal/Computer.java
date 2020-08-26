
package enumlocal;
import static enumlocal.Profile.*;

public class Computer 
{
     private Profile profile = AEROPLANE;
     public void changeProfile(Profile profile)
     {
         this.profile=profile;
         switch(this.profile)
         {
             case AEROPLANE:
             {
                 System.out.println("Computer is on Aeroplane mode");
             }
             break;
             case SILENT:
             {
                 System.out.println("Computer is on Silent mode");
             }
             break;
             case SHUTDOWN:
             {
                 System.out.println("Computer is Shutdown");
             }
             break;
             case RESTART:
             {
                 System.out.println("Computer is Restarting");
             }
             break;
             case FLIGHT:
             {
                 System.out.println("Computer is on Flight mode");
             }
             break;
             case SLEEP:
             {
                 System.out.println("Computer is on  Sleep mode");
             }
             break;
         }
     }
}
