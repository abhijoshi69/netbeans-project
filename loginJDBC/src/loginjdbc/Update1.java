/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginjdbc;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author rahul
 */
public class Update1 extends JFrame{
 
     JLabel registration,username,password,name,state,gender,contactno,emailid,acct;
    JTextField usertxt,nametxt,contacttxt,emailtxt;
    JPasswordField pwdtxt;
    JRadioButton male,female;
    ButtonGroup bg;
    JComboBox states;
    JButton submit,reset;
   
    public Update1()
    {
                   
            
                    String reg="<html><u>Update Page</u></html>";
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
        
           
                    
                    submit = new JButton("Submit");
                    submit.setBounds(150,540,160,40);
                    submit.setFont(new Font(Font.SANS_SERIF,Font.BOLD,18));
                    add(submit);
           
                    reset = new JButton("Reset");
                    reset.setBounds(400,540,160,40);
                    reset.setFont(new Font(Font.SANS_SERIF,Font.BOLD,18));
                    add(reset);
          
            }
        }
    

