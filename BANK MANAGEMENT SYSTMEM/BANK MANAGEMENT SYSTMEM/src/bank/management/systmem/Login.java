/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.management.systmem;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.FontMetrics;
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class Login extends JFrame implements ActionListener
{
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JTextField tf1;
    JPasswordField pf2;
    JButton b1;
    JButton b2;
    JButton b3;
    
    Login() {
        this.setFont(new Font("System", 1, 22));
        final Font f = this.getFont();
        final FontMetrics fm = this.getFontMetrics(f);
        final int x = fm.stringWidth("AUTOMATED TELLER MACHINE");
        final int y = fm.stringWidth(" ");
        final int z = this.getWidth() - x;
        final int w = z / y;
        String pad = "";
        pad = String.format("%" + w + "s", pad);
        this.setTitle(pad + "AUTOMATED TELLER MACHINE");
        (this.l1 = new JLabel("WELCOME TO ATM")).setFont(new Font("Osward", 1, 38));
        (this.l2 = new JLabel("Card No:")).setFont(new Font("Raleway", 1, 28));
        (this.l3 = new JLabel("PIN:")).setFont(new Font("Raleway", 1, 28));
        this.tf1 = new JTextField(15);
        this.pf2 = new JPasswordField(15);
        (this.b1 = new JButton("SIGN IN")).setBackground(Color.BLACK);
        this.b1.setForeground(Color.WHITE);
        (this.b2 = new JButton("CLEAR")).setBackground(Color.BLACK);
        this.b2.setForeground(Color.WHITE);
        (this.b3 = new JButton("SIGN UP")).setBackground(Color.BLACK);
        this.b3.setForeground(Color.WHITE);
        this.setLayout(null);
        this.l1.setBounds(175, 50, 450, 200);
        this.add(this.l1);
        this.l2.setBounds(125, 150, 375, 200);
        this.add(this.l2);
        this.tf1.setBounds(300, 235, 230, 30);
        this.add(this.tf1);
        this.l3.setBounds(125, 225, 375, 200);
        this.add(this.l3);
        this.tf1.setFont(new Font("Arial", 1, 14));
        this.pf2.setFont(new Font("Arial", 1, 14));
        this.pf2.setBounds(300, 310, 230, 30);
        this.add(this.pf2);
        this.b1.setFont(new Font("Arial", 1, 14));
        this.b1.setBounds(300, 400, 100, 30);
        this.add(this.b1);
        this.b2.setFont(new Font("Arial", 1, 14));
        this.b2.setBounds(430, 400, 100, 30);
        this.add(this.b2);
        this.b3.setFont(new Font("Arial", 1, 14));
        this.b3.setBounds(300, 450, 230, 30);
        this.add(this.b3);
        this.b1.addActionListener(this);
        this.b2.addActionListener(this);
        this.b3.addActionListener(this);
        this.getContentPane().setBackground(Color.WHITE);
        this.setSize(750, 750);
        this.setLocation(500, 200);
        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(final ActionEvent ae) {
        try {
            final conn c1 = new conn();
            final String a = this.tf1.getText();
            final String b = this.pf2.getText();
            final String q = "select * from login where cardno = '" + a + "' and pin = '" + b + "'";
            final ResultSet rs = c1.s.executeQuery(q);
            if (ae.getSource() == this.b1) {
                if (rs.next()) {
                    new Transcations().setVisible(true);
                    this.setVisible(false);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or Password");
                }
            }
            else if (ae.getSource() == this.b2) {
                this.tf1.setText("");
                this.pf2.setText("");
            }
            else if (ae.getSource() == this.b3) {
                new Signup().setVisible(true);
                this.setVisible(false);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("error: " + e);
        }
    }
    
    public static void main(final String[] args) {
        new Login().setVisible(true);
    }
}
