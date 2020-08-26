package bankdemo;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
public class credential extends JFrame 
{
  JLabel cardno,expirydate,cardname;
  private JTextField cardnotxt,expirytxt,cardnametxt;
  JButton submit,reset;
  String url="jdbc:sqlserver://localhost:1433;databaseName=Abhishek";
  String user="sa";
  String password="sasa";
  String query="Select * from Credential";
  public credential()
  {
      cardno =new JLabel("Cardno:");
      cardno.setBounds(120,80,150,30);
      cardno.setFont(new Font("Calbri",Font.BOLD,18));
      add(cardno);
      
      cardnotxt = new JTextField();
      cardnotxt.setBounds(240,80,150,35);
      cardnotxt.setFont(new Font("Calbri",Font.BOLD,18));
      add(cardnotxt); 
      
      expirydate = new JLabel("Expiry Date:");
      expirydate.setBounds(120,140,150,30);
      expirydate.setFont(new Font("Calbri",Font.BOLD,18));
      add(expirydate);
      
      expirytxt = new JTextField();
      expirytxt.setBounds(240,140,150,35);
      expirytxt.setFont(new Font("Calbri",Font.BOLD,18));
      add(expirytxt);
      
      cardname = new JLabel("CardName:");
      cardname.setBounds(120,200,150,30);
      cardname.setFont(new Font("Calbri",Font.BOLD,18));
      add(cardname);
      
      cardnametxt = new JTextField();
      cardnametxt.setBounds(240,200,150,35);
      cardnametxt.setFont(new Font("Calbri",Font.BOLD,18));
      add(cardnametxt);
      
      submit = new JButton("Submit");
      submit.setBounds(150,280,150,35);
      submit.setFont(new Font("Arial",Font.BOLD,20));
      add(submit);
      reset = new JButton("Reset");
      reset.setBounds(400,280,150,35);      

      reset.setFont(new Font("Arial",Font.BOLD,20));
      add(reset);
      
      reset.addActionListener(new ActionListener() {

          @Override
          public void actionPerformed(ActionEvent e) 
          {
              cardnotxt.setText("");
              cardnametxt.setText("");
              expirytxt.setText("");
          }
      });
      
      
      setSize(600,600);
      setLayout(null);
      setVisible(true);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
  }
  class Validate
      {
          void validate()
          {
              submit.addActionListener(new ActionListener() {

                  @Override
                  public void actionPerformed(ActionEvent e) 
                  {
                      try
                      {
                          Connection conn = DriverManager.getConnection(url,user,password);
                          JOptionPane.showMessageDialog(null, "Connection Success");
                          PreparedStatement st = conn.prepareStatement(query);
                          ResultSet rs = st.executeQuery();
                          boolean flag=false;
                          while(rs.next())
                          {
                              if(rs.getString("CardNO").equals(cardnotxt.getText()) && rs.getString("CardName").equals(cardnametxt.getText()) && rs.getString("ExpiryDate").equals(expirytxt.getText()))
                              {
                                  flag=true;
                                  
                              }
                         
                            
                          
                          }
                          if(flag==true)
                          {
                              JOptionPane.showMessageDialog(cardnotxt, "Values Checked");
                              new cvv();
                          }
                          
                          
                         
                      }
                      catch(SQLException n)
                      {
                          System.out.println(n);
                      }
                  }
              });
          }
      }
      public static void main(String[]args)
      {
          credential c = new credential();
          credential.Validate v = c.new Validate();
          v.validate();
      }
    
  
}
