package com.qa.table;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Table extends JFrame {

    public static void createGUI() {
        JFrame frame = new JFrame("Test frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] columnNames = {
                "",
                "byte",
                "short",
                "char",
                "int",
                "long",
                "float",
                "double",
                "boolean"

        };

        String[][] data = {
                {"byte", "-", "A", "A","A","A","A","A","X"},
                {"short", "NA", "-", "A","A","A","A","A","X"},
                {"char", "NA", "NA", "-","A","A","A","A","X"},
                {"int", "NA", "NA", "NA","-","A","A","A","X"},
                {"long", "NA", "NA", "NA","NA","-","A","A","X"},
                {"float", "NA", "NA", "NA","NA","NA","-","A","X"},
                {"double", "NA", "NA", "NA","NA","NA","NA","-","X"},
                {"boolean", "X", "X", "X","X","X","X","X","-"},

        };

        JTable table = new JTable(data, columnNames);

        JScrollPane scrollPane = new JScrollPane(table);

        frame.getContentPane().add(scrollPane);
        frame.setPreferredSize(new Dimension(450, 200));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                createGUI();
            }
        });
    }
}