package ndemo;
import javax.swing.*;
import java.awt.event.*;

public class Ndemo extends JFrame
{
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1;
 
    public Ndemo()
    {
        
    }
    public Ndemo(String s)
    {
        super(s);
    }
    public void setComponents()
    {
        l1 = new JLabel("Name:");
        l2 = new JLabel("Contact number:");
        l3 = new JLabel();
        l4 = new JLabel();
        t1 = new JTextField();
        t2 = new JTextField();
        b1 = new JButton("Submit");
        setLayout(null);
        l1.setBounds(50,80,100,20);
        t1.setBounds(150,80,100,20);
        l2.setBounds(50,120,100,20);
        t2.setBounds(150,120,100,20);
        b1.setBounds(80,150,100,20);
        b1.addActionListener(new Handler());
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
    }
    class Handler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            String a = String.valueOf(t1.getText());
            String b = String.valueOf(t2.getText());
            JMenuBar m;
            m = new JMenuBar();
            setJMenuBar(m);
            setVisible(true);
            setSize(300,300);
            setTitle("Demo1");
            l3.setBounds(50,120,100,20);
            l4.setBounds(50,150,100,20);
            l3.setText("Name: "+a);
            l4.setText("Contact number: "+b);
        }
        
    }

   
    public static void main(String[] args) 
    {
        Ndemo n = new Ndemo("Demo");
        n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        n.setVisible(true);
        n.setSize(300,300);
        n.setComponents();
    }
    
}
