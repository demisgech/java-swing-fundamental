package com.codewithdemis;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;

public class BootstrapAlert extends JPanel {
    private static final Map<String, Color[]> ALERT_COLORS  = new HashMap<>();
    static {
        // Initialize color map with color schemes for different alert types
        ALERT_COLORS.put("success", new Color[]{new Color(40, 167, 69), new Color(30, 130, 76)});
        ALERT_COLORS.put("danger", new Color[]{new Color(220, 53, 69), new Color(185, 32, 48)});
        ALERT_COLORS.put("warning", new Color[]{new Color(255, 193, 7), new Color(204, 153, 0)});
        ALERT_COLORS.put("info", new Color[]{new Color(23, 162, 184), new Color(12, 110, 123)});
        ALERT_COLORS.put("default", new Color[]{new Color(108, 117, 125), new Color(77, 92, 96)});
    }

    private Color backgroundColor;
    private float alpha = 0f; //float value

    private Timer fadeInTimer;
    private Timer fadeOutTimer;
    private Timer autoDismissTimer;

    public BootstrapAlert(String message,String alertType,int dismissAfterMillis){
        Color[] colors = ALERT_COLORS.getOrDefault(alertType,ALERT_COLORS.get("default"));
        backgroundColor = colors[0];

        setLayout(new BorderLayout(10,10));
        setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        setBackground(backgroundColor);

        var messageLabel = new JLabel(message);
        messageLabel.setForeground(Color.white);
        add(messageLabel,BorderLayout.CENTER);

        var closeBtn = new BootstrapButton("Close","danger");
//        closeBtn.addActionListener(e->removeAlert());
        closeBtn.addActionListener(e->startFadOut());
        add(closeBtn,BorderLayout.EAST);

        // Fade-in animation
        fadeInTimer = new Timer(20,(event)->{
            alpha += 0.05f;
            if(alpha >= 1f){
                alpha = 1f;
                fadeInTimer.stop();
                autoDismissTimer.start();
            }
            repaint();
        });

        // Fade - out animation

        fadeOutTimer = new Timer(20,event->{
           alpha -= 0.05f;
           if(alpha <= 0f){
               alpha = 0f;
               fadeOutTimer.stop();
               removeAlert();
           }
           repaint();
        });

        autoDismissTimer = new Timer(dismissAfterMillis,event->startFadOut());
        autoDismissTimer.setRepeats(false);
        fadeInTimer.start();
    }

    private void startFadOut(){
        fadeInTimer.stop();
        autoDismissTimer.stop();
        fadeOutTimer.start();
    }

    private void removeAlert(){
        // Remove this alert from its parent container
        Container parent = getParent();
        if(parent != null){
            parent.remove(this);
            parent.revalidate();
            parent.repaint();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics2D = (Graphics2D)g.create();
        graphics2D.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,alpha));
        graphics2D.setColor(getBackground());
        graphics2D.fillRoundRect(0,0,getWidth(),getHeight(),20,20);
        graphics2D.dispose();
        super.paintComponent(g);
    }
}
