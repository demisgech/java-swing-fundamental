package com.codewithdemis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

 class BootstrapModalReusable extends JDialog {
    public BootstrapModalReusable(
            JFrame parent,
            String title,
            JPanel contentPanel,
            int width,
            int height,
            Color backgroundColor,
            boolean showCloseIcon,
            JPanel footerPanel
    ) {
        super(parent, true);
        setUndecorated(true);
        setSize(width, height);
        setLocationRelativeTo(parent);

        JPanel overlay = createOverlayPanel();
        RoundedPanel modalPanel = new RoundedPanel(backgroundColor, 24);
        modalPanel.setLayout(new BorderLayout(10, 10));
        modalPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Header (with optional close icon)
        if (title != null || showCloseIcon) {
            JPanel header = new JPanel(new BorderLayout());
            header.setOpaque(false);

            if (title != null) {
                JLabel titleLabel = new JLabel(title);
                titleLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
                header.add(titleLabel, BorderLayout.WEST);
            }

            if (showCloseIcon) {
                JButton close = new BootstrapButton("X","danger");
                close.setBorderPainted(false);
                close.setFocusPainted(false);
                close.setContentAreaFilled(false);
                close.setFont(new Font("SansSerif", Font.BOLD, 22));
                close.setForeground(Color.GRAY);
                close.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                close.addActionListener(e -> dispose());
                header.add(close, BorderLayout.EAST);
            }

            modalPanel.add(header, BorderLayout.NORTH);
        }

        // Main Content
        modalPanel.add(contentPanel, BorderLayout.CENTER);

        // Footer
        if (footerPanel != null) {
            modalPanel.add(footerPanel, BorderLayout.SOUTH);
        }

        // Drag support
        addDragSupport(modalPanel);

        overlay.setLayout(new GridBagLayout());
        overlay.add(modalPanel);
        setContentPane(overlay);
    }

    private JPanel createOverlayPanel() {
        return new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(0, 0, 0, 150));
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
    }

    private void addDragSupport(JPanel panel) {
        final Point[] dragStart = {null};
        panel.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                dragStart[0] = e.getPoint();
            }
        });
        panel.addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                Point current = e.getLocationOnScreen();
                setLocation(current.x - dragStart[0].x, current.y - dragStart[0].y);
            }
        });
    }

    // Custom JPanel with rounded corners
    static class RoundedPanel extends JPanel {
        private final Color backgroundColor;
        private final int cornerRadius;

        public RoundedPanel(Color bg, int radius) {
            this.backgroundColor = bg;
            this.cornerRadius = radius;
            setOpaque(false);
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(backgroundColor);
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius);
            g2.dispose();
            super.paintComponent(g);
        }
    }
}

public class ReusableModalDemo {
     public static void show(){
         var frame = new JFrame("Modal");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(500,500);
         frame.setLayout(new FlowLayout());
         frame.setVisible(true);

         JPanel body = new JPanel();
         body.setOpaque(false);
         body.add(new JLabel("This is the content"));

         JPanel footer = new JPanel();
         footer.setOpaque(false);
         footer.setLayout(new FlowLayout(FlowLayout.RIGHT));
         footer.add(new BootstrapButton("Cancel"));
         footer.add(new BootstrapButton("OK"));

         BootstrapModalReusable modal = new BootstrapModalReusable(
                 frame,
                 "User Info",
                 body,
                 400,
                 250,
                 Color.WHITE,
                 true,
                 footer
         );
         modal.setVisible(true);
     }
}

