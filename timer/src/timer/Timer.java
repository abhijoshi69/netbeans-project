package timer;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class Timer extends JFrame implements Runnable
{
    JTextField minutes,seconds;
    JButton Start,Stop;
    public Timer()
    {
        minutes = new JTextField();
        minutes.setBounds(120,80,150,30);
        minutes.setForeground(new Color(33,33,33));
        minutes.setFont(new Font("Bebas",Font.BOLD,25));
        add(minutes);
        
        seconds = new JTextField();
        seconds.setBounds(300,80,150,30);
        seconds.setForeground(new Color(33,33,33));
        seconds.setFont(new Font("Bebas",Font.BOLD,25));
        add(seconds);
        
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
        for(int i=4;i>=0;i--)
        {
    
            for(int j=59;j>=0;j--)
            {
                Thread.sleep(1000);
                seconds.setText(Integer.toString(j));
                
                
            }
            minutes.setText(Integer.toString(i));
            Thread.sleep(1200);
        }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
  
    public static void main(String[] args) 
    {
        Timer t = new Timer();
        Thread t1 = new Thread(t);
        t1.start();
    }
    
}
