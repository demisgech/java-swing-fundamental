package com.codewithdemis;

import javax.swing.*;
import java.awt.*;

public class CardUI extends JFrame {
    public CardUI() {
        setTitle("Bootstrap Card UI");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout());
        setLocationRelativeTo(null);

        JPanel cardPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2d.setColor(new Color(240, 40, 240)); // Background color
                g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20); // Rounded corners
            }
        };

        cardPanel.setLayout(new BorderLayout());
        cardPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JLabel header = new JLabel("Card Header", SwingConstants.CENTER);
        header.setFont(new Font("Arial", Font.BOLD, 18));

        JLabel content = new JLabel("<html><p style='text-align:center;'>This is a Bootstrap-inspired card in Swing.</p></html>");

        JButton actionButton = new JButton("Learn More");
        actionButton.setBackground(new Color(33, 150, 243));
        actionButton.setForeground(Color.WHITE);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(actionButton);
        buttonPanel.setOpaque(false);

        cardPanel.add(header, BorderLayout.NORTH);
        cardPanel.add(content, BorderLayout.CENTER);
        cardPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(cardPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CardUI::new);
    }
}

