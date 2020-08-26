
package employeedemo;
import javax.swing.*;

public class Employeedemo extends JFrame
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    JRadioButton m1,m2,m3,m4,m5,m6;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8;
    ButtonGroup bg;
    public Employeedemo()
    {
        
    }
    public Employeedemo(String s)
    {
        super(s);
    }
    
    public void setComponents()
    {
        l1 = new JLabel("Employee Name:");
        l2 = new JLabel("Employee Id:");
        l3 = new JLabel("Sex:");
        l4 = new JLabel("Email:");
        l5 = new JLabel("Contact NO.:");
        l6 = new JLabel("Department");
        l7 = new JLabel("Name of Immediate Supervisor:");
        l8 = new JLabel("Problem Category:");
        l9 = new JLabel("Please describe the details of your grievances:");
        l10 = new JLabel("Please list the settlement you are requesting:");
        l11 = new JLabel();
        m1 = new JRadioButton("Male");
        m2 = new JRadioButton("Female");
        m3 = new JRadioButton("Infrastructure");
        m4 = new JRadioButton("Food");
        m5 = new JRadioButton("Cab");
        m6 = new JRadioButton("Work Environment");
        bg = new ButtonGroup();
        bg.add(m1);
        bg.add(m2);
        bg.add(m3);
        bg.add(m4);
        bg.add(m5);
        bg.add(m6);
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        t5 = new JTextField();
        t6 = new JTextField();
        t7 = new JTextField();
        t8 = new JTextField();
        l1.setBounds(50,50,100,20);
        t1.setBounds(150,50,100,20);
        l2.setBounds(270,50,100,20);
        t2.setBounds(350,50,100,20);
        l3.setBounds(50,80,100,20);
        m1.setBounds(150,80,100,20);
        m2.setBounds(270,80,100,20);
        l4.setBounds(50,100,100,20);
        t3.setBounds(150,100,100,20);
        l5.setBounds(270,100,100,20);
        t4.setBounds(350,100,100,20);
        l6.setBounds(50,120,100,20);
        t5.setBounds(150,120,100,20);
        l7.setBounds(50,140,250,20);
        t6.setBounds(250,140,100,20);
        l8.setBounds(50,160,150,20);
        m3.setBounds(170,160,150,20);
        m4.setBounds(320,160,80,20);
        m5.setBounds(400,160,80,20);
        m6.setBounds(510,160,200,20);
        l9.setBounds(50,180,400,20);
        t7.setBounds(50,200,400,50);
        l10.setBounds(50,250,400,20);
        t8.setBounds(50,270,400,50);
        l11.setBounds(50,260,200,20);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(m1);
        add(m2);
        add(l4);
        add(t3);
        add(l5);
        add(t4);
        add(l6);
        add(t5);
        add(l7);
        add(t6);
        add(l8);
        add(m3);
        add(m4);
        add(m5);
        add(m6);
        add(l9);
        add(t7);
        add(l10);
        add(t8);
        add(l11);
        
                
        
        
        
    }
    
    

    public static void main(String[] args)
    {
       Employeedemo ed = new Employeedemo("Employeedemo");
       ed.setComponents();
       ed.setVisible(true);
       ed.setDefaultCloseOperation(Employeedemo.EXIT_ON_CLOSE);
       ed.setSize(300,300);
    }
    
}
