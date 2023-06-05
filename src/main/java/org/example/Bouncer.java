package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bouncer extends JFrame implements ActionListener {
    private Ball firExecutie[] = new Ball[10];
    private static int numarFirExecutie = 0;
    JButton start, stop;
    Bouncer(){
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        start=new JButton("Start");
        start.setBounds(175,350,75,75);
        start.setFocusable(false);
        start.addActionListener(this::actionPerformed);
        this.add(start);
        stop=new JButton("Stop");
        stop.setBounds(250,350,75,75);
        stop.setFocusable(false);
        stop.addActionListener(this::actionPerformed);
        this.add(stop);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == start) {
            if (numarFirExecutie < 10) {
                Graphics g = getGraphics();
                firExecutie[numarFirExecutie] = new Ball(g);
                firExecutie[numarFirExecutie].start();
                numarFirExecutie++;
            }

        }

        if (e.getSource() == stop) {
            if (numarFirExecutie > 0) firExecutie[--numarFirExecutie].pleaseStop();
        }
    }
}


