package com.codewithdemis;

import java.awt.*;
import javax.swing.*;

public class BootstrapModalDemo {
    public static void show(){
        SwingUtilities.invokeLater(()->createUI());
    }

    private static void createUI(){
        var frame = new JFrame("Main Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout());

        var showBtn = new BootstrapButton("Show Modal");
        showBtn.addActionListener(e->{
            var contentPanel = new JPanel();
            contentPanel.setLayout(new BoxLayout(contentPanel,BoxLayout.Y_AXIS));
            contentPanel.add(new JLabel("Some text label goes here"));
            contentPanel.add(new JTextField("Text field..."));

            var modal = new BootstrapModal(frame,"Custom Modal",contentPanel);
            modal.setVisible(true);
        });

        frame.add(showBtn);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

