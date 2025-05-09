package com.codewithdemis;

import javax.swing.*;



public class OptionPane {
    public  void show(){
//        var frame = new JFrame("Dialog Box");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(500,500);
//        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
//
//        var optionPane = new JOptionPane();
//        optionPane.setSize(300,300);
//
//        JOptionPane.showMessageDialog(optionPane,"Some message...","Welcome",JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(optionPane,"Some message...","Welcome",JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(optionPane,"Some message...","Welcome",JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(optionPane,"Some message...","Welcome",JOptionPane.ERROR_MESSAGE);
//        JOptionPane.showMessageDialog(optionPane,"Some message...","Welcome",JOptionPane.WARNING_MESSAGE);

//        JOptionPane.showConfirmDialog(null,"Some confirm message","Message title",JOptionPane.YES_NO_OPTION);
//        JOptionPane.showConfirmDialog(null,"Some confirm message","Message title",JOptionPane.YES_OPTION);
//        int answer = JOptionPane.showConfirmDialog(null,"Some confirm message","Message title",JOptionPane.YES_NO_CANCEL_OPTION);
//        System.out.println(answer);
//        var result = JOptionPane.showInputDialog("What is you name?");
//        JOptionPane.showInputDialog(optionPane,"What is you name?");
//        System.out.println(result);

//        frame.add(optionPane);
//        JOptionPane.showInternalConfirmDialog(null,"Hello this is your message");
//        frame.setVisible(true);

        String[] responses = {
                "No",
                "Yes",
                "Neither"
        };
        var icon = new ImageIcon(getClass()
                .getResource("/static/gamespotlog.jpg"));

        JOptionPane.showOptionDialog(null,
                "Message body ...",
                "Message title...",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE,icon,
                responses,null);

    }
}
