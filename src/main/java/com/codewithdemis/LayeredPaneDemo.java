package com.codewithdemis;

import java.awt.*;
import javax.swing.*;

public class LayeredPaneDemo {
    public static void show(){
        var frame = new JFrame("Layered pane");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);

        var layer1 = new JLayeredPane();
        layer1.setBounds(0,0,500,500);

        var label1 = new JLabel("Hello");
        label1.setOpaque(true);
        label1.setBounds(20,20,100,100);
        label1.setBackground(Color.ORANGE);

        var label2 = new JLabel("Hello");
        label2.setOpaque(true);
        label2.setBounds(80,80,100,100);
        label2.setBackground(Color.GREEN);

        var label3 = new JLabel("Hello");
        label3.setOpaque(true);
        label3.setBounds(100,100,200,200);
        label3.setBackground(Color.blue);

//        layer1.add(label1,JLayeredPane.DEFAULT_LAYER);
//        layer1.add(label3,JLayeredPane.FRAME_CONTENT_LAYER);
//        layer1.add(label2,JLayeredPane.DEFAULT_LAYER);
//
        layer1.add(label1,Integer.valueOf(0));
        layer1.add(label3,Integer.valueOf(1));
        layer1.add(label2,Integer.valueOf(2));
        

        frame.add(layer1);
        frame.setVisible(true);
    }
}
