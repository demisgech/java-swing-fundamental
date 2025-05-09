package com.codewithdemis;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LaunchPage implements ActionListener {
    private final JFrame frame;
    private final BootstrapButton button;

    public LaunchPage() {
        this.frame = new JFrame("Launch page");
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setSize(500,500);
        this.frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

        this.button = new BootstrapButton("New Window");
        this.button.setBounds(20,20,100,100);
        this.button.addActionListener(this);

        this.frame.add(this.button);
        this.frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.button){
            frame.dispose();
            var newWindow = new NewWindow();
        }
    }
}
