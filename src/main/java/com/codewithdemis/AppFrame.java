package com.codewithdemis;

import javax.swing.*;

public class AppFrame extends JFrame {
    public AppFrame() {

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        var icon = new ImageIcon(getClass().getResource("/static/logo.png"));
        this.setIconImage(icon.getImage());
        this.setSize(500,500);
        this.setTitle("App Frame");
    }
}


