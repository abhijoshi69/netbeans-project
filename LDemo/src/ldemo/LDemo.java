
package ldemo;
import javax.swing.*;


public class LDemo extends JFrame 
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    JTextField t1,t2,t3,t4,t5;
    JComboBox dept,num;
    JRadioButton Male,Female;
    ButtonGroup bg;
    JButton b1,b2;
    public LDemo()
    {
        
    }
    public LDemo(String s)
    {
        super(s);
    }
    public void setComponents()
    {
        l1 = new JLabel("Name");
        l2 = new JLabel("Company Name");
        l3 = new JLabel("Salary");
        l4 = new JLabel("Geneder");
        l5 = new JLabel("Category");
        l6 = new JLabel("Address");
        l7 = new JLabel("Performance");
        l8 = new JLabel();
        t1 = new JTextField();
        t1.setText("Name of the system");
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        t5 = new JTextField();
        Male = new JRadioButton("Male");
        Female = new JRadioButton("Female");
        bg = new ButtonGroup();
        bg.add(Male);
        bg.add(Female);
        dept = new JComboBox();
        dept.addItem("Sales department");
        dept.addItem("Quality department");
        dept.addItem("Custom department");
        num = new JComboBox();
        num.addItem("1");
        num.addItem("2");
        num.addItem("3");
        num.addItem("4");
        num.addItem("5");
        b1 = new JButton("Submit");
        b2 = new JButton("Exit");
        setLayout(null);
        t1.setBounds(50,50,100,20);
        l1.setBounds(50,80,100,20);
        t2.setBounds(150,80,100,20);
        l2.setBounds(50,100,100,20);
        t3.setBounds(150,100,100,20);
        l3.setBounds(50,120,100,20);
        t4.setBounds(150,120,100,20);
        l4.setBounds(50,140,100,20);
        Male.setBounds(150,140,100,20);
        Female.setBounds(260,140,100,20);
        l5.setBounds(50,160,100,20);
        dept.setBounds(150,160,100,20);
        l6.setBounds(50,180,100,20);
        t5.setBounds(150,180,100,20);
        l7.setBounds(50,200,100,20);
        num.setBounds(150,200,100,20);
        b1.setBounds(80,240,100,20);
        b2.setBounds(200,240,100,20);
        l8.setBounds(50,260,200,20);
        add(t1);
        add(l1);
        add(t2);
        add(l2);
        add(t3);
        add(l3);
        add(t4);
        add(l4);
        add(Male);
        add(Female);
        add(l5);
        add(dept);
        add(l6);
        add(t5);
        add(l7);
        add(num);
        add(b1);
        add(b2);
        add(l8);
        
        
                
        
    }

    
    public static void main(String[] args) 
    {
       LDemo ld = new LDemo();
       ld.setComponents();
       ld.setVisible(true);
       ld.setDefaultCloseOperation(LDemo.EXIT_ON_CLOSE);
       ld.setSize(300,300);
    }
    
}
