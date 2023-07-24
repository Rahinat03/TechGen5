package com.example.pharmacymanangementsystem;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
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

public class Inbox extends JFrame {
    Connection con = null;
    PreparedStatement pre = null;
    ResultSet res = null;
    ArrayList<String> arr;
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JComboBox<String> username;

    public Inbox() {
        this.initComponents();
        this.con = Connect.connect();
        this.fill_Username();
        this.arr = new ArrayList();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jButton1 = new JButton();
        this.jPanel2 = new JPanel();
        this.username = new JComboBox();
        this.jScrollPane1 = new JScrollPane();
        this.jTable1 = new JTable();
        this.jLabel3 = new JLabel();
        this.jLabel2 = new JLabel();
        this.setDefaultCloseOperation(2);
        this.setTitle("Inbox");
        this.setResizable(false);
        this.getContentPane().setLayout((LayoutManager)null);
        this.jPanel1.setBackground(new Color(102, 102, 102));
        this.jLabel1.setFont(new Font("Tahoma", 1, 24));
        this.jLabel1.setText("Inbox Form");
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addContainerGap(276, 32767).addComponent(this.jLabel1).addGap(293, 293, 293)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(22, 22, 22).addComponent(this.jLabel1).addContainerGap(26, 32767)));
        this.getContentPane().add(this.jPanel1);
        this.jPanel1.setBounds(0, 0, 710, 77);
        this.jButton1.setText("Send_Message");
        this.jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Inbox.this.jButton1ActionPerformed(evt);
            }
        });
        this.getContentPane().add(this.jButton1);
        this.jButton1.setBounds(550, 430, 110, 30);
        this.jPanel2.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 102)));
        this.username.setModel(new DefaultComboBoxModel(new String[]{"User_Name : "}));
        this.username.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                Inbox.this.usernameItemStateChanged(evt);
            }
        });
        this.jTable1.setModel(new DefaultTableModel(new Object[][]{new Object[3], new Object[3], new Object[3], new Object[3]}, new String[]{"   Message_From", "   Message_To", "   Message_Text"}) {
            boolean[] canEdit = new boolean[3];

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return this.canEdit[columnIndex];
            }
        });
        this.jScrollPane1.setViewportView(this.jTable1);
        if (this.jTable1.getColumnModel().getColumnCount() > 0) {
            this.jTable1.getColumnModel().getColumn(0).setResizable(false);
            this.jTable1.getColumnModel().getColumn(1).setResizable(false);
            this.jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        this.jLabel3.setText("Your Conversation : ");
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(this.username, -2, 110, -2).addComponent(this.jLabel3)).addGap(20, 20, 20).addComponent(this.jScrollPane1, -2, 500, -2).addContainerGap()));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jScrollPane1, -2, 310, -2).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jLabel3).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.username, -2, -1, -2))).addContainerGap()));
        this.getContentPane().add(this.jPanel2);
        this.jPanel2.setBounds(10, 88, 652, 334);
        this.jLabel2.setIcon(new ImageIcon(Inbox.class.getResource("/img/chat-box.gif")));
        this.getContentPane().add(this.jLabel2);
        this.jLabel2.setBounds(0, 70, 730, 400);
        this.setSize(new Dimension(718, 504));
        this.setLocationRelativeTo((Component)null);
    }

    private void usernameItemStateChanged(ItemEvent evt) {
        String sql = " select * from inbox where (MESSAGE_FROM= '" + Pharmacy.username1.getText() + "' and MESSAGE_TO='" + this.username.getSelectedItem() + "') or (MESSAGE_FROM= '" + this.username.getSelectedItem() + "' and MESSAGE_TO='" + Pharmacy.username1.getText() + "') ";

        try {
            this.pre = this.con.prepareStatement(sql);
            this.res = this.pre.executeQuery();
            this.jTable1.setModel(DbUtils.resultSetToTableModel(this.res));
        } catch (Exception var4) {
            JOptionPane.showMessageDialog((Component)null, var4.getMessage(), "Error", 2);
        }

    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        this.dispose();
        (new Send()).setVisible(true);
    }

    public static void main(String[] args) {
        try {
            UIManager.LookAndFeelInfo[] var4;
            int var3 = (var4 = UIManager.getInstalledLookAndFeels()).length;

            for(int var2 = 0; var2 < var3; ++var2) {
                UIManager.LookAndFeelInfo info = var4[var2];
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException var5) {
            Logger.getLogger(Inbox.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(Inbox.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(Inbox.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(Inbox.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new Inbox()).setVisible(true);
            }
        });
    }

    private void fill_Username() {
        String sql = "select NAME from users";

        try {
            this.pre = this.con.prepareStatement(sql);
            this.res = this.pre.executeQuery();

            while(this.res.next()) {
                if (!this.res.getString("NAME").equals(Pharmacy.username1.getText())) {
                    this.username.addItem(this.res.getString("NAME"));
                }
            }
        } catch (Exception var3) {
            JOptionPane.showMessageDialog((Component)null, var3.getMessage(), "Error", 2);
        }

    }
}

