package com.codewithdemis;

import java.awt.*;
import javax.swing.*;

public class PanelDemo {
    public static void show(){
        var frame = new JFrame("Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);

        var label = new JLabel("Hello World");

        label.setText("Orange");
        label.setVerticalAlignment(JLabel.TOP);

        JPanel orangePanel = new JPanel();
        orangePanel.setBackground(Color.ORANGE);
        orangePanel.setBounds(0, 0, 200, 200);
        orangePanel.add(label);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(200, 0, 200, 200);
        label.setText("Blue Panel");
        bluePanel.add(label);

        BorderLayout layout  = new BorderLayout();
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0, 200, 400, 200);
        label.setText("Green Panel");
        greenPanel.setLayout(layout);
        greenPanel.add(label);
        label.setBounds(20,30,150,150);

        greenPanel.setLayout(null);

        frame.add(orangePanel);
        frame.add(bluePanel);
        frame.add(greenPanel);

    }
}
