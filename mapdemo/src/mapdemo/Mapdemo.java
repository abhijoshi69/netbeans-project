package mapdemo;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
public class Mapdemo extends JFrame
{
    JLabel firstname,lastname,gender,contact,rollno;
    JTextField firstnametxt,lastnametxt,contacttxt,rollnotxt;
    JButton register,match;
    JRadioButton male,female;
    ButtonGroup bg;
    String user="sa";
    String pwd="sasa";
    String url="jdbc:sqlserver://localhost:1433;databaseName=Abhishek";
    String query="insert into Student90 values(?,?,?,?,?)";
    public Mapdemo()
    {
        
        //setContentPane(new JLabel(new ImageIcon()));
        firstname = new JLabel("Firstname");
        firstname.setBounds(120,80,200,30);
        firstname.setFont(new Font("Bebas",Font.BOLD,25));
        firstname.setForeground(new Color(26,35,126));
        add(firstname);
        
        firstnametxt = new JTextField();
        firstnametxt.setBounds(250,80,270,30);
        firstnametxt.setFont(new Font("Sofia",Font.BOLD,25));
        firstnametxt.setForeground(new Color(33,33,33));
        //firstnametxt.setBorder(new MatteBorder(0,0,2,0, Color.yellow));
        add(firstnametxt);
        
        lastname = new JLabel("Lastname");
        lastname.setBounds(120,140,200,30);
        lastname.setFont(new Font("Bebas",Font.BOLD,25));
        lastname.setForeground(new Color(26,35,126));
        add(lastname);
        
        lastnametxt = new JTextField();
        lastnametxt.setBounds(250,140,270,30);
        lastnametxt.setFont(new Font("Sofia",Font.BOLD,25));
        lastnametxt.setForeground(new Color(33,33,33));
        add(lastnametxt);
        
        contact = new JLabel("Contact");
        contact.setBounds(120,200,200,30);
        contact.setFont(new Font("Bebas",Font.BOLD,25));
        contact.setForeground(new Color(26,35,126));
        add(contact);
        
        contacttxt = new JTextField();
        contacttxt.setBounds(250,200,270,30);
        contacttxt.setFont(new Font("Sofia",Font.BOLD,25));
        contacttxt.setForeground(new Color(33,33,33));
        add(contacttxt);
        
        rollno = new JLabel("Roll No:");
        rollno.setBounds(120,260,200,30);
        rollno.setFont(new Font("Bebas",Font.BOLD,25));
        rollno.setForeground(new Color(26,35,126));
        add(rollno);
        
        rollnotxt = new JTextField();
        rollnotxt.setBounds(250,260,270,30);
        rollnotxt.setFont(new Font("Sofia",Font.BOLD,25));
        rollnotxt.setForeground(new Color(33,33,33));
        add(rollnotxt);
        
        gender = new JLabel("Gender");
        gender.setBounds(120,320,200,30);
        gender.setFont(new Font("Bebas",Font.BOLD,25));
        gender.setForeground(new Color(26,35,126));
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(250,320,200,30);
        male.setFont(new Font("Sofia",Font.BOLD,25));
        male.setForeground(new Color(33,33,33));
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(450,320,200,30);
        female.setFont(new Font("Sofia",Font.BOLD,25));
        female.setForeground(new Color(33,33,33));
        add(female);
        
        bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        
        register = new JButton("REGISTER");
        register.setBounds(80,400,200,40);
        register.setFont(new Font("Nexa Rust",Font.BOLD,25));
        register.setForeground(new Color(250,250,250));
        register.setBackground(new Color(38,50,56));
        add(register);
        
        match = new JButton("MATCH");
        match.setBounds(350,400,200,40);
        match.setFont(new Font("Nexa Rust",Font.BOLD,25));
        match.setBackground(new Color(38,50,56));
        match.setForeground(new Color(250,250,250));
        add(match);
        
        register.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) 
            {
                try
                {
                    Connection conn = DriverManager.getConnection(url,user,pwd);
                    PreparedStatement st = conn.prepareStatement(query);
                    st.setString(1,firstnametxt.getText());
                    st.setString(2,lastnametxt.getText());
                    st.setString(3,contacttxt.getText());
                    st.setString(4,rollnotxt.getText());
                    if(male.isSelected())
                    {
                        st.setString(5,"M");
                    }
                    else
                    {
                        st.setString(5,"F");
                    }
                    JOptionPane.showMessageDialog(null,"Values Inserted");
                    st.executeQuery();
                }
                catch(SQLException l)
                {
                    System.out.println(l);
                }
            }
        });
        
        match.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) 
            {
                new update();
            }
        });
        
        setSize(630,600);
        setLayout(null);
        //setBackground(Color.white);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) 
    {
        Mapdemo md = new Mapdemo(); 
    }
    
}
