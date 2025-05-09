package com.codewithdemis;

import java.awt.*;
import javax.swing.*;

public class NewWindow {
    public NewWindow(){
        var frame = new JFrame("New Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);

        var label = new JLabel("Hello");
        label.setFont(new Font(null,Font.PLAIN,20));

        frame.add(label);
        frame.setVisible(true);
    }
}
