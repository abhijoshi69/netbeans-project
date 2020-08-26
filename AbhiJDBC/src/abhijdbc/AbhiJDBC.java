
package abhijdbc;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AbhiJDBC extends JFrame 
{
    JLabel name,email,password,address,contactno,gender;
    JTextField nametxt,emailtxt,contacttxt;
    JTextArea addresstxt;
    JPasswordField pwdtxt;
    JRadioButton male,female;
    ButtonGroup bg;
    JButton submit,reset;
    String url="jdbc:sqlserver://localhost:1433;databaseName=Abhishek";
    String userid="sa";
    String pwds="sasa";
    String query = "insert into Sud1 values (?,?,?,?,?,?)";
    
    public AbhiJDBC()
    {
        name = new JLabel("Name:");
        name.setBounds(120,80,140,30);
        add(name);
        
        nametxt = new JTextField();
        nametxt.setBounds(240,80,150,35);
        add(nametxt);
        
        email = new JLabel("EmailId:");
        email.setBounds(120,140,150,30);
        add(email);
        
        emailtxt = new JTextField();
        emailtxt.setBounds(240,140,150,35);
        add(emailtxt);
        
        password = new JLabel("Password:");
        password.setBounds(120,200,150,30);
        add(password);
        
        pwdtxt = new JPasswordField();
        pwdtxt.setBounds(240,200,150,35);
        add(pwdtxt);
        
        address = new JLabel("Address");
        address.setBounds(120,260,150,35);
        add(address);
        
        addresstxt = new JTextArea();
        addresstxt.setBounds(240,260,200,50);
        add(addresstxt);
        
        contactno = new JLabel("ContactNO:");
        contactno.setBounds(120,350,150,30);
        add(contactno);
        
        contacttxt = new JTextField();
        contacttxt.setBounds(240,350,150,35);
        add(contacttxt);
        
        gender = new JLabel("Gender");
        gender.setBounds(120,430,150,30);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(240,430,150,35);
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(400,430,150,35);
        add(female);
        
        bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        
        submit = new JButton("Submit");
        submit.setBounds(150,500,160,40);
        add(submit);
        
        reset = new JButton("Reset");
        reset.setBounds(350,500,160,40);
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
                    st.setString(1,nametxt.getText());
                    st.setString(2,emailtxt.getText());
                    st.setString(3,pwdtxt.getText());
                    st.setString(4,addresstxt.getText());
                    st.setString(5,contacttxt.getText());
                    if(male.isSelected())
                    {
                        st.setString(6,"M");
                    }
                    else
                    {
                        st.setString(6,"F");
                    }
                    JOptionPane.showMessageDialog(null,"Value Inserted");
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
               nametxt.setText("");
               emailtxt.setText("");
               pwdtxt.setText("");
               addresstxt.setText("");
               contacttxt.setText("");
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
        AbhiJDBC a = new AbhiJDBC();
    }
    
}
