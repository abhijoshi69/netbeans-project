package assertiondemo;
import java.util.Scanner;
public class Assertiondemo 
{
    

    public static void main(String[] args) 
    {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if(num>0)
        {
            System.out.println("Positive no");
        }
        else
        {
            assert(num<0);
            System.out.println("Negative No");
        }
     
    }
    
}
