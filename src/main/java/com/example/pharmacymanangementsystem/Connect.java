package com.example.pharmacymanangementsystem;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Connect {
    public Connect() {
    }

    public static Connection connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pharmacy", "root", "");
            if (con != null) {
                return con;
            }
        } catch (Exception var1) {
            JOptionPane.showMessageDialog((Component)null, var1.getMessage(), "Error", 2);
        }

        return null;
    }
}
