
package rtdemo;
import javax.swing.*;
import java.awt.event.*;

public class Rtdemo extends JFrame
{
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b1;
    public Rtdemo()
    {
        JLabel l1 = new JLabel("Addition of two numbers");
        JLabel l2 = new JLabel("1st number");
        JLabel l3 = new JLabel("2nd number");
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();
        JButton b1 = new JButton("1");
        l1.setBounds(80,80,200,20);
        l2.setBounds(50,140,200,20);
        t1.setBounds(170,140,200,20);
        l3.setBounds(50,210,200,20);
        t2.setBounds(170,210,200,20);
        t3.setBounds(50,280,200,20);
        b1.setBounds(450,280,50,50);
        setLayout(null);
        add(l1);
        add(l2);
        add(t1);
        add(l3);
        add(t2);
        add(t3);
        add(b1);
        b1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int s = a+b;
                t3.setText("Addition of two no is "+s);
            }
        });
    }

   
    public static void main(String[] args) 
    {
        Rtdemo t = new Rtdemo();
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t.setVisible(true);
        t.setSize(300,300);
    }
    
}
