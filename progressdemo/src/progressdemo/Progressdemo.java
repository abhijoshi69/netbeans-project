package progressdemo;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.*;
public class Progressdemo extends JFrame implements Runnable 
{
    JLabel loading,percentage;
    JProgressBar progressbar;
    String l;
 
    public Progressdemo()
    {
        l="<html><u>LOADING...</u></html>";
        loading = new JLabel(l);
        loading.setBounds(80,120,200,30);
        loading.setFont(new Font("Arial",Font.BOLD,25));
        loading.setForeground(new Color(33,33,33));
        add(loading);
        
        percentage = new JLabel();
        percentage.setBounds(150,160,200,30);
        percentage.setFont(new Font("Sans Serif",Font.BOLD,25));
        percentage.setForeground(new Color(33,33,33));
        add(percentage);
        
        progressbar = new JProgressBar();
        progressbar.setBounds(40,200,390,30);
        progressbar.setForeground(new Color(1,87,155));
        add(progressbar);
        
        setSize(600,600);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void run()
    {
        try
        {
            for(int i=0;i<=100;i++)
            {
                percentage.setText(Integer.toString(i)+"%");
                progressbar.setValue(i);
                Thread.sleep(100);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        
    }
    
    
    public static void main(String[] args) 
    {
        Progressdemo p = new Progressdemo();
        Thread t = new Thread(p);
        t.start();
    }
    
}
