package MethodPractice;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Gui extends javax.swing.JFrame{

    private JPanel mainPanel;
    private JButton Button1;
    private JButton Button5;
    private JButton Button2;
    private JButton Button4;
    private JButton Button3;
    private JButton Button6;
    private JButton Button7;
    private JButton Button8;
    private JButton Button9;
    private JButton Button10;
    private JLabel correctLb;
    private JLabel wrongLB;


    Gui(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(new Dimension(500,200));
        this.setVisible(true);

        mainPanel.setPreferredSize(new Dimension(500,500));
        mainPanel.setVisible(true);
        this.add(mainPanel);

        correctLb.setVisible(false);
        wrongLB.setVisible(false);

        Button1.setBackground(new Color(Main.getR(), Main.getG(), Main.getB()));
        Button2.setBackground(new Color(Main.getR(), Main.getG(), Main.getB()));
        Button3.setBackground(new Color(Main.getR(), Main.getG(), Main.getB()));
        Button4.setBackground(new Color(Main.getR(), Main.getG(), Main.getB()));
        Button5.setBackground(new Color(Main.getR(), Main.getG(), Main.getB()));
        Button6.setBackground(new Color(Main.getR(), Main.getG(), Main.getB()));
        Button7.setBackground(new Color(Main.getR(), Main.getG(), Main.getB()));
        Button8.setBackground(new Color(Main.getR(), Main.getG(), Main.getB()));
        Button9.setBackground(new Color(Main.getR(), Main.getG(), Main.getB()));
        Button10.setBackground(new Color(Main.getR(), Main.getG(), Main.getB()));

    }
    public static int randNum(){
        Random rd = new Random(9+1);
        return rd.nextInt();
    }
}
