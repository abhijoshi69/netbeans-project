package idem;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.ResourceBundle;


public class Idem 
{
    static Locale c = Locale.ENGLISH; 
    static Locale e = Locale.US;
    static Locale f = new Locale("fr","FR");
    static Locale z = new Locale("zn","ZN");
    static ResourceBundle rb = ResourceBundle.getBundle("Vipul",c);
    public static void printmenu() throws IOException
    {
        String ch;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do
        {
            System.out.println("-------Menu-------");
            System.out.println("1."+rb.getString("m1"));
            System.out.println("2."+rb.getString("m2"));
            System.out.println("3."+rb.getString("m3"));
            System.out.println("Q"+rb.getString("mquite"));
            System.out.println(rb.getString("mchoice"));
            System.out.println(rb.getLocale());
            ch=br.readLine();
            switch(ch)
            {
                case "1":
                    setEnglish();
                    break;
                case "2":
                    setFrench();
                    break;
                case "3":
                    setChinese();
                    break;
                case "q":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option try again");
            }
            
        }
        while(true);
    }

    
    public static void main(String[] args) throws IOException 
    {
        printmenu();
        
    }
    public static void setEnglish()
    {
        rb = ResourceBundle.getBundle("Viput",e);
    }
    public static void setFrench()
    {
        rb = ResourceBundle.getBundle("Viput",f);
    }
    public static void setChinese()
    {
        rb = ResourceBundle.getBundle("Viput",z);
    }
    
}
