package javademo1;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
import javax.swing.*;
public class JavaDemo1 extends JFrame 
{
    JLabel selectedword,select;
    JTextField selectedtxt,showtxt;
    JComboBox words;
    JRadioButton german,french,portugal,spain;
    ButtonGroup bg;
    JButton translate;
    public JavaDemo1()
    {
        selectedword = new JLabel("SelectedWord");
        selectedword.setBounds(60,80,200,30);
        selectedword.setFont(new Font("Arial",Font.BOLD,25));
        selectedword.setForeground(new Color(1,87,155));
        add(selectedword);
        
        selectedtxt = new JTextField();
        selectedtxt.setBounds(240,80,270,30);
        selectedtxt.setFont(new Font("Arial",Font.BOLD,25));
        selectedtxt.setForeground(new Color(33,33,33));
        add(selectedtxt);
        
        select = new JLabel("Select");
        select.setBounds(590,80,200,30);
        select.setFont(new Font("Arial",Font.BOLD,25));
        select.setForeground(new Color(1,87,155));
        add(select);
        
        words = new JComboBox();
        words.addItem("Welcome");
        words.addItem("Good Bye");
        words.addItem("Hello");
        words.addItem("Listen");
        words.setBounds(700,80,270,30);
        words.setFont(new Font("Arial",Font.BOLD,25));
        words.setForeground(new Color(33,33,33));
        add(words);
        
        german = new JRadioButton("German");
        german.setBounds(150,140,200,30);
        german.setFont(new Font("Arial",Font.BOLD,25));
        german.setForeground(new Color(1,87,155));
        add(german);
        
        portugal = new JRadioButton("Portugal");
        portugal.setBounds(500,140,200,30);
        portugal.setFont(new Font("Arial",Font.BOLD,25));
        portugal.setForeground(new Color(1,87,155));
        add(portugal);
        
        french = new JRadioButton("French");
        french.setBounds(150,220,200,30);
        french.setFont(new Font("Arial",Font.BOLD,25));
        french.setForeground(new Color(1,87,155));
        add(french);
        
        spain = new JRadioButton("Spain");
        spain.setBounds(500,220,200,30);
        spain.setFont(new Font("Arial",Font.BOLD,25));
        spain.setForeground(new Color(1,87,155));
        add(spain);
        
        bg = new ButtonGroup();
        bg.add(german);
        bg.add(portugal);
        bg.add(french);
        bg.add(spain);
        
        showtxt = new JTextField();
        showtxt.setBounds(120,300,270,30);
        showtxt.setFont(new Font("Arial",Font.BOLD,25));
        showtxt.setForeground(new Color(33,33,33));
        add(showtxt);
        
        translate = new JButton("Translate");
        translate.setBounds(450,300,200,30);
        translate.setFont(new Font("Arial",Font.BOLD,25));
        translate.setForeground(new Color(33,33,33));
        translate.setBackground(new Color(255,87,34));
        add(translate);
        
        words.addActionListener(new ActionListener() 
        {

            @Override
            public void actionPerformed(ActionEvent e) 
            {
                String selectedvalue = words.getSelectedItem().toString();
                selectedtxt.setText(selectedvalue);
            }
        });
        
        translate.addActionListener(new ActionListener() 
        {

            @Override
            public void actionPerformed(ActionEvent e) 
            {
                if(german.isSelected())
                {
                    String gm = selectedtxt.getText();
                    Locale l1 = new Locale("de","DE");
                    ResourceBundle rb = ResourceBundle.getBundle("lang",l1);
                    switch(gm)
                    {
                        case "Welcome":
                            showtxt.setText(rb.getString("m1"));
                            break;
                        case "Good Bye":
                            showtxt.setText(rb.getString("m2"));
                            break;
                        case "Hello":
                            showtxt.setText(rb.getString("m3"));
                            break;
                        case "Listen":
                            showtxt.setText(rb.getString("m4"));
                            break;
                        
                    }
                }
                if(portugal.isSelected())
                {
                    String ch = selectedtxt.getText();
                    Locale l2 = new Locale("pt","PT");
                    ResourceBundle rb1 = ResourceBundle.getBundle("lang",l2);
                    switch(ch)
                    {
                        case "Welcome":
                            showtxt.setText(rb1.getString("m1"));
                            break;
                        case "Good Bye":
                            showtxt.setText(rb1.getString("m2"));
                            break;
                        case "Hello":
                            showtxt.setText(rb1.getString("m3"));
                            break;
                        case "Listen":
                            showtxt.setText(rb1.getString("m4"));
                            break;
                    }
                }
                if(french.isSelected())
                {
                    String fd = selectedtxt.getText();
                    Locale l3 = new Locale("fr","FR");
                    ResourceBundle rb2 = ResourceBundle.getBundle("lang",l3);
                    switch(fd)
                    {
                        case "Welcome":
                            showtxt.setText(rb2.getString("m1"));
                            break;
                        case "Good Bye":
                            showtxt.setText(rb2.getString("m2"));
                            break;
                        case "Hello":
                            showtxt.setText(rb2.getString("m3"));
                            break;
                        case "Listen":
                            showtxt.setText(rb2.getString("m4"));
                            break;
                            
                    }
                }
                if(spain.isSelected())
                {
                    String sp = selectedtxt.getText();
                    Locale l4 = new Locale("es","AR");
                    ResourceBundle rb3 = ResourceBundle.getBundle("lang",l4);
                    switch(sp)
                    {
                        case "Welcome":
                            showtxt.setText(rb3.getString("m1"));
                            break;
                        case "Good Bye":
                            showtxt.setText(rb3.getString("m2"));
                            break;
                        case "Hello":
                            showtxt.setText(rb3.getString("m3"));
                            break;
                        case "Listen":
                            showtxt.setText(rb3.getString("m4"));
                            break;
                    }
                }
            }
            
        });
        
        setSize(1200,800);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }

    
    public static void main(String[] args) 
    {
        JavaDemo1 j = new JavaDemo1();
    }
    
}
