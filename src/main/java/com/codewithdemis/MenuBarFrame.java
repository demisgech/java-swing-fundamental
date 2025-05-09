package com.codewithdemis;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class MenuBarFrame extends JFrame implements ActionListener {
    private JMenuBar menuBar;

    private JMenuItem loadItem;
    private JMenuItem saveItem;
    private JMenuItem exitItem;

    public MenuBarFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(500, 500));
        setLayout(new FlowLayout());

        this.menuBar = new JMenuBar();

        var icon = new ImageIcon(getClass().getResource("/static/logo.png"));
        loadItem = new JMenuItem("Load");
        loadItem.setFont(new Font("openSans", Font.PLAIN, 16));
        loadItem.addActionListener(this);
        loadItem.setCursor(new Cursor(Cursor.HAND_CURSOR));
        loadItem.setMnemonic(KeyEvent.VK_L);
        loadItem.setIcon(icon);

        saveItem = new JMenuItem("Save");
        saveItem.setFont(new Font("openSans", Font.PLAIN, 16));
        saveItem.setCursor(new Cursor(Cursor.HAND_CURSOR));
        saveItem.addActionListener(this);
        saveItem.setMnemonic(KeyEvent.VK_S);
        saveItem.setIcon(icon);

        exitItem = new JMenuItem("Exit");
        exitItem.setFont(new Font("openSans", Font.PLAIN, 16));
        exitItem.setCursor(new Cursor(Cursor.HAND_CURSOR));
        exitItem.addActionListener(this);
        exitItem.setMnemonic(KeyEvent.VK_E);
        exitItem.setIcon(icon);

        var fileMenu = new JMenu("File");
        fileMenu.setFocusable(false);
        fileMenu.setFont(new Font("openSans", Font.BOLD, 16));
        fileMenu.setCursor(new Cursor(Cursor.HAND_CURSOR));
        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        fileMenu.setMnemonic(KeyEvent.VK_F);

        var editMenu = new JMenu("Edit");
        editMenu.setFocusable(false);
        editMenu.setFont(new Font("openSans", Font.BOLD, 16));
        editMenu.setCursor(new Cursor(Cursor.HAND_CURSOR));

        var viewMenu = new JMenu("View");
        viewMenu.setFocusable(false);
        viewMenu.setFont(new Font("openSans", Font.BOLD, 16));
        viewMenu.setCursor(new Cursor(Cursor.HAND_CURSOR));


        this.menuBar.add(fileMenu);
        this.menuBar.add(editMenu);
        this.menuBar.add(viewMenu);

        setJMenuBar(menuBar);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loadItem) {
            System.out.println("Loading...");
        } else if (e.getSource() == saveItem) {
            System.out.println("Saving...");
        } else if (e.getSource() == exitItem) {
            System.out.println("Done!!");
            System.exit(0);
        }
    }
}
