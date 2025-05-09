package com.codewithdemis;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CheckBoxFrame extends JFrame implements ActionListener {
    private JCheckBox checkBox;
    private BootstrapButton button;
    private ImageIcon xIcon;
    private ImageIcon checkedIcon;

    public CheckBoxFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(new FlowLayout());

        xIcon = new ImageIcon(getClass().getResource("/static/logo.png"));
        checkedIcon = new ImageIcon(getClass().getResource("/static/collection.png"));

        checkBox = new JCheckBox("Checkbox");
        checkBox.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        checkBox.setBounds(20, 20, 100, 100);
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas", Font.BOLD, 20));

        checkBox.setIcon(xIcon);
        checkBox.setSelectedIcon(checkedIcon);

        button = new BootstrapButton("Submit");
        button.addActionListener(this);

        add(checkBox);
        add(button);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            var text = checkBox.getText();
            System.out.println(text);

            var selected = checkBox.isSelected();
            System.out.println(selected);
        }
    }
}
