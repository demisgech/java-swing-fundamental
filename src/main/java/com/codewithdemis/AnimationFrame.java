package com.codewithdemis;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class AnimationFrame extends JFrame implements KeyListener {

    private ImageIcon imageIcon;
    private JLabel label;

    public AnimationFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(500, 500));
        setLayout(new FlowLayout());

        imageIcon = new ImageIcon(getClass().getResource("/static/logo.png"));

        addKeyListener(this);

        label = new JLabel();
//        label.setBackground(Color.blue);
//        label.setBounds(10, 10, 200, 200);
//        label.setOpaque(true);
//        label.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));

        label.setIcon(imageIcon);
        add(label);
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
//        System.out.println("You Typed  Char: " + e.getKeyChar());
//        System.out.println("You Typed  key Code: " + e.getKeyCode());

        switch (e.getKeyChar()) {
            case 'L':
                label.setLocation(label.getX() - 20, label.getY());
                break;
            case 'R':
                label.setLocation(label.getX() + 20, label.getY());
                break;
            case 'B':
                label.setLocation(label.getX(), label.getY() + 20);
                break;
            case 'T':
                label.setLocation(label.getX(), label.getY() - 20);
                break;
            default:
                System.out.println("You pressed wrong key!!!: " + e.getKeyChar());
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
//        System.out.println("You pressed key char: " + e.getKeyChar());
        System.out.println("You pressed key code: " + e.getKeyCode());
        switch (e.getKeyCode()) {
            case 76:
                label.setLocation(label.getX() - 20, label.getY());
                break;
            case 82:
                label.setLocation(label.getX() + 20, label.getY());
                break;
            case 66:
                label.setLocation(label.getX(), label.getY() + 20);
                break;
            case 84:
                label.setLocation(label.getX(), label.getY() - 20);
                break;
            default:
                System.out.println("You pressed wrong key!!!: " + e.getKeyChar());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
//        System.out.println("You Released code: " + e.getKeyCode());
//        System.out.println("You Released key char: " + e.getKeyChar());

    }
}
