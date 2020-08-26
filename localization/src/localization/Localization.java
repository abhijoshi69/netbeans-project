
package localization;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;


public class Localization extends JFrame 
{
    JLabel m1,m2,m3;
    JTextField t1,t2;
    JRadioButton r1,r2,r3,r4;
    JButton b1;
    JComboBox c1;
    ButtonGroup bg;
    public Localization()
    {
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        JLabel m1 = new JLabel("Enter String");
        JLabel m2 = new JLabel("Output String");
        JLabel m3 = new JLabel("item list");
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JRadioButton r1 = new JRadioButton("German");
        JRadioButton r2 = new JRadioButton("Chinese");
        JRadioButton r3 = new JRadioButton("French");
        JRadioButton r4 = new JRadioButton("Spanish");
        JComboBox c1 = new JComboBox();
        c1.addItem("Welcome");
        c1.addItem("Bye");
        c1.addItem("Hello");
        c1.addItem("Abhishek");
        bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);
        JButton b1 = new JButton("Submit");
        setLayout(null);
        t1.setEditable(false);
        m1.setBounds(50,80,200,20);
        t1.setBounds(140,80,200,20);
        m3.setBounds(450,80,200,20);
        c1.setBounds(550,80,200,20);
        r1.setBounds(50,180,200,20);
        r2.setBounds(270,180,200,20);
        r3.setBounds(50,260,200,20);
        r4.setBounds(270,260,200,20);
        m2.setBounds(50,340,200,20);
        t2.setBounds(140,340,200,20);
        b1.setBounds(420,340,200,20);
        add(m1);
        add(t1);
        add(m3);
        add(c1);
        add(r1);
        add(r2);
        add(r3);
        add(r4);
        add(m2);
        add(t2);
        add(b1);
        c1.addActionListener(new ActionListener()
        {
            @Override
                public void actionPerformed(ActionEvent e)
                {
                   String selectedValue = c1.getSelectedItem().toString();
                   t1.setText(selectedValue);
                }
        });
        b1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(r1.isSelected())
                {
                    String gm = t1.getText();
                    Locale Germany = new Locale("de","DE");
                    ResourceBundle rb = ResourceBundle.getBundle("Text", Germany);
                    switch(gm)
                    {
                        case "Welcome":
                            t2.setText(rb.getString("m1"));
                            break;
                            
                        case "Bye":
                             t2.setText(rb.getString("m2"));
                             break;
                            
                        case "Hello":
                             t2.setText(rb.getString("m3"));
                             break;
                           
                        case "Abhishek":
                             t2.setText(rb.getString("m4"));
                             break;
                           
                        default:
                             t2.setText("Invalid Character");
                         
                            
                    }
                    
                }
                if(r2.isSelected())
                {
                    String ch = t1.getText();
                    Locale Chinese = new Locale("zh","CN");
                    ResourceBundle rb = ResourceBundle.getBundle("Text",Chinese);
                    switch(ch)
                    {
                        case "Welcome":
                            t2.setText(rb.getString("m1"));
                            break;
                            
                        case "Bye":
                             t2.setText(rb.getString("m2"));
                             break;
                            
                        case "Hello":
                             t2.setText(rb.getString("m3"));
                             break;
                           
                        case "Abhishek":
                             t2.setText(rb.getString("m4"));
                             break;
                           
                        default:
                             t2.setText("Invalid Character");
                        
                    }
                    
                }
                 if(r3.isSelected())
                {
                    String fre = t1.getText();
                    Locale French = new Locale("fr","FR");
                    ResourceBundle rb = ResourceBundle.getBundle("Text",French);
                    switch(fre)
                    {
                        case "Welcome":
                            t2.setText(rb.getString("m1"));
                            break;
                            
                        case "Bye":
                             t2.setText(rb.getString("m2"));
                             break;
                            
                        case "Hello":
                             t2.setText(rb.getString("m3"));
                             break;
                           
                        case "Abhishek":
                             t2.setText(rb.getString("m4"));
                             break;
                           
                        default:
                             t2.setText("Invalid Character");
                        
                    }
                    
                }
                  if(r4.isSelected())
                {
                    String spa = t1.getText();
                    Locale Spanish= new Locale("es","AR");
                    ResourceBundle rb = ResourceBundle.getBundle("Text",Spanish);
                    switch(spa)
                    {
                        case "Welcome":
                            t2.setText(rb.getString("m1"));
                            break;
                            
                        case "Bye":
                             t2.setText(rb.getString("m2"));
                             break;
                            
                        case "Hello":
                             t2.setText(rb.getString("m3"));
                             break;
                           
                        case "Abhishek":
                             t2.setText(rb.getString("m4"));
                             break;
                           
                        default:
                             t2.setText("Invalid Character");
                        
                    }
                    
                }
        }
        });
        
    }
 
    
 

    
    public static void main(String[] args) 
    {
       Localization l = new Localization();
     }
    
}
