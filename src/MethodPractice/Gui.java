package MethodPractice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    public int Score;
    Boolean Replay = false;

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
        Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b1 = Button1.toString();
                char b1char = b1.charAt(7);
                int b1num = Integer.parseInt(String.valueOf(b1char));
                if (Integer.parseInt(String.valueOf(b1char)) == randNum()) {
                    correctLb.setVisible(true);
                    correctLb.setText("Correct!! The Answer was " + randNum());
                    Score = Score +1;
                    Replay = true;
                }else{
                    wrongLB.setVisible(true);
                    wrongLB.setText("Wrong!! The Answer was " + randNum());
                }
            }
        });

        Button2.setBackground(new Color(Main.getR(), Main.getG(), Main.getB()));
        Button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b2 = Button2.toString();
                char b2char = b2.charAt(7);
                if (Integer.parseInt(String.valueOf(b2char)) == randNum()) {
                    correctLb.setVisible(true);
                    correctLb.setText("Correct!! The Answer was " + randNum());
                    Score = Score +1;
                    Replay = true;
                }else{
                    wrongLB.setVisible(true);
                    wrongLB.setText("Wrong!! The Answer was " + randNum());
                }
            }
        });

        Button3.setBackground(new Color(Main.getR(), Main.getG(), Main.getB()));
        Button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b3 = Button3.toString();
                char b3char = b3.charAt(7);
                if (Integer.parseInt(String.valueOf(b3char)) == randNum()) {
                    correctLb.setVisible(true);
                    correctLb.setText("Correct!! The Answer was " + randNum());
                    Score = Score +1;
                    Replay = true;
                }else{
                    wrongLB.setVisible(true);
                    wrongLB.setText("Wrong!! The Answer was " + randNum());
                }
            }
        });

        Button4.setBackground(new Color(Main.getR(), Main.getG(), Main.getB()));
        Button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b4 = Button4.toString();
                char b4char = b4.charAt(7);
                if (Integer.parseInt(String.valueOf(b4char)) == randNum()) {
                    correctLb.setVisible(true);
                    correctLb.setText("Correct!! The Answer was " + randNum());
                    Score = Score +1;
                    Replay = true;
                }else{
                    wrongLB.setVisible(true);
                    wrongLB.setText("Wrong!! The Answer was " + randNum());
                }
            }
        });

        Button5.setBackground(new Color(Main.getR(), Main.getG(), Main.getB()));
        Button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b5 = Button5.toString();
                char b5char = b5.charAt(7);
                if (Integer.parseInt(String.valueOf(b5char)) == randNum()) {
                    correctLb.setVisible(true);
                    correctLb.setText("Correct!! The Answer was " + randNum());
                    Score = Score +1;
                    Replay = true;
                }else{
                    wrongLB.setVisible(true);
                    wrongLB.setText("Wrong!! The Answer was " + randNum());
                }
            }
        });

        Button6.setBackground(new Color(Main.getR(), Main.getG(), Main.getB()));
        Button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b6 = Button6.toString();
                char b6char = b6.charAt(7);
                if (Integer.parseInt(String.valueOf(b6char)) == randNum()) {
                    correctLb.setVisible(true);
                    correctLb.setText("Correct!! The Answer was " + randNum());
                    Score = Score +1;
                    Replay = true;
                }else{
                    wrongLB.setVisible(true);
                    wrongLB.setText("Wrong!! The Answer was " + randNum());
                }
            }
        });

        Button7.setBackground(new Color(Main.getR(), Main.getG(), Main.getB()));
        Button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b7 = Button7.toString();
                char b7char = b7.charAt(7);
                if (Integer.parseInt(String.valueOf(b7char)) == randNum()) {
                    correctLb.setVisible(true);
                    correctLb.setText("Correct!! The Answer was " + randNum());
                    Score = Score +1;
                    Replay = true;
                }else{
                    wrongLB.setVisible(true);
                    wrongLB.setText("Wrong!! The Answer was " + randNum());
                }
            }
        });

        Button8.setBackground(new Color(Main.getR(), Main.getG(), Main.getB()));
        Button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b8 = Button8.toString();
                char b8char = b8.charAt(7);
                if (Integer.parseInt(String.valueOf(b8char)) == randNum()) {
                    correctLb.setVisible(true);
                    correctLb.setText("Correct!! The Answer was " + randNum());
                    Score = Score +1;
                    Replay = true;
                }else{
                    wrongLB.setVisible(true);
                    wrongLB.setText("Wrong!! The Answer was " + randNum());
                }
            }
        });

        Button9.setBackground(new Color(Main.getR(), Main.getG(), Main.getB()));
        Button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b9 = Button9.toString();
                char b9char = b9.charAt(7);
                if (Integer.parseInt(String.valueOf(b9char)) == randNum()) {
                    correctLb.setVisible(true);
                    correctLb.setText("Correct!! The Answer was " + randNum());
                    Score = Score +1;
                    Replay = true;
                }else{
                    wrongLB.setVisible(true);
                    wrongLB.setText("Wrong!! The Answer was " + randNum());
                }
            }
        });

        Button10.setBackground(new Color(Main.getR(), Main.getG(), Main.getB()));
        Button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b10 = Button10.toString();
                char b10char = b10.charAt(7);
                if (Integer.parseInt(String.valueOf(b10char)) == randNum()) {
                    correctLb.setVisible(true);
                    correctLb.setText("Correct!! The Answer was " + randNum());
                    Score = Score +1;
                    Replay = true;
                }else{
                    wrongLB.setVisible(true);
                    wrongLB.setText("Wrong!! The Answer was " + randNum());
                }
            }
        });

    }
    public static int randNum(){
        Random rd = new Random();
        return rd.nextInt(9)+1;
    }
}
