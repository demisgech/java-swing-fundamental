package com.codewithdemis;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.*;

public class DraggablePanel extends JPanel {
    private ImageIcon imageIcon = new ImageIcon(getClass().getResource("/static/logo.png"));

    private final int WIDTH = imageIcon.getIconWidth();
    private final int HEIGHT = imageIcon.getIconHeight();

    private Point imageCorner;
    private Point previousPoint;

    public DraggablePanel() {
        this.setBounds(10, 10, 100, 100);
        setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
        setBackground(Color.ORANGE);

        imageCorner = new Point(0, 0);
        setCursor(new Cursor(Cursor.HAND_CURSOR));

        var clickListener = new MouseClickListener();
        var dragListener = new MouseDragListener();

        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        imageIcon.paintIcon(this, g, (int) imageCorner.getX(), (int) imageCorner.getY());
        System.out.println("X:" + imageCorner.getX() + ",Y: "+ imageCorner.getY());
    }

    private class MouseClickListener extends MouseAdapter {
        public void mousePressed(MouseEvent event) {
            previousPoint = event.getPoint();
        }
    }

    private class MouseDragListener extends MouseMotionAdapter {
        public void mouseDragged(MouseEvent event) {
            Point currentPoint = event.getPoint();

            imageCorner.translate(
                    (int) (currentPoint.getX() - previousPoint.getX()),
                    (int) (currentPoint.getY() - previousPoint.getY())
            );
            previousPoint = currentPoint;
            repaint();
        }
    }
}
