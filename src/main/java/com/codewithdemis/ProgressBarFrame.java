package com.codewithdemis;

import java.awt.*;
import javax.swing.*;

public class ProgressBarFrame extends JFrame {

    private JProgressBar progressBar;

    public ProgressBarFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(new FlowLayout());

        this.progressBar = new JProgressBar(0, 100);
//        this.progressBar.setValue(20);
//        this.progressBar.setString("100%");
        this.progressBar.setStringPainted(true);
        progressBar.setFocusable(false);
        progressBar.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        progressBar.setBackground(Color.white);
        progressBar.setFont(new Font("openSans",Font.BOLD,16));
        progressBar.setForeground(Color.BLUE);

        add(this.progressBar);
        setVisible(true);

        fillBar();
    }

    private void fillBar() {
        int counter = 0;
        while (counter <= 100) {
            progressBar.setValue(counter);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            // to reset value
//            if(counter == 100)
//                counter = 0;
            counter += 1;
        }
        counter = 100;
        while (counter >= 0) {
            progressBar.setValue(counter);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            // to reset value
//            if(counter == 0)
//                counter = 100;
            counter -= 1;
        }

        progressBar.setString("Done!");
    }
}
