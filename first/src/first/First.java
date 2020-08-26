
package first;
import java.util.Scanner;
public class First 
{
    char ch;
    Scanner obj = new Scanner(System.in);
    public void accept()
    {
        System.out.println("enter a character");
        ch=obj.next().charAt(0);
    }
    public void display()
    {
        switch(ch)
        {
            case 'a':
            {
                System.out.println("It is a vowel"+ch);
            }
            break;
            case 'e':
            {
                System.out.println("It is a vowel"+ch);
            }
            break;
            case 'i':
            {
                System.out.println("It is a vowel"+ch);
            }
            break;
            case 'o':
            {
                System.out.println("It is a vowel"+ch);
            }
            break;
            case 'u':
            {
                System.out.println("It is a vowel"+ch);
            }
            break;
            default:
            {
                System.out.println("It is a consonant");
            }
            break;
        }
    }

    
    
    public static void main(String[] args) 
    {
      First in = new First();
      in.accept();
      in.display();
    }
    
}
