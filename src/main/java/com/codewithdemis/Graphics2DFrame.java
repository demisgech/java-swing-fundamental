package com.codewithdemis;

import java.awt.*;
import javax.swing.*;

public class Graphics2DFrame extends JFrame {
    private GraphicsPanel panel;

    public Graphics2DFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        panel = new GraphicsPanel();

        setLocationRelativeTo(null);
        add(panel);
        pack();
        setVisible(true);
    }

}
