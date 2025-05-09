package com.codewithdemis;

import java.awt.*;
import javax.swing.*;

public class BootstrapCardDemo {
    public static void show() {
        SwingUtilities.invokeLater(() -> {

            var frame = new JFrame("Card Component");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 500);
            frame.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));


            // Card 1 - Primary
            JPanel content1 = new JPanel();
            content1.setOpaque(false);
            content1.setLayout(new BoxLayout(content1, BoxLayout.Y_AXIS));
            content1.add(new JLabel("This is a primary card."));
//            content1.add(new JLabel("It uses the primary theme."));

            JPanel footer1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
            footer1.setOpaque(false);
            footer1.add(new BootstrapButton("OK"));

            BootstrapCard card1 = new BootstrapCard("Primary Card", content1, footer1, "primary");


            // Card 2 - Success
            JPanel content2 = new JPanel();
            content2.setOpaque(false);
            content2.setLayout(new BoxLayout(content2, BoxLayout.Y_AXIS));
            content2.add(new JLabel("This is a success card."));
            content2.add(new JLabel("Great for confirmations!"));

            JPanel footer2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
            footer2.setOpaque(false);
            footer2.add(new BootstrapButton("Got it"));

            BootstrapCard card2 = new BootstrapCard("Success Card", content2, footer2, "success");

            // Card 3 - Danger
            JPanel content3 = new JPanel();
            content3.setOpaque(false);
            content3.setLayout(new BoxLayout(content3, BoxLayout.Y_AXIS));
            content3.add(new JLabel("Something went wrong!"));

            JPanel footer3 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
            footer3.setOpaque(false);
            footer3.add(new BootstrapButton("Dismiss"));

            BootstrapCard card3 = new BootstrapCard("Error", content3, footer3, "danger");

            frame.add(card1);
            frame.add(card2);
            frame.add(card3);


            frame.setVisible(true);
        });
    }
}
