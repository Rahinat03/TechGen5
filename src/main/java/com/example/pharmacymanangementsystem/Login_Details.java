package com.example.pharmacymanangementsystem;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Login_Details extends JFrame {
    Connection con = null;
    PreparedStatement pre = null;
    ResultSet res = null;
    public JComboBox<String> day;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    public JComboBox<String> month;
    private JComboBox<String> username;
    public JComboBox<String> year;

    public Login_Details() {
        this.initComponents();
        this.con = Connect.connect();
        this.fill_Username();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jPanel2 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jPanel3 = new JPanel();
        this.jScrollPane1 = new JScrollPane();
        this.jTable1 = new JTable();
        this.jPanel4 = new JPanel();
        this.year = new JComboBox();
        this.jLabel2 = new JLabel();
        this.month = new JComboBox();
        this.day = new JComboBox();
        this.jLabel3 = new JLabel();
        this.username = new JComboBox();
        this.setDefaultCloseOperation(2);
        this.setTitle("Login_Details");
        this.setResizable(false);
        this.jPanel1.setBackground(new Color(51, 51, 51));
        this.jPanel2.setBackground(new Color(102, 102, 102));
        this.jLabel1.setFont(new Font("Tahoma", 1, 24));
        this.jLabel1.setText("Login_Details Form");
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(184, 184, 184).addComponent(this.jLabel1).addContainerGap(-1, 32767)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(26, 26, 26).addComponent(this.jLabel1).addContainerGap(20, 32767)));
        this.jPanel3.setBackground(new Color(51, 51, 51));
        this.jPanel3.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(255, 255, 255)));
        this.jTable1.setFont(new Font("Tahoma", 1, 12));
        this.jTable1.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null}, {null, null, null, null}, {null, null, null, null}, {null, null, null, null}}, new String[]{"        Name", "        Type", "        Date", "        Time"}) {
            boolean[] canEdit = new boolean[]{false, false, false, false};

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return this.canEdit[columnIndex];
            }
        });
        this.jScrollPane1.setViewportView(this.jTable1);
        if (this.jTable1.getColumnModel().getColumnCount() > 0) {
            this.jTable1.getColumnModel().getColumn(0).setResizable(false);
            this.jTable1.getColumnModel().getColumn(1).setResizable(false);
            this.jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
        this.jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane1).addContainerGap()));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane1, -1, 281, 32767).addContainerGap()));
        this.jPanel4.setBackground(new Color(51, 51, 51));
        this.jPanel4.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(255, 255, 255)));
        this.year.setModel(new DefaultComboBoxModel(new String[]{"Year : ", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040"}));
        this.year.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                Login_Details.this.yearItemStateChanged(evt);
            }
        });
        this.jLabel2.setFont(new Font("Tahoma", 1, 12));
        this.jLabel2.setText("User_Name : ");
        this.month.setModel(new DefaultComboBoxModel(new String[]{"Month : ", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
        this.month.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                Login_Details.this.monthItemStateChanged(evt);
            }
        });
        this.day.setModel(new DefaultComboBoxModel(new String[]{"Day : ", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
        this.day.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                Login_Details.this.dayItemStateChanged(evt);
            }
        });
        this.jLabel3.setFont(new Font("Tahoma", 1, 12));
        this.jLabel3.setText("Login_Date : ");
        this.username.setModel(new DefaultComboBoxModel(new String[]{"User_Name : "}));
        this.username.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                Login_Details.this.usernameItemStateChanged(evt);
            }
        });
        GroupLayout jPanel4Layout = new GroupLayout(this.jPanel4);
        this.jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel2).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.username, -2, 155, -2).addGap(18, 18, 18).addComponent(this.jLabel3).addGap(18, 18, 18).addComponent(this.day, -2, 58, -2).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.month, -2, -1, -2).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.year, -2, -1, -2).addContainerGap()));
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel2).addComponent(this.jLabel3).addComponent(this.day, -2, -1, -2).addComponent(this.month, -2, -1, -2).addComponent(this.year, -2, -1, -2).addComponent(this.username, -2, -1, -2)).addContainerGap()));
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel2, -1, -1, 32767).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel3, -1, -1, 32767).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jPanel4, -2, -1, -2).addGap(0, 0, 32767))).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jPanel2, -2, -1, -2).addGap(18, 18, 18).addComponent(this.jPanel4, -2, -1, -2).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.jPanel3, -1, -1, 32767).addContainerGap()));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -2, -1, -2));
        this.setSize(new Dimension(620, 503));
        this.setLocationRelativeTo((Component)null);
    }

    private void usernameItemStateChanged(ItemEvent evt) {
        String sql;
        if (this.day.getSelectedIndex() == 0 && this.month.getSelectedIndex() == 0 && this.year.getSelectedIndex() == 0) {
            sql = "select NAME,TYPE,DATE,TIME from login where NAME='" + this.username.getSelectedItem() + "' ";
        } else {
            sql = "select NAME,TYPE,DATE,TIME from login where NAME='" + this.username.getSelectedItem() + "' and DATE='" + this.day.getSelectedItem() + "-" + this.month.getSelectedItem() + "-" + this.year.getSelectedItem() + "' ";
        }

        try {
            this.pre = this.con.prepareStatement(sql);
            this.res = this.pre.executeQuery();
            this.jTable1.setModel(DbUtils.resultSetToTableModel(this.res));
        } catch (Exception var4) {
            JOptionPane.showMessageDialog((Component)null, var4.getMessage(), "Error", 2);
        }

    }

    private void dayItemStateChanged(ItemEvent evt) {
        String sql;
        if (this.month.getSelectedIndex() != 0 && this.year.getSelectedIndex() != 0 && this.username.getSelectedIndex() == 0) {
            sql = "select NAME,TYPE,DATE,TIME from login where DATE='" + this.day.getSelectedItem() + "-" + this.month.getSelectedItem() + "-" + this.year.getSelectedItem() + "' ";
        } else {
            sql = "select NAME,TYPE,DATE,TIME from login where NAME='" + this.username.getSelectedItem() + "' and DATE='" + this.day.getSelectedItem() + "-" + this.month.getSelectedItem() + "-" + this.year.getSelectedItem() + "' ";
        }

        try {
            this.pre = this.con.prepareStatement(sql);
            this.res = this.pre.executeQuery();
            this.jTable1.setModel(DbUtils.resultSetToTableModel(this.res));
        } catch (Exception var4) {
            JOptionPane.showMessageDialog((Component)null, var4.getMessage(), "Error", 2);
        }

    }

    private void monthItemStateChanged(ItemEvent evt) {
        String sql;
        if (this.day.getSelectedIndex() != 0 && this.month.getSelectedIndex() != 0 && this.year.getSelectedIndex() != 0 && this.username.getSelectedIndex() == 0) {
            sql = "select NAME,TYPE,DATE,TIME from login where DATE='" + this.day.getSelectedItem() + "-" + this.month.getSelectedItem() + "-" + this.year.getSelectedItem() + "' ";
        } else {
            sql = "select NAME,TYPE,DATE,TIME from login where NAME='" + this.username.getSelectedItem() + "' and DATE='" + this.day.getSelectedItem() + "-" + this.month.getSelectedItem() + "-" + this.year.getSelectedItem() + "' ";
        }

        try {
            this.pre = this.con.prepareStatement(sql);
            this.res = this.pre.executeQuery();
            this.jTable1.setModel(DbUtils.resultSetToTableModel(this.res));
        } catch (Exception var4) {
            JOptionPane.showMessageDialog((Component)null, var4.getMessage(), "Error", 2);
        }

    }

    private void yearItemStateChanged(ItemEvent evt) {
        String sql;
        if (this.month.getSelectedIndex() != 0 && this.day.getSelectedIndex() != 0 && this.username.getSelectedIndex() == 0) {
            sql = "select NAME,TYPE,DATE,TIME from login where DATE='" + this.day.getSelectedItem() + "-" + this.month.getSelectedItem() + "-" + this.year.getSelectedItem() + "' ";
        } else {
            sql = "select NAME,TYPE,DATE,TIME from login where NAME='" + this.username.getSelectedItem() + "' and DATE='" + this.day.getSelectedItem() + "-" + this.month.getSelectedItem() + "-" + this.year.getSelectedItem() + "' ";
        }

        try {
            this.pre = this.con.prepareStatement(sql);
            this.res = this.pre.executeQuery();
            this.jTable1.setModel(DbUtils.resultSetToTableModel(this.res));
        } catch (Exception var4) {
            JOptionPane.showMessageDialog((Component)null, var4.getMessage(), "Error", 2);
        }

    }

    public static void main(String[] args) {
        try {
            UIManager.LookAndFeelInfo[] var1 = UIManager.getInstalledLookAndFeels();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                UIManager.LookAndFeelInfo info = var1[var3];
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException var5) {
            Logger.getLogger(Login_Details.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(Login_Details.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(Login_Details.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(Login_Details.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new Login_Details()).setVisible(true);
            }
        });
    }

    private void fill_Username() {
        String sql = "select NAME from users";

        try {
            this.pre = this.con.prepareStatement(sql);
            this.res = this.pre.executeQuery();

            while(this.res.next()) {
                this.username.addItem(this.res.getString("NAME"));
            }
        } catch (Exception var3) {
            JOptionPane.showMessageDialog((Component)null, var3.getMessage(), "Error", 2);
        }

    }
}
