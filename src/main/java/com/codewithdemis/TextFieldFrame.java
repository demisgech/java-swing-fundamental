package com.codewithdemis;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TextFieldFrame extends JFrame implements ActionListener {

    private JTextField textField;
    private BootstrapButton button;

    public TextFieldFrame(){
        this.setTitle("Text Field");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        this.setBackground(Color.BLACK);

        this.button = new BootstrapButton("Click Me");
        this.button.addActionListener(this);

        this.textField = new JTextField("Your text goes here...");
        textField.setBackground(Color.WHITE);
        textField.setForeground(Color.BLACK);
        textField.setPreferredSize(new Dimension(300,100));
        textField.setFont(new Font("sansSarif",Font.TRUETYPE_FONT,20));
        textField.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        textField.setText("Username");
        textField.setEditable(false);
        this.add(this.button);
        this.add(this.textField);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            var text = textField.getText();
//            textField.setHorizontalAlignment(JTextField.RIGHT);
            textField.setText("");
            System.out.println("Welcome! " + text);
        }
    }
}
