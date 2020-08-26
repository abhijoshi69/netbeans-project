
package enumreference;
import static enumreference.Profile.*;
public class Enumreference 
{

    public static void main(String[] args) 
    {
        Mobile m = new Mobile();
        m.changeProfile(GENERAL);
        m.changeProfile(SILENT);
        m.changeProfile(MEETING);
        m.changeProfile(OUTDOOR);
        m.changeProfile(VIBRATION);
        m.changeProfile(FLIGHT);
    
     
    }
    
}
