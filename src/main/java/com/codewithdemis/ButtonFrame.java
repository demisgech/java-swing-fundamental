package com.codewithdemis;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ButtonFrame extends JFrame implements ActionListener {
    private JButton button;
    private JLabel label;

    public ButtonFrame() {
        this.button = new JButton("Click Me");
        this.setTitle("Button App");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);
        this.setSize(500, 500);

        var border = BorderFactory.createLineBorder(Color.ORANGE, 0); // 0 thickness
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.setBorder(border);
        button.setFocusable(false);
        button.setForeground(new Color(0xffffff));
        button.setBackground(new Color(0xb7bde));
        button.setFont(new Font("sans serif", Font.BOLD, 20));
        button.setBounds(50, 50, 200, 50);
        button.addActionListener(this);
        this.add(button);


        this.label = new JLabel("Hello world");
        label.setBounds(50, 100, 200, 200);
        label.setFont(new Font("sans serif", Font.BOLD, 20));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVisible(false);
        label.setVerticalAlignment(JLabel.TOP);
        this.add(label);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        boolean enabled = true;
        if (e.getSource() == button) {
//            button.setEnabled(false);

            label.setVisible(enabled);

//            button.setForeground(Color.ORANGE);
            button.setText("👍Clicked");

//            System.out.println("Clicked!!");
        }
    }
}
