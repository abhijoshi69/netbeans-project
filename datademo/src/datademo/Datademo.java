package datademo;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
public class Datademo extends JFrame 
{
    JLabel name,contactno,address,gender,states,reg,username,li,click;
    JTextField nametxt,contactnotxt,usernametxt;
    JComboBox states1;
    JTextArea addresstxt;
    JRadioButton male,female;
    ButtonGroup bg;
    String h,link,click1;
    String url="jdbc:sqlserver://localhost:1433;databaseName=login";
    String user="sa";
    String pwd="sasa";
    String query="Insert into login values(?,?,?,?,?,?)";
    JButton submit,reset;
    public Datademo()
    {
        
        h="<html><u>Registration Page</u></html>";
        reg = new JLabel(h);
        reg.setBounds(450,70,400,50);
        reg.setFont(new Font("Arial",Font.BOLD,34));
        reg.setForeground(new Color(96,125,139));
        add(reg);
        
        name = new JLabel("Name:");
        name.setBounds(410,140,150,35);
        name.setFont(new Font("Calbri",Font.BOLD,25));
        name.setForeground(new Color(26,35,126));
        add(name);
        
        nametxt = new JTextField();
        nametxt.setBounds(495,140,270,35);
        nametxt.setFont(new Font("Calbri",Font.BOLD,20));
        nametxt.setForeground(new Color(26,35,126));
        add(nametxt);
        
        contactno = new JLabel("Contact no:");
        contactno.setBounds(345,200,150,30);
        contactno.setFont(new Font("Calbri",Font.BOLD,25));
        contactno.setForeground(new Color(26,35,126));
        add(contactno);
        
        contactnotxt = new JTextField();
        contactnotxt.setBounds(495,200,270,35);
        contactnotxt.setFont(new Font("Calbri",Font.BOLD,25));
        contactnotxt.setForeground(new Color(26,35,126));
        add(contactnotxt);
        
        username = new JLabel("Username:");
        username.setBounds(360,260,150,30);
        username.setFont(new Font("Calbri",Font.BOLD,25));
        username.setForeground(new Color(26,35,126));
        add(username);
        
        usernametxt = new JTextField();
        usernametxt.setBounds(495,260,270,35);
        usernametxt.setFont(new Font("Calbri",Font.BOLD,25));
        usernametxt.setForeground(new Color(26,35,126));
        add(usernametxt);
        
        address = new JLabel("Address:");
        address.setBounds(380,320,150,30);
        address.setFont(new Font("Calbri",Font.BOLD,25));
        address.setForeground(new Color(26,35,126));
        add(address);
        
        addresstxt = new JTextArea();
        addresstxt.setBounds(495,320,270,70);
        addresstxt.setFont(new Font("Calbri",Font.BOLD,20));
        addresstxt.setForeground(new Color(26,35,126));
        add(addresstxt);
        
        gender = new JLabel("Gender:");
        gender.setBounds(380,410,150,30);
        gender.setFont(new Font("Calbri",Font.BOLD,25));
        gender.setForeground(new Color(26,35,126));
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(540,410,190,35);
        male.setFont(new Font("Calbri",Font.BOLD,25));
        male.setForeground(new Color(26,35,126));
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(540,450,190,35);
        female.setFont(new Font("Calbri",Font.BOLD,25));
        female.setForeground(new Color(26,35,126));
        add(female);
        
        bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        
        states = new JLabel("States:");
        states.setBounds(380,510,150,30);
        states.setFont(new Font("Calbri",Font.BOLD,25));
        states.setForeground(new Color(26,35,126));
        add(states);
        
        
        states1 = new JComboBox();
        states1.addItem("Select");
        states1.addItem("Maharashtra");
        states1.addItem("Punjab");
        states1.addItem("Kerala");
        states1.addItem("Himmachal Pradesh");
        states1.addItem("Assam");
        states1.addItem("Uttar Pradesh");
        states1.addItem("Gujrat");
        states1.addItem("Goa");
        states1.addItem("Karnataka");
        states1.addItem("Arunachal Pradesh");
        states1.addItem("Andhra Pradesh");
        states1.addItem("Chhattisgrah");
        states1.addItem("Hyderabad");
        states1.addItem("Bangalore");
        states1.setBounds(495,510,270,30);
        states1.setFont(new Font("Calbri",Font.BOLD,25));
        states1.setForeground(new Color(26,35,126));
        add(states1);
        
        submit = new JButton("Submit");
        submit.setBounds(320,610,200,35);
        submit.setFont(new Font("Arial",Font.BOLD,25));
        submit.setForeground(new Color(255,87,34));
        submit.setBackground(new Color(33,33,33));
        add(submit);
        
        reset = new JButton("Reset");
        reset.setBounds(550,610,200,35);
        reset.setFont(new Font("Arial",Font.BOLD,25));
        reset.setForeground(new Color(255,87,34));
        reset.setBackground(new Color(33,33,33));
        add(reset);
        
        link="<html>Already have an account?</html>";
        li = new JLabel(link);
        li.setBounds(300,680,350,30);
        li.setFont(new Font("Calbri",Font.BOLD,25));
        li.setForeground(new Color(33,33,33));
        add(li);
        
        click1="<html><u>Click Here!</u></html>";
        click = new JLabel(click1);
        click.setBounds(610,680,200,30);
        click.setFont(new Font("Cursive",Font.BOLD,25));
        click.setForeground(new Color(3,169,244));
        add(click);
        
        reset.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e)
            {
                nametxt.setText("");
                contactnotxt.setText("");
                usernametxt.setText("");
                addresstxt.setText("");
            }
        });
        
        submit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    Connection conn = DriverManager.getConnection(url,user,pwd);
                    PreparedStatement st = conn.prepareStatement(query);
                    
                    st.setString(1,nametxt.getText());
                    st.setString(2,contactnotxt.getText());
                    st.setString(3,addresstxt.getText());
                    if(male.isSelected())
                    {
                        st.setString(4, "M");
                    }
                    else
                    {
                        st.setString(4,"F");
                    }
                    st.setString(5,states1.getSelectedItem().toString());
                    st.setString(6,usernametxt.getText());
                   
                    st.executeUpdate();
                     JOptionPane.showMessageDialog(null,"Values Inserted");
                     new confirmation();
                }
                catch(SQLException l)
                {
                    System.out.println(l);
                }
            }
        });
       click.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) 
            {
                new login();
            }

            @Override
            public void mousePressed(MouseEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });        
        setSize(800,800);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    

    
    public static void main(String[] args) 
    {
        Datademo d = new Datademo();
        
    }
    
}
