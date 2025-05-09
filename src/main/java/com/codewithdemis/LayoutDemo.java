package com.codewithdemis;

import java.awt.*;
import javax.sound.sampled.Line;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class LayoutDemo {
    public static void show() {
        var frame = new JFrame("Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout(10, 10));
        frame.setSize(new Dimension(500, 500));

        var redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setPreferredSize(new Dimension(100, 100));

        var greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setPreferredSize(new Dimension(100, 100));

        var bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setPreferredSize(new Dimension(100, 100));

        var yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.yellow);
        yellowPanel.setPreferredSize(new Dimension(100, 100));

        var grayPanel = new JPanel();
        grayPanel.setBackground(Color.GRAY);
        grayPanel.setPreferredSize(new Dimension(100, 100));

        var blackPanel = new JPanel();
        blackPanel.setBackground(Color.BLACK);
        blackPanel.setPreferredSize(new Dimension(50, 50));

        var cyan = new JPanel();
        cyan.setBackground(Color.CYAN);
        cyan.setPreferredSize(new Dimension(100, 50));

        var button = new JButton("Button");
        button.setForeground(Color.white);
        button.setFocusable(false);
        button.addActionListener(e-> System.out.println("Clicked!!"+ e.getWhen()));
        button.setFont(new Font("sans serif",Font.BOLD,20));
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.setBackground(Color.green);


        Border border = BorderFactory.createLineBorder(Color.ORANGE,10,true);
        button.setBorderPainted(true);
        button.setBorder(border);

        cyan.add(button);

        var orange = new JPanel();
        orange.setBackground(Color.ORANGE);
        orange.setPreferredSize(new Dimension(50, 50));

        var lightGray = new JPanel();
        lightGray.setBackground(Color.LIGHT_GRAY);
        lightGray.setPreferredSize(new Dimension(50, 50));

        //        |<==********** Sub Panels *********==>|
        grayPanel.setLayout(new BorderLayout());
        grayPanel.add(blackPanel, BorderLayout.NORTH);
        grayPanel.add(cyan, BorderLayout.WEST);
        grayPanel.add(orange, BorderLayout.EAST);
        grayPanel.add(lightGray, BorderLayout.SOUTH);

        //        |<==********** Panels *********==>|

        frame.add(redPanel, BorderLayout.NORTH);
        frame.add(greenPanel, BorderLayout.WEST);
        frame.add(bluePanel, BorderLayout.EAST);
        frame.add(yellowPanel, BorderLayout.SOUTH);
        frame.add(grayPanel, BorderLayout.CENTER);
    }
}
