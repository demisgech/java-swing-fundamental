package com.codewithdemis.externaltheme;

import com.formdev.flatlaf.FlatDarculaLaf;
import java.awt.*;
import javax.swing.*;

class FlatLafFrame extends JFrame {
    public FlatLafFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(500, 500));
        setLayout(new FlowLayout());

        var button = new JButton("Click Me");
        button.setFont(new Font("openSans", Font.PLAIN, 16));
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));

        var menuBar = new JMenuBar();

        var fileMenu = new JMenu("File");
        fileMenu.setFont(new Font("openSans",Font.PLAIN,18));

        var editMenu = new JMenu("Edit");
        editMenu.setFont(new Font("openSans",Font.PLAIN,18));

        var viewMenu = new JMenu("View");
        viewMenu.setFont(new Font("openSans",Font.PLAIN,18));

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);

        setJMenuBar(menuBar);

        add(button);

        setVisible(true);
    }
}

public class FlatLafThemeDemo {
    public static void show(String[] args) {

        try {

            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        UIManager.put("Button.arc",20);
        UIManager.put("Component.focusWidth",2);
        SwingUtilities.invokeLater(() -> {
            new FlatLafFrame();
        });
    }
}