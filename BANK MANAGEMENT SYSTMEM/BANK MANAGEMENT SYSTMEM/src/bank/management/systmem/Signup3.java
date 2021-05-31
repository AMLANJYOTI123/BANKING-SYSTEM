/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bank.management.systmem;

import javax.swing.JOptionPane;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.FontMetrics;
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class Signup3 extends JFrame implements ActionListener
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
    JRadioButton r1;
    JRadioButton r2;
    JRadioButton r3;
    JRadioButton r4;
    JButton b1;
    JButton b2;
    JCheckBox c1;
    JCheckBox c2;
    JCheckBox c3;
    JCheckBox c4;
    JCheckBox c5;
    JCheckBox c6;
    JCheckBox c7;
    JTextField t1;
    
    Signup3() {
        this.setFont(new Font("System", 1, 22));
        final Font f = this.getFont();
        final FontMetrics fm = this.getFontMetrics(f);
        final int x = fm.stringWidth("NEW ACCOUNT APPLICATION FORM - PAGE 3");
        final int y = fm.stringWidth(" ");
        final int z = this.getWidth() / 2 - x / 2;
        final int w = z / y;
        String pad = "";
        pad = String.format("%" + w + "s", pad);
        this.setTitle(pad + "NEW ACCOUNT APPLICATION FORM - PAGE 3");
        (this.l1 = new JLabel("Page 3: Account Details")).setFont(new Font("Raleway", 1, 22));
        (this.l2 = new JLabel("Account Type:")).setFont(new Font("Raleway", 1, 18));
        (this.l3 = new JLabel("Card Number:")).setFont(new Font("Raleway", 1, 18));
        (this.l4 = new JLabel("XXXX-XXXX-XXXX-4184")).setFont(new Font("Raleway", 1, 18));
        (this.l5 = new JLabel("(Your 16-digit Card number)")).setFont(new Font("Raleway", 1, 12));
        (this.l6 = new JLabel("It would appear on ATM Card/Cheque Book and Statements")).setFont(new Font("Raleway", 1, 12));
        (this.l7 = new JLabel("PIN:")).setFont(new Font("Raleway", 1, 18));
        (this.l8 = new JLabel("XXXX")).setFont(new Font("Raleway", 1, 18));
        (this.l9 = new JLabel("(4-digit password)")).setFont(new Font("Raleway", 1, 12));
        (this.l10 = new JLabel("Services Required:")).setFont(new Font("Raleway", 1, 18));
        (this.l11 = new JLabel("Form No:")).setFont(new Font("Raleway", 1, 14));
        (this.b1 = new JButton("Submit")).setFont(new Font("Raleway", 1, 14));
        this.b1.setBackground(Color.BLACK);
        this.b1.setForeground(Color.WHITE);
        (this.b2 = new JButton("Cancel")).setFont(new Font("Raleway", 1, 14));
        this.b2.setBackground(Color.BLACK);
        this.b2.setForeground(Color.WHITE);
        (this.c1 = new JCheckBox("ATM CARD")).setBackground(Color.WHITE);
        this.c1.setFont(new Font("Raleway", 1, 16));
        (this.c2 = new JCheckBox("Internet Banking")).setBackground(Color.WHITE);
        this.c2.setFont(new Font("Raleway", 1, 16));
        (this.c3 = new JCheckBox("Mobile Banking")).setBackground(Color.WHITE);
        this.c3.setFont(new Font("Raleway", 1, 16));
        (this.c4 = new JCheckBox("EMAIL Alerts")).setBackground(Color.WHITE);
        this.c4.setFont(new Font("Raleway", 1, 16));
        (this.c5 = new JCheckBox("Cheque Book")).setBackground(Color.WHITE);
        this.c5.setFont(new Font("Raleway", 1, 16));
        (this.c6 = new JCheckBox("E-Statement")).setBackground(Color.WHITE);
        this.c6.setFont(new Font("Raleway", 1, 16));
        (this.c7 = new JCheckBox("I hereby declares that the above entered details correct to th best of my knowledge.", true)).setBackground(Color.WHITE);
        this.c7.setFont(new Font("Raleway", 1, 12));
        (this.r1 = new JRadioButton("Saving Account")).setFont(new Font("Raleway", 1, 16));
        this.r1.setBackground(Color.WHITE);
        (this.r2 = new JRadioButton("Fixed Deposit Account")).setFont(new Font("Raleway", 1, 16));
        this.r2.setBackground(Color.WHITE);
        (this.r3 = new JRadioButton("Current Account")).setFont(new Font("Raleway", 1, 16));
        this.r3.setBackground(Color.WHITE);
        (this.r4 = new JRadioButton("Recurring Deposit Account")).setFont(new Font("Raleway", 1, 16));
        this.r4.setBackground(Color.WHITE);
        (this.t1 = new JTextField()).setFont(new Font("Raleway", 1, 12));
        this.setLayout(null);
        this.l11.setBounds(700, 10, 70, 30);
        this.add(this.l11);
        this.t1.setBounds(770, 10, 40, 30);
        this.add(this.t1);
        this.l1.setBounds(280, 50, 400, 40);
        this.add(this.l1);
        this.l2.setBounds(100, 140, 200, 30);
        this.add(this.l2);
        this.r1.setBounds(100, 180, 150, 30);
        this.add(this.r1);
        this.r2.setBounds(350, 180, 300, 30);
        this.add(this.r2);
        this.r3.setBounds(100, 220, 250, 30);
        this.add(this.r3);
        this.r4.setBounds(350, 220, 250, 30);
        this.add(this.r4);
        this.l3.setBounds(100, 300, 200, 30);
        this.add(this.l3);
        this.l4.setBounds(330, 300, 250, 30);
        this.add(this.l4);
        this.l5.setBounds(100, 330, 200, 20);
        this.add(this.l5);
        this.l6.setBounds(330, 330, 500, 20);
        this.add(this.l6);
        this.l7.setBounds(100, 370, 200, 30);
        this.add(this.l7);
        this.l8.setBounds(330, 370, 200, 30);
        this.add(this.l8);
        this.l9.setBounds(100, 400, 200, 20);
        this.add(this.l9);
        this.l10.setBounds(100, 450, 200, 30);
        this.add(this.l10);
        this.c1.setBounds(100, 500, 200, 30);
        this.add(this.c1);
        this.c2.setBounds(350, 500, 200, 30);
        this.add(this.c2);
        this.c3.setBounds(100, 550, 200, 30);
        this.add(this.c3);
        this.c4.setBounds(350, 550, 200, 30);
        this.add(this.c4);
        this.c5.setBounds(100, 600, 200, 30);
        this.add(this.c5);
        this.c6.setBounds(350, 600, 200, 30);
        this.add(this.c6);
        this.c7.setBounds(100, 680, 600, 20);
        this.add(this.c7);
        this.b1.setBounds(300, 720, 100, 30);
        this.add(this.b1);
        this.b2.setBounds(420, 720, 100, 30);
        this.add(this.b2);
        this.getContentPane().setBackground(Color.WHITE);
        this.setSize(850, 850);
        this.setLocation(500, 90);
        this.setVisible(true);
        this.b1.addActionListener(this);
        this.b2.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(final ActionEvent ae) {
        String a = null;
        if (this.r1.isSelected()) {
            a = "Saving Account";
        }
        else if (this.r2.isSelected()) {
            a = "Fixed Deposit Account";
        }
        else if (this.r3.isSelected()) {
            a = "Current Account";
        }
        else if (this.r4.isSelected()) {
            a = "Recurring Deposit Account";
        }
        final Random ran = new Random();
        final long first7 = ran.nextLong() % 90000000L + 5040936000000000L;
        final long first8 = Math.abs(first7);
        final long first9 = ran.nextLong() % 9000L + 1000L;
        final long first10 = Math.abs(first9);
        String b = "";
        if (this.c1.isSelected()) {
            b += " ATM Card";
        }
        if (this.c2.isSelected()) {
            b += " Internet Banking";
        }
        if (this.c3.isSelected()) {
            b += " Mobile Banking";
        }
        if (this.c4.isSelected()) {
            b += " EMAIL Alerts";
        }
        if (this.c5.isSelected()) {
            b += " Cheque Book";
        }
        if (this.c6.isSelected()) {
            b += " E-Statement";
        }
        final String c = this.t1.getText();
        try {
            if (ae.getSource() == this.b1) {
                if (b.equals("")) {
                    JOptionPane.showMessageDialog(null, "Fill all the required fields");
                }
                else {
                    final conn c2 = new conn();
                    final String q1 = "insert into signup3 values('" + a + "','" + first8 + "','" + first10 + "','" + b + "','" + c + "')";
                    final String q2 = "insert into login values('" + first8 + "','" + first10 + "')";
                    c2.s.executeUpdate(q1);
                    c2.s.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number: " + first8 + "\n Pin:" + first10);
                    new Deposit().setVisible(true);
                    this.setVisible(false);
                }
            }
            else if (ae.getSource() == this.b2) {
                System.exit(0);
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static void main(final String[] args) {
        new Signup3().setVisible(true);
    }
}

