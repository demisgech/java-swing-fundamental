package com.codewithdemis;

import java.awt.*;
import javax.swing.*;

class RoundedPanel extends JPanel {
    private int radius;
    public RoundedPanel(int radius){
        this.radius = radius;
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics2D = (Graphics2D) g.create();
        graphics2D.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
        );
        graphics2D.setColor(getBackground());
        graphics2D.fillRoundRect(0,0,getWidth(),
                getHeight(),radius,radius
        );
        graphics2D.dispose();
    }
}
public class RoundedPanelDemo {
    public static void show(){
        var frame = new JFrame("Hello Rounded Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout());

        var panel = new RoundedPanel(20);
        panel.setBackground(Color.CYAN);
        panel.setLayout(new FlowLayout());
        panel.add(new Label("Hello From Rounded Panel"));

        frame.add(panel);
        frame.setVisible(true);
    }
}
