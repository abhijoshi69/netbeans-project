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
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class debit extends JFrame
{
    JLabel cardno1,expirydate1,cardname1;
    private JTextField cardnotxt1,expirytxt1,cardnametxt1;
    JButton submit1;
    String query="Select * from Debit";
    String url="jdbc:sqlserver://localhost:1433;databaseName=Abhishek";
    String user="sa";
    String password="sasa";
    public debit()
    {
    cardno1 =new JLabel("Cardno:");
      cardno1.setBounds(120,80,150,30);
      cardno1.setFont(new Font("Calbri",Font.BOLD,18));
      add(cardno1);
      
      cardnotxt1 = new JTextField();
      cardnotxt1.setBounds(240,80,150,35);
      cardnotxt1.setFont(new Font("Calbri",Font.BOLD,18));
      add(cardnotxt1); 
      
      expirydate1 = new JLabel("Expiry Date:");
      expirydate1.setBounds(120,140,150,30);
      expirydate1.setFont(new Font("Calbri",Font.BOLD,18));
      add(expirydate1);
      
      expirytxt1 = new JTextField();
      expirytxt1.setBounds(240,140,150,35);
      expirytxt1.setFont(new Font("Calbri",Font.BOLD,18));
      add(expirytxt1);
      
      cardname1 = new JLabel("CardName:");
      cardname1.setBounds(120,200,150,30);
      cardname1.setFont(new Font("Calbri",Font.BOLD,18));
      add(cardname1);
      
      cardnametxt1 = new JTextField();
      cardnametxt1.setBounds(240,200,150,35);
      cardnametxt1.setFont(new Font("Calbri",Font.BOLD,18));
      add(cardnametxt1);
      
      submit1 = new JButton("Submit");
      submit1.setBounds(150,280,150,35);
      submit1.setFont(new Font("Arial",Font.BOLD,20));
      add(submit1);
      
     
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
              submit1.addActionListener(new ActionListener() {

                  @Override
                  public void actionPerformed(ActionEvent e) 
                  {
                     try
                      {
                          Connection conn = DriverManager.getConnection(url,user,password);
                          PreparedStatement st = conn.prepareStatement(query);
                          ResultSet rs = st.executeQuery();
                          boolean flag=false;
                          while(rs.next())
                          {
                              if(rs.getString("CardNO").equals(cardnotxt1.getText()) && rs.getString("CardName").equals(cardnametxt1.getText()) && rs.getString("ExpiryDate").equals(expirytxt1.getText()))
                              {
                                  flag=true;
                              }
                          }
                          if(flag==true)
                          {
                              
                              JOptionPane.showMessageDialog(cardnotxt1, "Values Checked");
                              new cvv1();
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
        debit d = new debit();
        debit.Validate v1 = d.new Validate();
        v1.validate();
        
    }
}
