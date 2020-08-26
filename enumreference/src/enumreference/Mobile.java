
package enumreference;
import static enumreference.Profile.*;

public class Mobile 
{
     private Profile profile = GENERAL;

     public void changeProfile(Profile profile)
     {
        this.profile=profile;
        switch(this.profile)
        {
           case SILENT:
               {
                        System.out.println("Mobile is in on Silent Mode");
               }
               break;
           case  MEETING:
           {
               System.out.println("Mobile is on Meeting mode");
           }
            break;
           case OUTDOOR:
           {
               System.out.println("Mobile is on Outdoor mode");
           }
           break;
           case VIBRATION:
           {
                System.out.println("Mobile is on Vibration mode");
           }
           break;
           case GENERAL:
           {
               System.out.println("Mobile is on General mode");
           }
           break;
           case FLIGHT:
           {
               System.out.println("Mobile is on Flight mode");
           }
           break;
        }

     }
}
