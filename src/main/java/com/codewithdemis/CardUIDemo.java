package com.codewithdemis;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.*;

public class CardUIDemo {
    public static void show() {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf()); // Apply FlatLaf theme
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        new CardUI();
    }
}
