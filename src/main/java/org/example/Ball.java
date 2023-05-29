package org.example;

import java.awt.*;

public class Ball extends Thread {
    private boolean keepGoing;
    private Graphics g;
    private int x = 37;
    private int xChange = 7;
    private int y = 37;
    private int yChange = 2;
    private int diameter = 10;
    private int rectLeftX = 30, rectRightX = 130;
    private int rectTopy = 30, rectBottomY = 130;

    public Ball(Graphics graphics) {
        graphics = g;
        keepGoing = true;
    }

    public void pleaseStop() {
        keepGoing = false;
        g.setColor(Color.white);
        g.fillOval(x, y, diameter, diameter);
    }

    public void run() {
        g.drawRect(rectLeftX, rectTopy, rectRightX - rectLeftX + 10, rectBottomY - rectTopy + 10);
        while (keepGoing) {
            g.setColor(Color.white);
            g.fillOval(x, y, diameter, diameter);
            if (x + xChange <= rectLeftX) xChange = -xChange;
            if (x + xChange >= rectRightX) xChange = -xChange;
            if (y + yChange <= rectTopy) yChange = -yChange;
            if (y + yChange >= rectBottomY) yChange = -yChange;
            x += xChange;
            y += yChange;
            g.setColor(Color.red);
            g.fillOval(x, y, diameter, diameter);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.err.println("Sleep exception");
            }
        }
    }
}
