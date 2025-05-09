package com.codewithdemis;

import java.awt.*;
import javax.swing.*;

public class DraggableFrame extends JFrame {
    private DraggablePanel panel;

    public DraggableFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(500,500));
        setTitle("Draggable Frame");

        this.panel = new DraggablePanel();

        add(this.panel);
        setVisible(true);
    }
}
