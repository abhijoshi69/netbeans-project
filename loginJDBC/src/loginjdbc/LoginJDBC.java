package loginjdbc;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.*;
public class LoginJDBC extends JFrame 
{
       JLabel registration,username,password,name,state,gender,contactno,emailid,acct;
       JTextField usertxt,nametxt,contacttxt,emailtxt;
       JPasswordField pwdtxt;
       JRadioButton male,female;
       ButtonGroup bg;
       JComboBox states;
       JButton submit,reset;
       String reg,signup;
       String url="jdbc:sqlserver://localhost:1433;databaseName=Abhishek";
       String uname="sa";
       String pwd="sasa";
       String query="insert into Registration values (?,?,?,?,?,?,?)";
       
       public LoginJDBC()
       {
          // setContentPane(new JLabel(new ImageIcon("C:\\Users\\rahul\\Desktop\\rwd practical\\images\\2.jpg")));
           reg="<html><u>Registration Page</u></html>";
           registration = new JLabel(reg);
           registration.setBounds(170,20,500,30);
           registration.setFont(new Font("Calbri",Font.BOLD,24));
         
           add(registration);
           
           username = new JLabel("Username:");
           username.setBounds(120,80,150,30);
           username.setFont(new Font("Calbri",Font.BOLD,18));
           username.setForeground(new Color(140,20,252));
           add(username);
           
           usertxt = new JTextField();
           usertxt.setBounds(240,80,150,35);
           usertxt.setFont(new Font("Arial",Font.BOLD,16));
           add(usertxt);
           
           password = new JLabel("Password:");
           password.setBounds(120,140,150,30);
           password.setFont(new Font("Calbri",Font.BOLD,18));
           add(password);
           
           pwdtxt = new JPasswordField();
           pwdtxt.setBounds(240,140,150,35);
           pwdtxt.setFont(new Font("Arial",Font.BOLD,16));
           add(pwdtxt);
           
           name = new JLabel("Name:");
           name.setBounds(120,200,150,35);
           name.setFont(new Font("Calbri",Font.BOLD,18));
           add(name);
           
           nametxt = new JTextField();
           nametxt.setBounds(240,200,150,30);
           nametxt.setFont(new Font("Arial",Font.BOLD,16));
           add(nametxt);
           
           state = new JLabel("State:");
           state.setBounds(120,260,150,30);
           state.setFont(new Font("Calbri",Font.BOLD,18));
           add(state);
           
           states = new JComboBox();
           states.addItem("Select");
           states.addItem("Maharashtra");
           states.addItem("Gujrat");
           states.addItem("Punjab");
           states.addItem("Himmachal Pradesh");
           states.addItem("Assam");
           states.addItem("Karnataka");
           states.addItem("Kerala");
           states.setBounds(240,260,150,35);
           states.setFont(new Font("Arial",Font.BOLD,16));
           add(states);
           
           gender = new JLabel("Gender");
           gender.setBounds(120,320,150,30);
           gender.setFont(new Font("Calbri",Font.BOLD,18));
           add(gender);
           
           male = new JRadioButton("Male");
           male.setBounds(240,320,150,35);
           add(male);
           
           female = new JRadioButton("Female");
           female.setBounds(390,320,150,35);
           add(female);
           
           bg = new ButtonGroup();
           bg.add(male);
           bg.add(female);
           
           contactno = new JLabel("Contact No.:");
           contactno.setBounds(120,360,150,30);
           contactno.setFont(new Font("Calbri",Font.BOLD,18));
           add(contactno);
           
           contacttxt = new JTextField();
           contacttxt.setBounds(250,360,150,35);
           contacttxt.setFont(new Font("Arial",Font.BOLD,16));
           add(contacttxt);
           
           emailid = new JLabel("Email ID:");
           emailid.setBounds(120,420,150,30);
           emailid.setFont(new Font("Calbri",Font.BOLD,18));
           add(emailid);
           
           emailtxt = new JTextField();
           emailtxt.setBounds(240,420,150,35);
           emailtxt.setFont(new Font("Arial",Font.BOLD,16));
           add(emailtxt);
        
           
           signup = "<html><p><u><a>Already have an account?</a></u></p></html>";
           acct = new JLabel(signup);
           acct.setBounds(150,480,500,30);
           acct.setFont(new Font("Arial",Font.BOLD,18));
           add(acct);
           
           submit = new JButton("Submit");
           submit.setBounds(150,540,160,40);
           submit.setFont(new Font(Font.SANS_SERIF,Font.BOLD,18));
           add(submit);
           
           reset = new JButton("Reset");
           reset.setBounds(400,540,160,40);
           reset.setFont(new Font(Font.SANS_SERIF,Font.BOLD,18));
           add(reset);
           
           Toolkit tk=Toolkit.getDefaultToolkit();
           int xsize=(int)tk.getScreenSize().getWidth();
           int ysize=(int)tk.getScreenSize().getHeight();
           System.out.println(xsize);
           System.out.println(ysize);
           acct.addMouseListener(new MouseListener() 
           {
               
                

               @Override
               public void mouseClicked(MouseEvent e) {
                 //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                   new Login();
               }

               @Override
               public void mousePressed(MouseEvent e) {
                   //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               }

               @Override
               public void mouseReleased(MouseEvent e) {
                   //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               }

               @Override
               public void mouseEntered(MouseEvent e) {
                   //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               }

               @Override
               public void mouseExited(MouseEvent e) {
                   //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               }
           });
           submit.addActionListener(new ActionListener() 
           {

               @Override
               public void actionPerformed(ActionEvent e) 
               {
                   try
                   {
                       Connection conn= DriverManager.getConnection(url,uname,pwd);
                       System.out.println("Connection Successfull");
                       PreparedStatement st = conn.prepareStatement(query);
                       st.setString(1,usertxt.getText());
                       st.setString(2,pwdtxt.getText());
                       st.setString(3,nametxt.getText());
                       st.setString(4,states.getSelectedItem().toString());
                       if(male.isSelected())
                       {
                           st.setString(5,"M");
                       }
                       else
                       {
                           st.setString(5,"F");
                       }
                       st.setString(6,contacttxt.getText());
                       st.setString(7,emailtxt.getText());
                       JOptionPane.showMessageDialog(null,"Values Inserted");
                       st.executeUpdate();
                       
                     }
                   catch(SQLException n)
                   {
                       System.out.println(n);
                   }
                   new Login();
               }
           });
           reset.addActionListener(new ActionListener() 
           {

               @Override
               public void actionPerformed(ActionEvent e) 
               {
                   usertxt.setText("");
                   pwdtxt.setText("");
                   nametxt.setText("");
                   contacttxt.setText("");
                   emailtxt.setText("");
               }
           });
           
           setTitle("Registration");
           setSize(xsize,ysize);
           setLayout(null);
           setVisible(true);
           setLocationRelativeTo(null);
           setDefaultCloseOperation(EXIT_ON_CLOSE);
       }

    
    public static void main(String[] args) 
    {
        LoginJDBC l = new LoginJDBC();
        
    }
    
}
