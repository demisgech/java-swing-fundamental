package com.codewithdemis;

import javax.swing.*;

public class GraphicsAnimationFrame extends JFrame {
    private GraphicsAnimationPanel animationPanel;

    public GraphicsAnimationFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);

        animationPanel = new GraphicsAnimationPanel();

//        setLocationRelativeTo(null);
        add(animationPanel);
        pack();
        setVisible(true);

    }
}
