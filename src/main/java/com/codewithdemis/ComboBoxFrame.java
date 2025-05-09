package com.codewithdemis;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ComboBoxFrame extends JFrame implements ActionListener {
    private JComboBox<String> comboBox;

    public ComboBoxFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(new FlowLayout());

        String[] menus = {
                "Home",
                "About", "Services",
                "Login", "Logout"
        };

        comboBox = new JComboBox<>(menus);
        comboBox.setToolTipText("Navbar Items");
        comboBox.addActionListener(this);
        comboBox.addItem("Dashboard");
        comboBox.insertItemAt("Select item", 0);
        comboBox.setSelectedIndex(0);
//        comboBox.removeItem("Login");
//        comboBox.removeItemAt(0);
//        comboBox.addItemListener(e-> System.out.println(e.getItem()));

//        comboBox.removeAllItems();

        add(comboBox);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox) {
            System.out.println(comboBox.getToolTipText());
            System.out.println(comboBox.getSelectedItem());
        }
    }
}
