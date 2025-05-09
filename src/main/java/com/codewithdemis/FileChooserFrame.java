package com.codewithdemis;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;

public class FileChooserFrame extends JFrame implements ActionListener {
    private BootstrapButton button;
    public FileChooserFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(500,500));
        setLayout(new FlowLayout());

        button = new BootstrapButton("Select File");
        button.addActionListener(this);

        add(button);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            System.out.println("Clicked");
            JFileChooser fileChooser = new JFileChooser();
//            int response = fileChooser.showOpenDialog(null);
            fileChooser.setCurrentDirectory(new File(".")); // current dir
            fileChooser.setCurrentDirectory(new File("C:\\Users\\demis\\IdeaProject\\swingdevelopment\\")); // Root dir
            int response = fileChooser.showSaveDialog(null);
//            System.out.println(response);

            if (response == JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        }
    }
}
