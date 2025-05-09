package com.codewithdemis;

import java.awt.*;
import javax.swing.*;

public class ButtonDemo {
    public static void show(){
        var frame = new JFrame("Button");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);

        frame.setLayout(null);

        var button = new JButton("Button");
        button.setFont(new Font("sans serif",Font.BOLD,20));
        button.setBackground(new Color(120,230,40));
        button.setForeground(new Color(100,10,140));
        var border = BorderFactory.createLineBorder(Color.ORANGE,0);
        button.setBorder(border);
//        button.setSize(80,50);
        button.setHorizontalAlignment(JButton.CENTER);

        button.setBounds(20,30,200,50);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));


        frame.add(button);
    }
}

