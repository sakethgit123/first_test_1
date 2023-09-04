import java.awt.*;
import javax.swing.*;
import java.awt.Color;
class mail{
mail(){
JFrame f = new JFrame(" EMAIL REGISTRATION FORM");

JLabel l = new JLabel("Full Name :");
l.setBounds(20,40,100,25);
JTextField t = new JTextField();
t.setBounds(190,40,100,25);

JLabel l1 = new JLabel("Date of birth :");
l1.setBounds(20,80,100,25);
JTextField t1 = new JTextField();
t1.setBounds(190,80,100,25);


JLabel l2 = new JLabel("Gender:");
l2.setBounds(20,120,100,25);
JTextField t2 = new JTextField();
t2.setBounds(190,120,130,25);

JLabel l3 = new JLabel("Mail id name :");
l3.setBounds(20,160,100,25);
JTextField t3 = new JTextField();
t3.setBounds(190,160,170,25);

JLabel l4 = new JLabel("Password :");
l4.setBounds(20,200,100,25);
JTextField t4 = new JTextField();
t4.setBounds(190,200,100,25);

JLabel l5 = new JLabel("Confirm Password :");
l5.setBounds(20,240,130,25);
JTextField t5 = new JTextField();
t5.setBounds(190,240,150,25);

JLabel l6 = new JLabel("Country :");
l6.setBounds(20,280,100,25);
JTextField t6 = new JTextField();
t6.setBounds(190,280,170,25);

JLabel l7 = new JLabel("State :");
l7.setBounds(20,320,100,25);
JTextField t7 = new JTextField();
t7.setBounds(190,320,100,25);

JLabel l8 = new JLabel("Pincode :");
l8.setBounds(20,360,100,25);
JTextField t8 = new JTextField();
t8.setBounds(190,360,100,25);

JLabel l9 = new JLabel("Mobile no :");
l9.setBounds(20,400,100,25);
JTextField t9 = new JTextField();
t9.setBounds(190,400,100,25);

JButton b = new JButton("SUBMIT");
b.setBounds(40,470,100,30);

f.add(l);
f.add(t);
f.add(l1);
f.add(t1);
f.add(l2);
f.add(t2);
f.add(l3);
f.add(t3);
f.add(l4);
f.add(t4);
f.add(l5);
f.add(t5);
f.add(l6);
f.add(t6);
f.add(l7);
f.add(t7);
f.add(l8);
f.add(t8);
f.add(l9);
f.add(t9);
f.add(b);

f.setSize(2000,2000);
f.setLayout(null);
f.setVisible(true);
f.getContentPane().setBackground(Color.yellow);
      }
}

public class main2{
	public static void main(String[]args){
		new mail();
     }
}