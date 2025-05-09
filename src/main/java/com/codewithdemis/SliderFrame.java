package com.codewithdemis;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class SliderFrame extends JFrame implements ChangeListener {
    private JPanel panel;
    private JLabel label;
    private JSlider slider;

    public SliderFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(new FlowLayout());

        panel = new JPanel();
        panel.setLayout(new GridLayout(2,1));
        panel.setBorder(BorderFactory.createLineBorder(Color.gray,3));
//        panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        slider = new JSlider(0, 100, 50);

//        slider.setBounds(20,20,100,100);
        slider.setPreferredSize(new Dimension(200, 200));
        slider.setBackground(Color.blue);
        slider.setForeground(Color.white);
        slider.setFocusable(false);
        slider.setCursor(new Cursor(Cursor.HAND_CURSOR));
        slider.setOrientation(JSlider.VERTICAL);
        slider.setPaintTicks(true);

        slider.setMinorTickSpacing(10);
        slider.setFont(new Font("OpenSans", Font.BOLD, 16));

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);
        slider.setPaintLabels(true);

        slider.addChangeListener(this);

        this.label = new JLabel();
        label.setFont(new Font("OpenSans", Font.BOLD, 16));
        label.setText("©️ = " + slider.getValue());
        label.setBackground(Color.blue);
        label.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        label.setBounds(new Rectangle(20,10,100,100));

        panel.add(slider);
        panel.add(label);

        add(panel);
        setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
            label.setText("©️ = " + slider.getValue());
            System.out.println(slider.getValue());
    }
}
