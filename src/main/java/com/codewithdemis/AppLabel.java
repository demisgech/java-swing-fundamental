package com.codewithdemis;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class AppLabel {
    public AppLabel() {
        var frame = new JFrame("My app");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        var color = new Color(15, 10, 68);
//        var pane = frame.getContentPane();
//        pane.setBackground(color);

        var icon = new ImageIcon(getClass().getResource("/static/logo.png"));
        frame.setIconImage(icon.getImage());


        var label = getJLabel(icon, color);

        label.setBounds(0,0,200,200);
        label.setBounds(100,200,200,200);
        frame.setLayout(null);

        frame.add(label);
        frame.add(label);
        frame.setVisible(true);

//        frame.pack();
    }

    private static JLabel getJLabel(ImageIcon icon, Color color) {
        var label = new JLabel("Hello World");
//        label.setForeground(color);
        label.setForeground(new Color(12,134,48));
        label.setFont(new Font("sans serif",Font.BOLD,20));
        label.setIconTextGap(60);
        label.setText("Hello");
        label.setIcon(icon);
        label.setHorizontalTextPosition(JLabel.RIGHT);// CENTER,RIGHT,LEFT of the image
        label.setVerticalTextPosition(JLabel.TOP); // TOP,BOTTOM, CENTER
        label.setHorizontalTextPosition(JLabel.CENTER);

        // Set background color

        Border border = BorderFactory.createLineBorder(Color.ORANGE,3);

        label.setBorder(border);
        label.setBackground(color);
        label.setOpaque(true);
        label.setIconTextGap(5);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        return label;
    }
}
