package com.codewithdemis;

import java.awt.*;
import javax.swing.*;

public class GraphicsPanel extends JPanel {

    private Image image;

    public GraphicsPanel() {
        setPreferredSize(new Dimension(500, 500));

        image = new ImageIcon("./src/main/resources/static/logo.png").getImage();
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;

        graphics2D.setPaint(Color.green);
//        graphics2D.setStroke(new BasicStroke(10));
//        graphics2D.drawLine(0,0,100,100);

//        graphics2D.setFont(new Font("openSans",Font.PLAIN,16));
//        graphics2D.setColor(Color.ORANGE);
//        graphics2D.drawString("Hello",100,40);
//
//        graphics2D.setColor(Color.BLUE);
//        graphics2D.drawArc(50,50,100,100,0,180);
//
//        graphics2D.draw3DRect(100,100,100,100,false);
//
//        graphics2D.drawRect(150,150,200,50);
//
//        graphics2D.setColor(new Color(12,130,148));
//        graphics2D.fillRect(200,200,200,100);
//
//        graphics2D.drawChars(new char[]{'a','b','c','d'},0,4,20,300);
//
//        graphics2D.setColor(Color.pink);
//        graphics2D.drawPolyline(new int []{100,20,30,400},new int[]{100,101,120,304},4);

        graphics2D.fillArc(10, 30, 200, 200, 0, 180);

        graphics2D.setColor(Color.BLUE);
        int[] xPoints = {150, 400, 200};
        int[] yPoints = {250, 400, 200};
//        graphics2D.drawPolygon(xPoints, yPoints,3);
        graphics2D.setColor(Color.pink);
        graphics2D.fillPolygon(xPoints, yPoints, 3);

        graphics2D.drawImage(image, 0, 0, null);
        graphics2D.setColor(Color.BLUE);
        graphics2D.fillArc(10, 30, 200, 200, 0, -180);

    }
}
