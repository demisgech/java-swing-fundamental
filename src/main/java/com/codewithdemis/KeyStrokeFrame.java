package com.codewithdemis;

import java.awt.*;
import javax.swing.*;

public class KeyStrokeFrame extends JFrame  {
    public KeyStrokeFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(500,500));

        var panel = new GamePanel();


        add(panel);

        setVisible(true);
    }
}
