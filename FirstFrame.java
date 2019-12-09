/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aywon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author pc
 */
public class FirstFrame extends JFrame implements ActionListener{
    
    private Container c;
    private JButton button1,button2;
    private JLabel label1,label2,label3;
    private Font f1,f2,f3;
    private JTextField t1;
    private JPasswordField t2;
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button1){
            
            Frame2 f2 = new Frame2();
            f2.setVisible(true);
            this.setVisible(false);
            f2.setPrevious(this);
            
            
        }   
        else if(e.getSource()==button2){
            
            Registration f2 = new Registration();
            f2.setVisible(true);
            this.setVisible(false);
            f2.setPrevious(this);
            
            
        }   
        }
    
    FirstFrame(){
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900,700);
        setLocationRelativeTo(null);
        setTitle("Welcome to DAM");
        setResizable(false);
        
        f1=new Font("Arial",Font.BOLD,40);
        
        f2=new Font("Cooper Black",Font.BOLD,60);
        f3=new Font("Arial",Font.BOLD,20);
        
         c=this.getContentPane();
         c.setLayout(null);
         c.setBackground(new Color(19,30,65));
        
           label1 = new JLabel("Welcome to DAM");
           //label1.setText("Welcome To");
           label1.setBounds(274,181,360,70);
           label1.setForeground(Color.WHITE);
           label1.setFont(f1);
           c.add(label1);
           
            label2 = new JLabel("Phone Number:");
           //label1.setText("Welcome To");
           label2.setBounds(92,304,360,70);
           label2.setForeground(Color.WHITE);
           label2.setFont(f1);
           c.add(label2);
           
            label3 = new JLabel("Password:");
           //label1.setText("Welcome To");
           label3.setBounds(92,415,360,70);
           label3.setForeground(Color.WHITE);
           label3.setFont(f1);
           c.add(label3);
         
           t1 = new JTextField("");
           //label1.setText("Welcome To");
           t1.setBounds(395,304,360,70);
           //t1.setForeground(Color.WHITE);
           t1.setFont(f1);
           c.add(t1);
           
           t2 = new JPasswordField("");
           //label1.setText("Welcome To");
           t2.setBounds(306,415,360,70);
           //t2.setForeground(Color.WHITE);
           t2.setFont(f1);
           c.add(t2);
           
           button1 = new JButton("Login");
           //label1.setText("Welcome To");
           button1.setBounds(281,585,160,50);
           //button1.setForeground(Color.WHITE);
           button1.setFont(f3);
           c.add(button1);
           
          button2 = new JButton("Registration");
           //label1.setText("Welcome To");
           button2.setBounds(481,585,160,50);
          // button2.setForeground(Color.WHITE);
           button2.setFont(f3);
           c.add(button2);
           
           
         button1.addActionListener(this); 
         button2.addActionListener(this);
         addMouseListener(new MouseSensor());
         addMouseMotionListener(new MouseSensor());
         // Appointment ap = new Appointment();
    //ap.setVisible(true);
         
        
        
    }
          
    
    
}
