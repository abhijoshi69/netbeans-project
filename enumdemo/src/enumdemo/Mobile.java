
package enumdemo;
import static enumdemo.Profile.*;
public class Mobile
{
    private Profile profile = GENERAL;
    
    public void changeProfile(Profile profile)
    {
            this.profile = profile;
            switch(this.profile)
            {
                case FLIGHT:
                {
                    System.out.println("Mobile is in Flight mode");
                }
                break;
                case SILENT:
                {
                    System.out.println("Mobile is in Silent mode");
                }
                break;
                case MEETING:
                {
                    System.out.println("Mobile is in Meeting mode");
                }
                break;
                case GENERAL:
                {
                    System.out.println("Mobile is in General mode");
                }
                break;
                case OUTDOOR:
                {
                    System.out.println("Mobile is in Outdoor mode");
                }
                break;
                case VIBRATION:
                {
                    System.out.println("Mobile is in Vibration mode");
                }
                break;
            }
    }
}
