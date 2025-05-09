package com.codewithdemis;

import java.awt.*;
import javax.swing.*;

public class BootstrapButtonDemo {
    public static void  show(){
        var frame = new JFrame("Bootstrap Button Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout());

        var button = new BootstrapButton("Click Me");
        button.setPreferredSize(new Dimension(150,50));

        frame.add(button);

        frame.setVisible(true);
    }
}
