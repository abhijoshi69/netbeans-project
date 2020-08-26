package jpegdemo;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
public class JPEGdemo extends JFrame 
{
    JButton AddJPEG,Searchfile;
    public JPEGdemo()
    {
        AddJPEG = new JButton("AddJPEG");
        AddJPEG.setBounds(30,80,240,30);
        AddJPEG.setFont(new Font("Mont",Font.BOLD,25));
        add(AddJPEG);
        
        Searchfile = new JButton("SearchFile");
        Searchfile.setBounds(300,80,240,30);
        Searchfile.setFont(new Font("Mont",Font.BOLD,25));
        add(Searchfile);
        
        setSize(600,600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
   
    public static void main(String[] args) 
    {
        JPEGdemo d = new JPEGdemo();
    }
    
}
