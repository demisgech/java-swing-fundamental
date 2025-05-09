package com.codewithdemis;

import java.awt.*;
import javax.swing.*;

public class GridLayoutDemo {
    public static void show(){
        var frame = new JFrame("Grid Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(4,3,10,10));
        frame.setVisible(true);


//        frame.add(new JButton("1"));
//        frame.add(new JButton("2"));
//        frame.add(new JButton("3"));
//        frame.add(new JButton("4"));
//        frame.add(new JButton("5"));
//        frame.add(new JButton("6"));
//        frame.add(new JButton("7"));
//        frame.add(new JButton("8"));
//        frame.add(new JButton("9"));
//        frame.add(new JButton("0"));
//
        var panel = new JPanel(new GridLayout(4,3,5,5));
        panel.setPreferredSize(new Dimension(200,200));
        panel.setBackground(Color.GRAY);

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        panel.add(new JButton("0"));


        frame.add(panel);
        frame.setVisible(true);
    }
}
