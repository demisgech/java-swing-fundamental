package com.codewithdemis;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class MouseListenerFrame extends JFrame implements MouseListener {

    private JLabel label;
    private ImageIcon imageIcon;

    public MouseListenerFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(500,500));
        setLayout(new FlowLayout());

        this.imageIcon = new ImageIcon(getClass().getResource("/static/gamespotlog.jpg"));

        label = new JLabel();

        label.setBounds(50,50,200,200);
        label.setBackground(Color.blue);
        label.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));

        label.addMouseListener(this);
        label.setIcon(imageIcon);

        add(label);
        setVisible(true);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.imageIcon = new ImageIcon(getClass().getResource("/static/collection.png"));
        label.setIcon(imageIcon);
        System.out.println("Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        this.imageIcon = new ImageIcon(getClass().getResource("/static/logo.png"));
        label.setIcon(imageIcon);
        System.out.println("Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.imageIcon = new ImageIcon(getClass().getResource("/static/logo.png"));
        label.setIcon(imageIcon);

        System.out.println("Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.imageIcon = new ImageIcon(getClass().getResource("/static/gamespotlog.jpg"));
        label.setIcon(imageIcon);
        System.out.println("Exit");
    }
}
