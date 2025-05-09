package com.codewithdemis;

import java.awt.*;
import java.io.File;
import javax.swing.*;

public class BootstrapCardComponent{
    public static void show() {

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Bootstrap Card with Swing");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(350, 450);

            frame.setLayout(new GridBagLayout()); // Enables centering

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.anchor = GridBagConstraints.CENTER;

            // Card Panel
            JPanel cardPanel = new JPanel();
            cardPanel.setLayout(new BoxLayout(cardPanel, BoxLayout.Y_AXIS));
//                    cardPanel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 2));
//                    cardPanel.setBackground(Color.WHITE);
            cardPanel.setPreferredSize(new Dimension(300, 400));

            // Image placeholder
            JLabel imageLabel = new JLabel(new ImageIcon(new File("./src/main/resources/static/logo.png").toString()));
            imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
            cardPanel.add(imageLabel);

            // Card title
            JLabel titleLabel = new JLabel("Card Title");
            titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
            titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
            cardPanel.add(titleLabel);

            // Card text
            JTextArea cardText = new JTextArea("Some quick example text to build on the card title and make up the bulk of the card’s content.");
            cardText.setWrapStyleWord(true);
            cardText.setLineWrap(true);
            cardText.setEditable(false);
            cardText.setBackground(null);
            cardText.setFont(new Font("Arial", Font.PLAIN, 14));
            cardText.setMargin(new Insets(5, 10, 5, 10));
            cardPanel.add(cardText);

            // Button
            JButton button = new JButton("Go Somewhere");
            button.setBackground(new Color(0, 123, 255)); // Bootstrap Primary Blue
            button.setForeground(Color.WHITE);
            button.setFocusPainted(false);
            button.setFont(new Font("Arial", Font.BOLD, 14));
            button.setAlignmentX(Component.CENTER_ALIGNMENT);
            cardPanel.add(Box.createRigidArea(new Dimension(0, 10))); // Spacing
            cardPanel.add(button);

            frame.add(cardPanel, gbc);
            frame.setVisible(true);
        });
    }

}

