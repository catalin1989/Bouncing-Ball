package org.example;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bouncer extends Applet implements ActionListener{
    private static final long serialVersionUID=1L;
    private Button start, stop;
    private Ball firExecutie[]=new Ball[10];
    private static int numarFirExecutie=0;

    public void init(){
        start= new Button("Start(cel mult 10 mingi)");
        add(start);
        start.addActionListener(this);
        stop=new Button("Stop");
        add(stop);
        stop.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event){
        if(event.getSource()==start)
            if(numarFirExecutie<10){
                Graphics g= getGraphics();
                firExecutie[numarFirExecutie]=new Ball(g);
                firExecutie[numarFirExecutie].start();
                numarFirExecutie++;
            }
        if(event.getSource()==stop)
            if(numarFirExecutie>0)firExecutie[--numarFirExecutie].pleaseStop();
    }
}
