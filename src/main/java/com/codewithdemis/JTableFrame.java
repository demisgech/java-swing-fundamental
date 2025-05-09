package com.codewithdemis;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class JTableFrame extends JFrame {
    public JTableFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setLayout(new BorderLayout());

        String[] columnNames = {"Id","Name","Age"};

        Object[][] data = {
                {1,"Demis",22},
                {2,"Abebe",24},
                {3,"Dereje",21},
                {4,"Dejen",23},
        };

        var tableModel = new DefaultTableModel(data,columnNames);
        var table = new JTable(tableModel);
        var scrollPane = new JScrollPane(table);

        table.setFont(new Font("openSans",Font.PLAIN,16));
        table.addRowSelectionInterval(1,2);
        table.editCellAt(2,1);

        add(scrollPane);
        setVisible(true);
    }
}
