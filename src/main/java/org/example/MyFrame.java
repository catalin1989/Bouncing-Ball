package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    JButton button;
    Cronometru cronometru=new Cronometru();

    MyFrame(){
        JButton button= new JButton("Start");
        button.setBounds(250,250,200,200);
        button.setFocusable(false);
        button.addActionListener(e-> cronometru.start());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(500,500);
        this.setLayout(null);
        this.add(button);


    }

    public void paint(Graphics g){
        Graphics g2d= (Graphics) g;

       // g2d.drawLine(0,0,500,500);

    }


}
