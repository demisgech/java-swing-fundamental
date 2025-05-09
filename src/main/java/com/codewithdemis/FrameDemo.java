package com.codewithdemis;

import java.awt.*;
import java.io.File;
import javax.swing.*;

public class FrameDemo {
    public static void show(){
        var frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(400, 400);
        frame.setTitle("This is my first java swing application");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);


        var file = new File("./", "src/main/resources/static/logo.png");
        var icon = new ImageIcon(file.toString());
        frame.setIconImage(icon.getImage());

        var pane = frame.getContentPane();
        var color = new Color(0, 20, 45);
        pane.setBackground(color);
    }
}
