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
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class Signup2 extends JFrame implements ActionListener
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
    JButton b;
    JRadioButton r1;
    JRadioButton r2;
    JRadioButton r3;
    JRadioButton r4;
    JTextField t1;
    JTextField t2;
    JTextField t3;
    JComboBox c1;
    JComboBox c2;
    JComboBox c3;
    JComboBox c4;
    JComboBox c5;
    
    Signup2() {
        this.setFont(new Font("System", 1, 22));
        final Font f = this.getFont();
        final FontMetrics fm = this.getFontMetrics(f);
        final int x = fm.stringWidth("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        final int y = fm.stringWidth(" ");
        final int z = this.getWidth() / 2 - x / 2;
        final int w = z / y;
        String pad = "";
        pad = String.format("%" + w + "s", pad);
        this.setTitle(pad + "NEW ACCOUNT APPLICATION FORM - PAGE 2");
        (this.l1 = new JLabel("Page 2: Additonal Details")).setFont(new Font("Raleway", 1, 22));
        (this.l2 = new JLabel("Religion:")).setFont(new Font("Raleway", 1, 18));
        (this.l3 = new JLabel("Category:")).setFont(new Font("Raleway", 1, 18));
        (this.l4 = new JLabel("Income:")).setFont(new Font("Raleway", 1, 18));
        (this.l5 = new JLabel("Educational")).setFont(new Font("Raleway", 1, 18));
        (this.l11 = new JLabel("Qualification:")).setFont(new Font("Raleway", 1, 18));
        (this.l6 = new JLabel("Occupation:")).setFont(new Font("Raleway", 1, 18));
        (this.l7 = new JLabel("PAN Number:")).setFont(new Font("Raleway", 1, 18));
        (this.l8 = new JLabel("Aadhar Number:")).setFont(new Font("Raleway", 1, 18));
        (this.l9 = new JLabel("Senior Citizen:")).setFont(new Font("Raleway", 1, 18));
        (this.l10 = new JLabel("Existing Account:")).setFont(new Font("Raleway", 1, 18));
        (this.l12 = new JLabel("Form No:")).setFont(new Font("Raleway", 1, 13));
        (this.b = new JButton("Next")).setFont(new Font("Raleway", 1, 14));
        this.b.setBackground(Color.BLACK);
        this.b.setForeground(Color.WHITE);
        (this.t1 = new JTextField()).setFont(new Font("Raleway", 1, 14));
        (this.t2 = new JTextField()).setFont(new Font("Raleway", 1, 14));
        (this.t3 = new JTextField()).setFont(new Font("Raleway", 1, 13));
        (this.r1 = new JRadioButton("Yes")).setFont(new Font("Raleway", 1, 14));
        this.r1.setBackground(Color.WHITE);
        (this.r2 = new JRadioButton("No")).setFont(new Font("Raleway", 1, 14));
        this.r2.setBackground(Color.WHITE);
        (this.r3 = new JRadioButton("Yes")).setFont(new Font("Raleway", 1, 14));
        this.r3.setBackground(Color.WHITE);
        (this.r4 = new JRadioButton("No")).setFont(new Font("Raleway", 1, 14));
        this.r4.setBackground(Color.WHITE);
        final String[] religion = { "Hindu", "Muslim", "Sikh", "Christian", "Other" };
        (this.c1 = new JComboBox((E[])religion)).setBackground(Color.WHITE);
        this.c1.setFont(new Font("Raleway", 1, 14));
        final String[] category = { "General", "OBC", "SC", "ST", "Other" };
        (this.c2 = new JComboBox((E[])category)).setBackground(Color.WHITE);
        this.c2.setFont(new Font("Raleway", 1, 14));
        final String[] income = { "Null", "<1,50,000", "<2,50,000", "<5,00,000", "Upto 10,00,000", "Above 10,00,000" };
        (this.c3 = new JComboBox((E[])income)).setBackground(Color.WHITE);
        this.c3.setFont(new Font("Raleway", 1, 14));
        final String[] education = { "Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Others" };
        (this.c4 = new JComboBox((E[])education)).setBackground(Color.WHITE);
        this.c4.setFont(new Font("Raleway", 1, 14));
        final String[] occupation = { "Salaried", "Self-Employmed", "Business", "Student", "Retired", "Others" };
        (this.c5 = new JComboBox((E[])occupation)).setBackground(Color.WHITE);
        this.c5.setFont(new Font("Raleway", 1, 14));
        this.setLayout(null);
        this.l12.setBounds(700, 10, 60, 30);
        this.add(this.l12);
        this.t3.setBounds(760, 10, 60, 30);
        this.add(this.t3);
        this.l1.setBounds(280, 30, 600, 40);
        this.add(this.l1);
        this.l2.setBounds(100, 120, 100, 30);
        this.add(this.l2);
        this.c1.setBounds(350, 120, 320, 30);
        this.add(this.c1);
        this.l3.setBounds(100, 170, 100, 30);
        this.add(this.l3);
        this.c2.setBounds(350, 170, 320, 30);
        this.add(this.c2);
        this.l4.setBounds(100, 220, 100, 30);
        this.add(this.l4);
        this.c3.setBounds(350, 220, 320, 30);
        this.add(this.c3);
        this.l5.setBounds(100, 270, 150, 30);
        this.add(this.l5);
        this.c4.setBounds(350, 270, 320, 30);
        this.add(this.c4);
        this.l11.setBounds(100, 290, 150, 30);
        this.add(this.l11);
        this.l6.setBounds(100, 340, 150, 30);
        this.add(this.l6);
        this.c5.setBounds(350, 340, 320, 30);
        this.add(this.c5);
        this.l7.setBounds(100, 390, 150, 30);
        this.add(this.l7);
        this.t1.setBounds(350, 390, 320, 30);
        this.add(this.t1);
        this.l8.setBounds(100, 440, 180, 30);
        this.add(this.l8);
        this.t2.setBounds(350, 440, 320, 30);
        this.add(this.t2);
        this.l9.setBounds(100, 490, 150, 30);
        this.add(this.l9);
        this.r1.setBounds(350, 490, 100, 30);
        this.add(this.r1);
        this.r2.setBounds(460, 490, 100, 30);
        this.add(this.r2);
        this.l10.setBounds(100, 540, 180, 30);
        this.add(this.l10);
        this.r3.setBounds(350, 540, 100, 30);
        this.add(this.r3);
        this.r4.setBounds(460, 540, 100, 30);
        this.add(this.r4);
        this.b.setBounds(570, 600, 100, 30);
        this.add(this.b);
        this.b.addActionListener(this);
        this.getContentPane().setBackground(Color.WHITE);
        this.setSize(850, 850);
        this.setLocation(500, 90);
        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(final ActionEvent ae) {
        final String a = (String)this.c1.getSelectedItem();
        final String b = (String)this.c2.getSelectedItem();
        final String c = (String)this.c3.getSelectedItem();
        final String d = (String)this.c4.getSelectedItem();
        final String e = (String)this.c5.getSelectedItem();
        final String f = this.t1.getText();
        final String g = this.t2.getText();
        String h = "";
        if (this.r1.isSelected()) {
            h = "Yes";
        }
        else if (this.r2.isSelected()) {
            h = "No";
        }
        String i = "";
        if (this.r3.isSelected()) {
            i = "Yes";
        }
        else if (this.r4.isSelected()) {
            i = "No";
        }
        final String j = this.t3.getText();
        try {
            if (this.t2.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }
            else {
                final conn c2 = new conn();
                final String q1 = "insert into signup2 values('" + a + "','" + b + "','" + c + "','" + d + "','" + e + "','" + f + "','" + g + "','" + h + "','" + i + "','" + j + "')";
                c2.s.executeUpdate(q1);
                new Signup3().setVisible(true);
                this.setVisible(false);
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static void main(final String[] args) {
        new Signup2().setVisible(true);
    }
}
