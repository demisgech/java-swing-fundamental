package com.codewithdemis;

import java.awt.*;
import javax.swing.*;

public class JListFrame extends JFrame {
    public JListFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setLayout(new BorderLayout());

        String[] listItems = {"Item 1","Item 2","Item 2","Item 4"};

        JList<String> list = new JList<>(listItems);

        var scrollPane = new JScrollPane(list);

        add(scrollPane);
        setVisible(true);
    }
}
