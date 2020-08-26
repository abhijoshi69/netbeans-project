package regexdemo;
import java.util.regex.*;
public class Regexdemo 
{
    public static void m1()
    {
        String s = "Virat Kohli is the best bastman in the world";
        Pattern p1 = Pattern.compile("is");
        Pattern p2 = Pattern.compile("Virat");
        Pattern p3 = Pattern.compile("bast...");
        Pattern p4 = Pattern.compile("[uvw]orld");
        Pattern p5 = Pattern.compile("[A-Z]");
        Pattern p6 = Pattern.compile("[a-z]");
        Matcher m = p1.matcher(s);
        if(m.find())
        {
            System.out.println(m.group());
            System.out.println("Match found");
        }
        else
        {
            System.out.println("Match not found");
        }
    }
    public static void m2()
    {
        String s = "Today is Christmas 15th May 2017";
        Pattern p1 = Pattern.compile("\\d");
        Pattern p2 = Pattern.compile("\\d\\d");
        Pattern p3 = Pattern.compile("\\D");
        Pattern p4 = Pattern.compile("\\S");
        Pattern p5 = Pattern.compile("\\Sis\\S");
        Pattern p6 = Pattern.compile("\\sis\\s");
        Matcher m = p1.matcher(s);
        if(m.find())
        {
            System.out.println(m.group());
            System.out.println("Match found");
        }
        else
        {
            System.out.println("Match not found");
        }
        
    }
    public static void m3()
    {
        String s = "Longlong long ago, in a  galaxy far far away";
        Pattern p1 = Pattern.compile("ago.*");
        Pattern p2 = Pattern.compile("ago.+");
        Pattern p3 = Pattern.compile("ago.?");
        Pattern p4 = Pattern.compile("ago.*far");
        Pattern p5 = Pattern.compile("ago.*?far");
        Pattern p6 = Pattern.compile("gal.{3}");
        Pattern p7 = Pattern.compile("(lay){2}");
        Pattern p8 = Pattern.compile("(far){2}");
        Matcher m = p4.matcher(s);
        if(m.find())
        {
            System.out.println(m.group());
            System.out.println("Match found");
            
        }
        else
        {
            System.out.println("Match not found");
        }

    }
    public static void m4()
    {
        String s = "ajay.poojary@gmail.co.in";
        Pattern p1 = Pattern.compile("(\\S+)\\.(\\S+)@(gmail|yahoo)\\.(com|net|co\\.in)");
        Matcher m = p1.matcher(s);
        if(m.find())
        {
            System.out.println(m.group());
            System.out.println("Match found");
                
            
        }
        else
        {
            System.out.println("Match not found");
        }
    }
    public static void main(String[] args) 
    {
        //m1();
        //m2();
        m3();
        //m4();
        
    }
    
}
