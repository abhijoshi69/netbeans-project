package threaddemo1;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
public class Threaddemo1  extends JFrame implements Runnable 
{
    JTextField watch;
    public Threaddemo1()
    {
        watch = new JTextField();
        watch.setBounds(120,150,150,30);
        watch.setFont(new Font("Arial",Font.BOLD,25));
        watch.setForeground(new Color(33,33,33));
        add(watch);
        
        setSize(600,600);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
    }
    public void run()
    {
        
        try
        {
            for(int i=10;i>=0;i--)
            {
                Thread.sleep(1000);
                watch.setText(Integer.toString(i));
                
            }
            JOptionPane.showMessageDialog(null,"Time Over");
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        
        
    }

   
    public static void main(String[] args)
    {
        Threaddemo1 d = new Threaddemo1();
        Thread t = new Thread(d);
        t.start();
    }
    
}
