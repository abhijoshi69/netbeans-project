package projectdemo;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class registration extends JFrame 
{
    JLabel name,address,contactno,gender,state,link,click,reg,dob,dob2,city;
    JTextField nametxt,contactnotxt,citytxt;
    JTextArea addresstxt;
    JComboBox states,date,month,year;
    JRadioButton male,female;
    ButtonGroup bg;
    String reg1,link1,click1,dob1;
    JButton Submit,Reset;
    JDateChooser jdob;
    
    public registration()
    {
        setContentPane(new JLabel(new ImageIcon(getClass().getResource("Image\\images1.jpg"))));
        
        
        reg1 = "<html><u>Registration Page</u></html>";
        reg = new JLabel(reg1);
        reg.setBounds(300,50,500,60);
        reg.setFont(new Font("Nexa Rust",Font.BOLD,45));
        reg.setForeground(new Color(96,125,139));
        add(reg);
        
        name = new JLabel("Name:");
        name.setBounds(200,130,200,35);
        name.setFont(new Font("Comic Sans MS",Font.BOLD,30));
        name.setForeground(new Color(255,109,0));
        add(name);
        
        nametxt = new JTextField();
        nametxt.setBounds(380,130,330,35);
        nametxt.setFont(new Font("Times New Roman",Font.BOLD,30));
        nametxt.setForeground(new Color(26,35,126));
        add(nametxt);
        
        address = new JLabel("Address:");
        address.setBounds(200,190,200,35);
        address.setFont(new Font("Comic Sans MS",Font.BOLD,30));
        address.setForeground(new Color(255,109,0));
        add(address);
        
        addresstxt = new JTextArea();
        addresstxt.setBounds(380,190,480,100);
        addresstxt.setFont(new Font("Times New Roman",Font.BOLD,30));
        addresstxt.setForeground(new Color(26,35,126));
        add(addresstxt);
        
        contactno = new JLabel("Contact no:");
        contactno.setBounds(200,310,200,35);
        contactno.setFont(new Font("Comic Sans MS",Font.BOLD,30));
        contactno.setForeground(new Color(255,109,0));
        add(contactno);
        
        contactnotxt = new JTextField();
        contactnotxt.setBounds(380,310,300,35);
        contactnotxt.setFont(new Font("Times New Roman",Font.BOLD,30));
        contactnotxt.setForeground(new Color(26,35,126));
        add(contactnotxt);
        
        gender = new JLabel("Gender:");
        gender.setBounds(200,370,200,35);
        gender.setFont(new Font("Comic Sans MS",Font.BOLD,30));
        gender.setForeground(new Color(255,109,0));
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(380,370,200,35);
        male.setFont(new Font("Times New Roman",Font.BOLD,30));
        male.setForeground(new Color(26,35,126));
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(750,370,200,35);
        female.setFont(new Font("Times New Roman",Font.BOLD,30));
        female.setForeground(new Color(26,35,126));
        add(female);
        
        bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        
        state = new JLabel("States:");
        state.setBounds(200,430,200,35);
        state.setFont(new Font("Comic Sans MS",Font.BOLD,30));
        state.setForeground(new Color(255,109,0));
        add(state);
        
        states = new JComboBox();
        states.addItem("Select");
        states.addItem("Maharashtra");
        states.addItem("Gujrat");
        states.addItem("Kerala");
        states.addItem("Punjab");
        states.addItem("Chhattisgrah");
        states.addItem("Karnataka");
        states.addItem("Chennai");
        states.addItem("Himmachal Pradesh");
        states.addItem("Bihar");
        states.addItem("Andra Pradesh");
        states.addItem("Arunachal Pradesh");
        states.addItem("Assam");
        states.addItem("Goa");
        states.addItem("Hyderabad");
        states.addItem("Bangalore");
        states.addItem("Jammu and Kashmir");
        states.setBounds(380,430,350,35);
        states.setFont(new Font("Times New Roman",Font.BOLD,35));
        states.setForeground(new Color(26,35,126));
        add(states);
        
        dob = new JLabel("Date of Birth:");
        dob.setBounds(150,490,350,35);
        dob.setFont(new Font("Comic Sans MS",Font.BOLD,30));
        dob.setForeground(new Color(255,109,0));
        add(dob);
        
        jdob = new JDateChooser();
        jdob.setBounds(380,490,300,35);
        jdob.setFont(new Font("Times New Roman",Font.BOLD,20));
        jdob.setForeground(new Color(26,35,126));
        add(jdob);
        
        dob1 = "<html>Please write dob in yyyy-mm-dd format</html>";
        dob2 = new JLabel(dob1);
        dob2.setBounds(380,520,400,35);
        dob2.setFont(new Font("Arial",Font.BOLD,20));
        dob2.setForeground(new Color(33,33,33));
        add(dob2);
        
        city = new JLabel("City:");
        city.setBounds(200,580,200,35);
        city.setFont(new Font("Comic Sans MS",Font.BOLD,30));
        city.setForeground(new Color(255,109,0));
        add(city);
        
        citytxt = new JTextField();
        citytxt.setBounds(380,580,270,35);
        citytxt.setFont(new Font("Times New Roman",Font.BOLD,30));
        citytxt.setForeground(new Color(26,35,126));
        add(citytxt);
        
        Submit = new JButton("SUBMIT");
        Submit.setBounds(270,660,200,40);
        Submit.setFont(new Font("",Font.BOLD,30));
        Submit.setForeground(new Color(255,255,0));
        Submit.setBackground(new Color(38,50,56));
        add(Submit);
        
        Reset = new JButton("RESET");
        Reset.setBounds(500,660,200,40);
        Reset.setFont(new Font("",Font.BOLD,30));
        Reset.setForeground(new Color(255,255,0));
        Reset.setBackground(new Color(38,50,56));
        add(Reset);
        
        Submit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new confirmation();
            }
        });
        
        Reset.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                nametxt.setText("");
                addresstxt.setText("");
                contactnotxt.setText("");
                jdob.setCalendar(null);
                citytxt.setText("");
            }
        });
        
        setSize(1200,800);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
