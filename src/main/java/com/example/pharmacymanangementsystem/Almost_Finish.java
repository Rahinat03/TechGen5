package com.example.pharmacymanangementsystem;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
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

public class Almost_Finish extends JFrame {
    Connection con = null;
    PreparedStatement pre = null;
    ResultSet res = null;
    private JLabel jLabel1;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JScrollPane jScrollPane1;
    private JTable jTable1;

    public Almost_Finish() {
        this.initComponents();
        this.con = Connect.connect();
        this.show_List();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jPanel2 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jPanel3 = new JPanel();
        this.jScrollPane1 = new JScrollPane();
        this.jTable1 = new JTable();
        this.setDefaultCloseOperation(2);
        this.setTitle("Almost_Finshed Drugs");
        this.setResizable(false);
        this.jPanel1.setBackground(new Color(51, 51, 51));
        this.jPanel2.setBackground(new Color(102, 102, 102));
        this.jLabel1.setFont(new Font("Tahoma", 1, 24));
        this.jLabel1.setText("Almost_Finshed Drugs");
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(203, 203, 203).addComponent(this.jLabel1).addContainerGap(-1, 32767)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(21, 21, 21).addComponent(this.jLabel1).addContainerGap(25, 32767)));
        this.jPanel3.setBackground(new Color(51, 51, 51));
        this.jPanel3.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(255, 255, 255)));
        this.jTable1.setModel(new DefaultTableModel(new Object[][]{new Object[6], new Object[6], new Object[6], new Object[6]}, new String[]{"      Barcode", "      Name", "      Type", "      Company", "      Price", "Remaining_Quantity"}) {
            boolean[] canEdit = new boolean[6];

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return this.canEdit[columnIndex];
            }
        });
        this.jScrollPane1.setViewportView(this.jTable1);
        GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
        this.jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane1, -1, 637, 32767).addContainerGap()));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane1, -2, 284, -2).addContainerGap()));
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel2, -1, -1, 32767).addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel3, -1, -1, 32767).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jPanel2, -2, -1, -2).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.jPanel3, -2, -1, -2).addGap(0, 9, 32767)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
        this.setSize(new Dimension(695, 442));
        this.setLocationRelativeTo((Component)null);
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
            Logger.getLogger(Almost_Finish.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(Almost_Finish.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(Almost_Finish.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(Almost_Finish.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new Almost_Finish()).setVisible(true);
            }
        });
    }

    private void show_List() {
        String sql = "select BARCODE,NAME,TYPE,COMPANY_NAME,SELLING_PRICE,QUANTITY from drugs where QUANTITY < 10 ";

        try {
            this.pre = this.con.prepareStatement(sql);
            this.res = this.pre.executeQuery();
            this.jTable1.setModel(DbUtils.resultSetToTableModel(this.res));
        } catch (Exception var3) {
            JOptionPane.showMessageDialog((Component)null, var3.getMessage(), "Error", 2);
        }

    }
}
