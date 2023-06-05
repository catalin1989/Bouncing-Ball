package org.example;

import java.awt.*;

public class Ball extends Thread{
    private boolean keepGoing;
    private Graphics g;
    private int x = 37, xChange = 7;
    private int y = 32, yChange = 2;
    private int diametre = 10;
    private int x1 = 0, x2 = 490, y1 = 0, y2 = 350;

    Ball(Graphics g) {
        this.g = g;
        keepGoing = true;
        g.setColor(Color.white);
        g.drawRect(x1, y1, x2, y2);

    }

    public void pleaseStop() {
        keepGoing = false;
        g.setColor(Color.white);
        g.fillOval(x, y, diametre, diametre);
    }

    public void run() {
        // g.drawRect(x1, y1, x2, y2);
        while(keepGoing){
            g.setColor(Color.white);
            g.fillOval(x,y,diametre,diametre);
            if(x+xChange<=x1) xChange=-xChange;
            if(x+xChange>= x2) xChange=-xChange;
            if(y+yChange<= y1) yChange=-yChange;
            if (y+yChange>=y2) yChange=-yChange;

            x+=xChange;
            y+=yChange;
            g.setColor(Color.red);
            g.fillOval(x,y,diametre,diametre);
            try{
                Thread.sleep(50);
            }
            catch(InterruptedException e){
                System.err.println("Sleep exception");
            }
        }
    }
}
