package com.codewithdemis;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class RadioButtonFrame extends JFrame implements ActionListener {
    private JRadioButton redButton;
    private JRadioButton blueButton;
    private JRadioButton grayButton;

    public RadioButtonFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(new FlowLayout());

        redButton = new JRadioButton("Red");
        redButton.setBounds(20, 20, 100, 100);
        redButton.setForeground(Color.white);
        redButton.setFont(new Font("Consolas", Font.BOLD, 16));
        redButton.addActionListener(this);
        redButton.setBackground(Color.RED);
        redButton.setFocusable(false);
        redButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        blueButton = new JRadioButton("Blue");
        blueButton.setBounds(20, 20, 100, 100);
        blueButton.addActionListener(this);
        blueButton.setBackground(Color.blue);
        blueButton.setForeground(Color.white);
        blueButton.setFont(new Font("Consolas", Font.BOLD, 16));
        blueButton.setFocusable(false);
        blueButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        grayButton = new JRadioButton("Gray");
        grayButton.setBounds(20, 20, 100, 100);
        grayButton.setBackground(Color.gray);
        grayButton.setForeground(Color.white);
        grayButton.addActionListener(this);
        grayButton.setFont(new Font("Consolas", Font.BOLD, 16));
        grayButton.setFocusable(false);
        grayButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        var group = new ButtonGroup();
        group.add(redButton);
        group.add(blueButton);
        group.add(grayButton);

        add(redButton);
        add(blueButton);
        add(grayButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redButton) {
            System.out.println(redButton.getText());
        } else if (e.getSource() == blueButton) {
            System.out.println(blueButton.getText());
        }else if (e.getSource() == grayButton) {
            System.out.println(grayButton.getText());
        }
    }
}
