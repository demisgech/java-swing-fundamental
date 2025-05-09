package com.codewithdemis;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class LabelDemo {
    public static void show(){
        var frame = new JFrame("TODO APP");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(500, 500);

        var label = new JLabel("Hello World");
        Border border = BorderFactory.createLineBorder(new Color(123, 234, 24), 4);
        label.setBorder(border);
        label.setFont(new Font("sans serif", Font.BOLD, 20));
        label.setVerticalAlignment(JLabel.TOP);
        label.setForeground(new Color(60, 10, 190));

        frame.add(label);
        frame.setVisible(true);
    }
}
