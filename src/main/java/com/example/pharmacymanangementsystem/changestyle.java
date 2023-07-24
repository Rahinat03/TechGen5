package com.example.pharmacymanangementsystem;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class changestyle {
    public changestyle() {
    }

    public void chabgelock() {
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        } catch (Exception var2) {
            JOptionPane.showMessageDialog((Component)null, var2.getMessage(), "Error", 2);
        }

    }
}
