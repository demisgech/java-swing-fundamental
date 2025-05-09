package com.codewithdemis;


import java.awt.*;
import javax.swing.*;

class BootstrapModal extends JDialog {
    public BootstrapModal(JFrame parentFrame,
                          String text,
                          JPanel contentPanel) {
        super(parentFrame, true);// true makes it modal
        setTitle(text);
        setUndecorated(true);// remove windows decorations
        setSize(400, 250);
        setLocationRelativeTo(parentFrame); //make center it relative to parent

        // Create a transparent overlay
        JPanel overlay = createOverlayPanel();

        // Create a modal panel with content

        JPanel modalPanel = new JPanel();
        modalPanel.setBackground(Color.white);
        modalPanel.setPreferredSize(new Dimension(350, 180));
        modalPanel.setLayout(new BorderLayout());

        // Apply rounded corners to the modal panel
        modalPanel = new ModalRoundedPanel(modalPanel);

        // Add title
        var label = new JLabel(text, SwingConstants.CENTER);
        label.setFont(new Font("sansSarif", Font.PLAIN, 20));
        modalPanel.add(label, BorderLayout.NORTH);

        // Add custom content (can be any JPanel)
        modalPanel.add(contentPanel, BorderLayout.CENTER);
        modalPanel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20)); // padding

        // Close button
        var closeBtn = new BootstrapButton("Close","danger");
        closeBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        closeBtn.setBorder(BorderFactory.createEmptyBorder(8,20,8,20));
        closeBtn.addActionListener(e -> dispose());
        modalPanel.add(closeBtn, BorderLayout.SOUTH);

//        overlay.setLayout(new GridBagLayout());
        overlay.add(modalPanel);
        setContentPane(overlay);
    }

    // Overlay panel to give the dimmed background
    private JPanel createOverlayPanel() {
        return new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(0, 0, 0, 150));// semi-transparent black
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
    }

    private static class ModalRoundedPanel extends JPanel {
        private final Component content;

        public ModalRoundedPanel(Component content) {
            this.content = content;
            setLayout(new BorderLayout());
            add(content);
            setOpaque(false);
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D graphics2D = (Graphics2D) g.create();
            graphics2D.setRenderingHint(
                    RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            graphics2D.setColor(Color.white);
            graphics2D.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30);
            graphics2D.dispose();
            super.paintComponent(g);
        }
    }
}
