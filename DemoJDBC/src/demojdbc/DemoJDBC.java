package demojdbc;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DemoJDBC extends JFrame
{
    JLabel firstname,lastname,emailid,username,password,gender,state;
    JTextField firsttxt,lasttxt,emailtxt,usertxt;
    JRadioButton male,female;
    JComboBox states;
    JButton submit,reset;
    JPasswordField pwd;
    ButtonGroup bg;
    String url = "jdbc:sqlserver://localhost:1433;databaseName=Student";
    String userid="sa";
    String pwds="sasa";
    String query ="insert into Employee values(?,?,?,?,?,?)";
    public DemoJDBC()
    {
        
        
       
        
        firstname = new JLabel("First Name:");
        firstname.setBounds(120,80,150,30);
        add(firstname);
        
        firsttxt = new JTextField();
        firsttxt.setBounds(240,80,150,35);
        add(firsttxt);
        
        lastname = new JLabel("Last Name:");
        lastname.setBounds(120,140,150,30);
        add(lastname);
        
        lasttxt = new JTextField();
        lasttxt.setBounds(240,140,150,35);
        add(lasttxt);
        
        emailid = new JLabel("Email ID:");
        emailid.setBounds(120,220,150,30);
        add(emailid);
        
        emailtxt = new JTextField();
        emailtxt.setBounds(240,220,150,35);
        add(emailtxt);
       
        user
        
        gender = new JLabel("Gender:");
        gender.setBounds(120,280,150,30);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(240,280,150,35);
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(390,280,150,35);
        add(female);
       
        bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        
        password = new JLabel("Password:");
        password.setBounds(120,340,150,30);
        add(password);
        
        pwd = new JPasswordField();
        pwd.setBounds(240,340,150,35);
        add(pwd);
        
        state = new JLabel("State");
        state.setBounds(120,400,150,30);
        add(state);
        
        states = new JComboBox();
        states.setBounds(240,400,150,35);
        states.addItem("Maharashtra");
        states.addItem("Gujrat");
        states.addItem("Himmachal Pradesh");
        states.addItem("Uttarakhand");
        states.addItem("Madhya Pradesh");
        add(states);
        
        submit = new JButton("Submit");
        submit.setBounds(150,460,150,30);
        add(submit);
        
        reset = new JButton("Reset");
        reset.setBounds(350,460,150,30);
        add(reset);
       
        submit.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e) 
            {
                try
                {
                    Connection conn = DriverManager.getConnection(url,userid,pwds);
                    System.out.println("Connection Successfull");
                    PreparedStatement st = conn.prepareStatement(query);
                    String fstnm=firsttxt.getText();
                    String lstnm=lasttxt.getText();
                    String emlt=emailtxt.getText();
                    String p = pwd.getText();
                    st.setString(1,fstnm);
                    st.setString(2,lstnm);
                    st.setString(3,emlt);
                    st.setString(4,p);
                    System.out.println("values inserted");
                    if(male.isSelected())
                    {
                        st.setString(5,"M");
                    }
                    else
                    {
                        st.setString(5,"F");
                    }
                   String s  = states.getSelectedItem().toString();
                   
                   st.setString(6, s);
                    JOptionPane.showMessageDialog(null, "Values Inserted");
                    st.executeUpdate();
                }
                catch(SQLException n)
                {
                    System.out.println(n);
                }
            }
        });
        reset.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e)
            {
                firsttxt.setText("");
                lasttxt.setText("");
                emailtxt.setText("");
                pwd.setText("");
            }
        });
        
         setTitle("Demo");
        setSize(600,600);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
   
    public static void main(String[] args) 
    {
       DemoJDBC d = new DemoJDBC();
       
       
    }
    
}