package com.codewithdemis;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.*;
import java.io.File;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        UIManager.put("Button.arc",20);
        UIManager.put("Component.focusWidth",2);

        SwingUtilities.invokeLater(()->JListFrameDemo.show());

        }

    }
