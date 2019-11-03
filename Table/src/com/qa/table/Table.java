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
                {"byte", "02.11.2006 19:15", "Folder", "","","","","",""},
                {"short", "03.10.2006 14:10", "Folder", "","","","","",""},
                {"char", "02.11.2006 14:20", "Folder", "","","","","",""},
                {"int", "13.10.2007 10:46", "Folder", "","","","","",""},
                {"long", "13.10.2007 12:10", "Folder", "","","","","",""},
                {"float", "23.09.2006 16:34", "Folder", "","","","","",""},
                {"double", "07.12.2006 17:45", "Folder", "","","","","",""},
                {"boolean", "03.10.2006 14:08", "Folder", "","","","","",""},

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