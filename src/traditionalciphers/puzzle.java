/*
 
 */

package traditionalciphers;

import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import javax.sound.sampled.*;
import java.sql.*;
import javax.swing.table.*;
import java.util.*;


/**
 *
 * @author piyush
 *
 *
 *
 *
 */



 class puzzle implements ActionListener{
  JFrame f;
  JButton b1,b2,b3,b4,b5,b6,b7,b8;
  JLabel l1;
  JTextField t1;
  JPasswordField p;
  private Container cp;
  char ch[]=new char[100];
  int i=0;

    public puzzle(){

       f=new JFrame("Puzzle");
       f.setLayout(null);
       f.setBounds(10,10,1200,700);
       f.setResizable(false);

       b1=new JButton(new ImageIcon("IMG0476A.jpg"));
       b1.setBounds(25,25,200,200);
       b1.addActionListener(this);

       b2=new JButton(new ImageIcon("IMG0483A.jpg"));
       b2.setBounds(225,25,200,200);
       b2.addActionListener(this);

       b3=new JButton(new ImageIcon("IMG0477A.jpg"));
       b3.setBounds(425,25,200,200);
       b3.addActionListener(this);

       b4=new JButton(new ImageIcon("IMG0479A.jpg"));
       b4.setBounds(25,225,200,200);
       b4.addActionListener(this);

       b5=new JButton(new ImageIcon("IMG0480A.jpg"));
       b5.setBounds(225,225,200,200);
       b5.addActionListener(this);

       b6=new JButton(new ImageIcon("IMG0481A.jpg"));
       b6.setBounds(425,225,200,200);
       b6.addActionListener(this);

       b7=new JButton(new ImageIcon("IMG0484A.jpg"));
       b7.setBounds(25,425,400,200);
       b7.addActionListener(this);

       b8=new JButton("Decrypt");
       b8.setBounds(800,300,100,25);
       b8.addActionListener(this);
        //t1=new JTextField(eid);
        //t1=new JTextField(eid);
         l1=new JLabel("After Decryption...");
         l1.setFont(new Font("Mistral",Font.BOLD,25));
         l1.setBounds(450,100,200,25);

         t1=new JTextField();
         t1.setBounds(800,110,200,25);
          //t1.setText("decrypt");

       f.add(b1);
       f.add(b2);
       f.add(b3);
       f.add(b4);
       f.add(b5);
       f.add(b6);
       f.add(b7);
       f.add(b8);
       f.add(l1);
      // f.add(t1);




      cp = f.getContentPane();
     //cp.setBackground(Color.blue);
       f.show();

    }

     public void actionPerformed(ActionEvent c){

      
     if(c.getSource()==b1){
        
     	ch[i]='a';
        i++;
        //System.out.println("pass1");
     }
     if(c.getSource()==b2){
     	ch[i]='b';
        i++;
       
     }
     if(c.getSource()==b3){
     	ch[i]='c';
        i++;
     }
     if(c.getSource()==b4){
     	ch[i]='d';
        i++;
     }
     if(c.getSource()==b5){
     	ch[i]='e';
        i++;
     }
     if(c.getSource()==b6){
     	ch[i]='f';
        i++;
     }

  if(c.getSource()==b8){
      String d1=new String(ch);

System.out.println("After Decryption");
    
System.out.println(ch);
  }
     }




public static void main(String decrypt[]){

//new puzzle();
new puzzle();
}

  }

