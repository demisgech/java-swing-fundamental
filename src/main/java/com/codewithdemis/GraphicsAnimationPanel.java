package com.codewithdemis;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GraphicsAnimationPanel extends JPanel implements ActionListener {
    private final int PANEL_WIDTH = 500;
    private final int PANEL_HEIGHT = 500;

    private Image enemy;
    private Image backgroundImage;
    private Timer timer;

    private double xVelocity = 1;
    private double yVelocity = 2;

    private int x = 0;
    private int y = 0;

    public GraphicsAnimationPanel() {
        setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
//        setBackground(Color.BLACK);

        this.enemy = new ImageIcon("./src/main/resources/static/images-spider-removebg-preview.png").getImage();
        this.backgroundImage = new ImageIcon("./src/main/resources/static/space.jpg").getImage();
//        this.backgroundImage = new ImageIcon("./src/main/resources/static/bg-space.jpg").getImage();

        this.timer = new Timer(10,this);
        timer.start();

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D graphics2D = (Graphics2D)g;

        graphics2D.drawImage(backgroundImage,0,0,null);
        graphics2D.drawImage(enemy,x,y,null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.x >= getWidth() - enemy.getWidth(null) || this.x < 0){
            this.xVelocity *= -1;
        }
        this.x += this.xVelocity;

        if (this.y >= getHeight() - enemy.getHeight(null) || this.y < 0){
            this.yVelocity *= -1;
        }
        this.y += this.yVelocity;

        repaint();
    }
}
