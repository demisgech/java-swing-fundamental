package com.codewithdemis;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Map;
import javax.swing.*;

public class BootstrapButton extends JButton {
    private Color primaryColor;
    private Color hoverColor;
    private Color pressedShade ;

    private static final Map<String, Color[]> VARIANT_COLORS = Map.of(
            "primary", new Color[]{new Color(0, 123, 255), new Color(0, 105, 217), new Color(0, 90, 190)},
            "danger", new Color[]{new Color(220, 53, 69), new Color(200, 35, 51), new Color(180, 30, 45)},
            "success", new Color[]{new Color(40, 167, 69), new Color(30, 140, 60), new Color(20, 120, 50)},
            "warning", new Color[]{new Color(255, 193, 7), new Color(255, 174, 0), new Color(240, 160, 0)}
    );

    public BootstrapButton(String text){
        this(text,"primary");
    }
    public BootstrapButton(String text,String variant) {
        super(text);
        applyStyle(variant);
        setFocusPainted(false);
        setForeground(Color.white);
        setBackground(primaryColor);

        // Prevent default painting
        setContentAreaFilled(false);
        setBorderPainted(false);
        setOpaque(false);

        setFont(new Font("sans serif", Font.PLAIN, 20));
        setCursor(new Cursor(Cursor.HAND_CURSOR));

        addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                setBackground(pressedShade);
//                System.out.println("Pressed!!");
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                setBackground(hoverColor);
//                System.out.println("Released!!!");
                repaint();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(hoverColor);
//                System.out.println("Entered!!!");
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(primaryColor);
//                System.out.println("Exit!!");
                repaint();
            }
        });
    }

    public void applyStyle(String variant){
        Color[] colors = VARIANT_COLORS.getOrDefault(variant,VARIANT_COLORS.get("primary"));
        primaryColor = colors[0];
        hoverColor = colors[0];
        pressedShade = colors[2];
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g.create();
        graphics2D.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.setColor(getBackground());
        graphics2D.fillRoundRect(0, 0, getWidth(), getHeight(), 16, 16);
        graphics2D.dispose();
        super.paintComponent(g);
    }

    @Override
    public boolean isOpaque() {
        return false;
    }
}

