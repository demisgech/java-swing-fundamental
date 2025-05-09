package com.codewithdemis;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ColorChooserFrame extends JFrame implements ActionListener {
    private BootstrapButton button;
    private JLabel label;

    public ColorChooserFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(500, 500));
        setLayout(new FlowLayout());
        setTitle("Color Chooser");

        button = new BootstrapButton("Select Color");
        button.addActionListener(this);

        label = new JLabel("This is some dummy text...");
        label.setBackground(Color.white);
        label.setFont(new Font("openSans", Font.BOLD, 16));
        label.setOpaque(true);
        label.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        var panel = new JPanel(new GridLayout(2,1,0,10));

        panel.add(label);
        panel.add(button);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Clicked");

            Color color = JColorChooser.showDialog(null,"Select Color...",Color.BLUE);

            label.setBackground(color);
        }
    }
}
