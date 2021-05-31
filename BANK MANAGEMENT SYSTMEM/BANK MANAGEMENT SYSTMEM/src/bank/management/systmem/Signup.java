/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.management.systmem;

import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.FontMetrics;
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class Signup extends JFrame implements ActionListener
{
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JLabel l4;
    JLabel l5;
    JLabel l6;
    JLabel l7;
    JLabel l8;
    JLabel l9;
    JLabel l10;
    JLabel l11;
    JLabel l12;
    JLabel l13;
    JLabel l14;
    JLabel l15;
    JTextField t1;
    JTextField t2;
    JTextField t3;
    JTextField t4;
    JTextField t5;
    JTextField t6;
    JTextField t7;
    JRadioButton r1;
    JRadioButton r2;
    JRadioButton r3;
    JRadioButton r4;
    JRadioButton r5;
    JButton b;
    JComboBox c1;
    JComboBox c2;
    JComboBox c3;
   Random ran = new Random();
        long first4 = ran.nextLong() % 9000L + 1000L;
       long  first = Math.abs(first4);
    
    Signup() {
        
        this.setFont(new Font("System", 1, 22));
        final Font f = this.getFont();
        final FontMetrics fm = this.getFontMetrics(f);
        final int x = fm.stringWidth("NEW ACCOUNT APPLICATION FORM");
        final int y = fm.stringWidth(" ");
        final int z = this.getWidth() - x;
        final int w = z / y;
        String pad = "";
        pad = String.format("%" + w + "s", pad);
        this.setTitle(pad + "NEW ACCOUNT APPLICATION FORM");
        (this.l1 = new JLabel("APPLICATION FORM NO. " + this.first)).setFont(new Font("Raleway", 1, 38));
        (this.l2 = new JLabel("Page 1: Personal Details")).setFont(new Font("Raleway", 1, 22));
        (this.l3 = new JLabel("Name:")).setFont(new Font("Raleway", 1, 20));
        (this.l4 = new JLabel("Father's Name:")).setFont(new Font("Raleway", 1, 20));
        (this.l5 = new JLabel("Date of Birth:")).setFont(new Font("Raleway", 1, 20));
        (this.l6 = new JLabel("Gender:")).setFont(new Font("Raleway", 1, 20));
        (this.l7 = new JLabel("Email Address:")).setFont(new Font("Raleway", 1, 20));
        (this.l8 = new JLabel("Marital Status:")).setFont(new Font("Raleway", 1, 20));
        (this.l9 = new JLabel("Address:")).setFont(new Font("Raleway", 1, 20));
        (this.l10 = new JLabel("City:")).setFont(new Font("Raleway", 1, 20));
        (this.l11 = new JLabel("Pin Code:")).setFont(new Font("Raleway", 1, 20));
        (this.l12 = new JLabel("State:")).setFont(new Font("Raleway", 1, 20));
        (this.l13 = new JLabel("Date")).setFont(new Font("Raleway", 1, 14));
        (this.l14 = new JLabel("Month")).setFont(new Font("Raleway", 1, 14));
        (this.l15 = new JLabel("Year")).setFont(new Font("Raleway", 1, 14));
        (this.t1 = new JTextField()).setFont(new Font("Raleway", 1, 14));
        (this.t2 = new JTextField()).setFont(new Font("Raleway", 1, 14));
        (this.t3 = new JTextField()).setFont(new Font("Raleway", 1, 14));
        (this.t4 = new JTextField()).setFont(new Font("Raleway", 1, 14));
        (this.t5 = new JTextField()).setFont(new Font("Raleway", 1, 14));
        (this.t6 = new JTextField()).setFont(new Font("Raleway", 1, 14));
        (this.t7 = new JTextField()).setFont(new Font("Raleway", 1, 14));
        (this.b = new JButton("Next")).setFont(new Font("Raleway", 1, 14));
        this.b.setBackground(Color.BLACK);
        this.b.setForeground(Color.WHITE);
        (this.r1 = new JRadioButton("Male")).setFont(new Font("Raleway", 1, 14));
        this.r1.setBackground(Color.WHITE);
        (this.r2 = new JRadioButton("Female")).setFont(new Font("Raleway", 1, 14));
        this.r2.setBackground(Color.WHITE);
        (this.r3 = new JRadioButton("Married")).setFont(new Font("Raleway", 1, 14));
        this.r3.setBackground(Color.WHITE);
        (this.r4 = new JRadioButton("Unmarried")).setFont(new Font("Raleway", 1, 14));
        
        this.r4.setBackground(Color.WHITE);
        (this.r5 = new JRadioButton("Other")).setFont(new Font("Raleway", 1, 14));
        this.r5.setBackground(Color.WHITE);
        
        String date[]  = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };
        c1 = new JComboBox((date);
        c1.setBackground(Color.WHITE);
        
         String month[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
        c2 = new JComboBox((month);
                c2.setBackground(Color.WHITE);
                
         String year[] = { "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002" };
        c3 = new JComboBox((year);
        c3.setBackground(Color.WHITE);
        this.setLayout(null);
        this.l1.setBounds(140, 20, 600, 40);
        this.add(this.l1);
        this.l2.setBounds(290, 70, 600, 30);
        this.add(this.l2);
        this.l3.setBounds(100, 140, 100, 30);
        this.add(this.l3);
        this.t1.setBounds(300, 140, 400, 30);
        this.add(this.t1);
        this.l4.setBounds(100, 190, 200, 30);
        this.add(this.l4);
        this.t2.setBounds(300, 190, 400, 30);
        this.add(this.t2);
        this.l5.setBounds(100, 240, 200, 30);
        this.add(this.l5);
        this.l13.setBounds(300, 240, 40, 30);
        this.add(this.l13);
        this.c1.setBounds(340, 240, 60, 30);
        this.add(this.c1);
        this.l14.setBounds(410, 240, 50, 30);
        this.add(this.l14);
        this.c2.setBounds(460, 240, 100, 30);
        this.add(this.c2);
        this.l15.setBounds(570, 240, 40, 30);
        this.add(this.l15);
        this.c3.setBounds(610, 240, 90, 30);
        this.add(this.c3);
        this.l6.setBounds(100, 290, 200, 30);
        this.add(this.l6);
        this.r1.setBounds(300, 290, 60, 30);
        this.add(this.r1);
        this.r2.setBounds(450, 290, 90, 30);
        this.add(this.r2);
        this.l7.setBounds(100, 340, 200, 30);
        this.add(this.l7);
        this.t3.setBounds(300, 340, 400, 30);
        this.add(this.t3);
        this.l8.setBounds(100, 390, 200, 30);
        this.add(this.l8);
        this.r3.setBounds(300, 390, 100, 30);
        this.add(this.r3);
        this.r4.setBounds(450, 390, 100, 30);
        this.add(this.r4);
        this.r5.setBounds(635, 390, 100, 30);
        this.add(this.r5);
        this.l9.setBounds(100, 440, 200, 30);
        this.add(this.l9);
        this.t4.setBounds(300, 440, 400, 30);
        this.add(this.t4);
        this.l10.setBounds(100, 490, 200, 30);
        this.add(this.l10);
        this.t5.setBounds(300, 490, 400, 30);
        this.add(this.t5);
        this.l11.setBounds(100, 540, 200, 30);
        this.add(this.l11);
        this.t6.setBounds(300, 540, 400, 30);
        this.add(this.t6);
        this.l12.setBounds(100, 590, 200, 30);
        this.add(this.l12);
        this.t7.setBounds(300, 590, 400, 30);
        this.add(this.t7);
        this.b.setBounds(620, 660, 80, 30);
        this.add(this.b);
        this.b.addActionListener(this);
        this.getContentPane().setBackground(Color.WHITE);
        this.setSize(850, 850);
        this.setLocation(500, 90);
        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(final ActionEvent ae) {
        final String a = this.t1.getText();
        final String b = this.t2.getText();
        final String ac = (String)this.c1.getSelectedItem();
        final String bc = (String)this.c2.getSelectedItem();
        final String cc = (String)this.c3.getSelectedItem();
        String d = null;
        if (this.r1.isSelected()) {
            d = "Male";
        }
        else if (this.r2.isSelected()) {
            d = "Female";
        }
        final String e = this.t3.getText();
        String f = null;
        if (this.r3.isSelected()) {
            f = "Married";
        }
        else if (this.r4.isSelected()) {
            f = "Unmarried";
        }
        else if (this.r5.isSelected()) {
            f = "Other";
        }
        final String g = this.t4.getText();
        final String h = this.t5.getText();
        final String i = this.t6.getText();
        final String j = this.t7.getText();
        try {
            if (this.t6.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }
            else {
                final conn c1 = new conn();
                final String q1 = "insert into signup values('" + a + "','" + b + "','" + ac + "','" + bc + "','" + cc + "','" + d + "','" + e + "','" + f + "','" + g + "','" + h + "','" + i + "','" + j + "','" + this.first + "')";
                c1.s.executeUpdate(q1);
                new Signup2().setVisible(true);
                this.setVisible(false);
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static void main(final String[] args) {
        new Signup().setVisible(true);
    }
}
