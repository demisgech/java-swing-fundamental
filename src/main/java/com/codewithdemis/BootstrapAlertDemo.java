package com.codewithdemis;

import java.awt.*;
import javax.swing.*;

public class BootstrapAlertDemo {
    public static void show(){
        var frame = new JFrame("Alert Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);

        frame.setLayout(new BorderLayout(10,10));

        var alert = new BootstrapAlert("Operation was successful!!","success",3000);
        frame.add(alert,BorderLayout.NORTH);
        frame.setVisible(true);

        BootstrapAlert errorAlert = new BootstrapAlert("Something went wrong!", "danger",1000);
        frame.add(errorAlert, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}
