package pdemo;
import javax.swing.*;
import java.awt.event.*;
public class Pdemo extends JFrame
{
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1;
    public Pdemo()
    {
        
    }
    public Pdemo(String s)
    {
        super(s);
    }
    public void setComponents()
    {
        l1 = new JLabel("Addition of 2 no");
        l2 = new JLabel("1st no");
        l3 = new JLabel("2nd no");
        l4 = new JLabel();
        t1 = new JTextField();
        t2 = new JTextField();
        b1 = new JButton("Add");
        setLayout(null);
        l1.setBounds(50,80,200,20);
        l2.setBounds(50,120,100,20);
        t1.setBounds(150,120,100,20);
        l3.setBounds(50,150,100,20);
        t2.setBounds(150,150,100,20);
        b1.setBounds(80,180,100,20);
        l4.setBounds(50,240,200,20);
        b1.addActionListener(new Handler());
        add(l1);
        add(l2);
        add(t1);
        add(l3);
        add(b1);
        add(l4);
    }
    class Handler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int s = a+b;
            l4.setText("Result is "+s);
        }
    }
   
    public static void main(String[] args)
    {
      Pdemo p = new Pdemo("Demo");
      p.setVisible(true);
      
    }
    
}
