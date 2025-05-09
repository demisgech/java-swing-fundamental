package com.codewithdemis;

import java.awt.*;
import java.util.Map;
import javax.swing.*;

public class BootstrapCard extends JPanel {
    private static final Map<String, Color> cardColors = Map.of(
            "primary", new Color(0, 123, 255),
            "success", new Color(40, 167, 69),
            "danger", new Color(220, 53, 69),
            "warning", new Color(255, 193, 7),
            "info", new Color(23, 162, 184),
            "default", new Color(108, 117, 125)
    );

    public BootstrapCard(String title, JPanel content,
                         JComponent footer, String theme){
        setLayout(new BorderLayout());
        setOpaque(false);
        var cardPanel = new JPanel();
        cardPanel.setLayout(new BorderLayout());
        cardPanel.setBackground(cardColors.getOrDefault(theme,cardColors.get("default")));
        cardPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        // Make the edges round
        cardPanel = new RoundedPanel(cardPanel);

        var titleLabel = new JLabel(title);
        titleLabel.setFont(new Font("sansSarif",Font.BOLD,20));
        titleLabel.setForeground(Color.white);

        var descArea = new JTextArea();
        descArea.add(content);
        descArea.setFont(new Font("sansSarif",Font.PLAIN,16));
        descArea.setLineWrap(true);
        descArea.setWrapStyleWord(true);
        descArea.setEditable(false);
        descArea.setOpaque(false);
        descArea.setForeground(Color.white);

        cardPanel.add(titleLabel,BorderLayout.NORTH);
        cardPanel.add(descArea,BorderLayout.CENTER);

        if(footer != null){
            var footerPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
            footerPanel.setOpaque(false);
            footerPanel.add(footer);

            cardPanel.add(footerPanel,BorderLayout.SOUTH);
        }
        add(cardPanel);
    }

    private static class RoundedPanel extends JPanel {
        private final Component content;

        private RoundedPanel(Component content) {
            this.content = content;
            setLayout(new BorderLayout());
            add(content);
            setOpaque(false);
        }

        @Override
        public void paintComponent(Graphics g) {
            Graphics2D graphics2D = (Graphics2D)g.create();
            graphics2D.setRenderingHint(
                    RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            graphics2D.setColor(((JPanel) content).getBackground());
            graphics2D.fillRoundRect(0,0,getWidth(),getHeight(),20,20);
            graphics2D.dispose();
            super.paintComponent(g);
        }
    }
}
