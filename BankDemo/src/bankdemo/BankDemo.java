package bankdemo;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class BankDemo extends JFrame 
{
    JLabel head;
    String h;
    JRadioButton credential,debit;
    ButtonGroup bg;
    JButton submit;
    public BankDemo()
    {
        h ="<html><u>Please select anyone for making payment</u></html>";
        head = new JLabel(h);
        head.setBounds(50,40,600,30);
        head.setFont(new Font("Calbri",Font.BOLD,18));
        add(head);
        
        credential = new JRadioButton("Credential");
        credential.setBounds(150,80,200,30);
        add(credential);
        
        debit = new JRadioButton("Debit");
        debit.setBounds(350,80,200,30);
        add(debit);
        
        bg = new ButtonGroup();
        bg.add(credential);
        bg.add(debit);
        
        submit = new JButton("Submit");
        submit.setBounds(170,140,200,35);
        submit.setFont(new Font("Arial",Font.BOLD,18));
        add(submit);
        
        submit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(credential.isSelected())
                {
                   credential c=new credential();
                  // credential c = new credential();
                   credential.Validate v = c.new Validate();
                   v.validate();
                }
                else
                {
                    debit d = new debit();
                    debit.Validate v1 = d.new Validate();
                    v1.validate();
                }
                
            }
        });
        
        setSize(600,600);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }

    
    public static void main(String[] args)
    {
        BankDemo d = new BankDemo();
        
    }
    
}
