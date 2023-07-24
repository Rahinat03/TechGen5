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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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

public class Drug_List extends JFrame {
    Connection con = null;
    PreparedStatement pre = null;
    ResultSet res = null;
    String sql1;
    String sql2;
    String sql3;
    private JTable druglist;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JScrollPane jScrollPane1;
    private JComboBox<String> sort_by;

    public Drug_List() {
        this.initComponents();
        this.con = Connect.connect();
        this.drug_list();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jPanel2 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jPanel3 = new JPanel();
        this.jScrollPane1 = new JScrollPane();
        this.druglist = new JTable();
        this.jPanel4 = new JPanel();
        this.sort_by = new JComboBox();
        this.jLabel2 = new JLabel();
        this.setDefaultCloseOperation(2);
        this.setTitle("Drug_List Form");
        this.setResizable(false);
        this.jPanel1.setBackground(new Color(51, 51, 51));
        this.jPanel2.setBackground(new Color(102, 102, 102));
        this.jLabel1.setFont(new Font("Tahoma", 1, 24));
        this.jLabel1.setText("Drug_List");
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addContainerGap(274, 32767).addComponent(this.jLabel1).addGap(273, 273, 273)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(20, 20, 20).addComponent(this.jLabel1).addContainerGap(25, 32767)));
        this.jPanel3.setBackground(new Color(51, 51, 51));
        this.jPanel3.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(255, 255, 255)));
        this.druglist.setFont(new Font("Tahoma", 1, 12));
        this.druglist.setModel(new DefaultTableModel(new Object[][]{new Object[6], new Object[6], new Object[6], new Object[6]}, new String[]{"         Name", "         Type", "         Barcode", "         Price", "         Expiry", "         Company"}) {
            boolean[] canEdit = new boolean[6];

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return this.canEdit[columnIndex];
            }
        });
        this.druglist.getTableHeader().setReorderingAllowed(false);
        this.druglist.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Drug_List.this.druglistMouseClicked(evt);
            }
        });
        this.jScrollPane1.setViewportView(this.druglist);
        GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
        this.jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane1, -1, 621, 32767).addContainerGap()));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane1, -2, 325, -2).addContainerGap(-1, 32767)));
        this.jPanel4.setBackground(new Color(51, 51, 51));
        this.jPanel4.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(255, 255, 255)));
        this.sort_by.setModel(new DefaultComboBoxModel(new String[]{"Sort By : ", "Name", "Type", "Expiration"}));
        this.sort_by.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                Drug_List.this.sort_byItemStateChanged(evt);
            }
        });
        this.jLabel2.setFont(new Font("Tahoma", 1, 12));
        this.jLabel2.setText("Sort By : ");
        GroupLayout jPanel4Layout = new GroupLayout(this.jPanel4);
        this.jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.sort_by, -2, 154, -2).addContainerGap(-1, 32767)));
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel2).addComponent(this.sort_by, -2, -1, -2)).addContainerGap()));
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel2, -1, -1, 32767).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel4, -1, -1, 32767).addComponent(this.jPanel3, -1, -1, 32767)).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jPanel2, -2, -1, -2).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.jPanel4, -2, -1, -2).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.jPanel3, -2, -1, -2).addContainerGap(-1, 32767)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
        this.setSize(new Dimension(679, 539));
        this.setLocationRelativeTo((Component)null);
    }

    private void druglistMouseClicked(MouseEvent evt) {
        int row = this.druglist.getSelectedRow();
        String t = this.druglist.getModel().getValueAt(row, 2).toString();
        String sql = "select * from drugs where BARCODE='" + t + "' ";

        try {
            this.pre = this.con.prepareStatement(sql);
            this.res = this.pre.executeQuery();
            if (this.res.next()) {
                String Name = this.res.getString("NAME");
                Pharmacy.drug.name.setText(Name);
                String Type = this.res.getString("TYPE");
                Pharmacy.drug.type.setSelectedItem(Type);
                String Barcode = this.res.getString("BARCODE");
                Pharmacy.drug.barcode.setText(Barcode);
                String Code = this.res.getString("CODE");
                Pharmacy.drug.code.setText(Code);
                String Dose = this.res.getString("DOSE");
                Pharmacy.drug.dose.setText(Dose);
                String cost_price = this.res.getString("COST_PRICE");
                Pharmacy.drug.cost_price.setText(cost_price);
                String sell_price = this.res.getString("SELLING_PRICE");
                Pharmacy.drug.selling_price.setText(sell_price);
                String company_Name = this.res.getString("COMPANY_NAME");
                Pharmacy.drug.company_name.setSelectedItem(company_Name);
                String Quantity = this.res.getString("QUANTITY");
                Pharmacy.drug.quantity.setSelectedItem(Quantity);
                String Day = this.res.getString("PRODUCTION_DATE").split("-")[0];
                Pharmacy.drug.pro_day.setSelectedItem(Day);
                String Month = this.res.getString("PRODUCTION_DATE").split("-")[1];
                Pharmacy.drug.pro_month.setSelectedItem(Month);
                String Year = this.res.getString("PRODUCTION_DATE").split("-")[2];
                Pharmacy.drug.pro_year.setSelectedItem(Year);
                String ex_Day = this.res.getString("EXPIRATION_DATE").split("-")[0];
                Pharmacy.drug.exp_day.setSelectedItem(ex_Day);
                String ex_Month = this.res.getString("EXPIRATION_DATE").split("-")[1];
                Pharmacy.drug.exp_month.setSelectedItem(ex_Month);
                String ex_Year = this.res.getString("EXPIRATION_DATE").split("-")[2];
                Pharmacy.drug.exp_year.setSelectedItem(ex_Year);
                String sec = this.res.getString("PLACE").split("-")[0];
                Pharmacy.drug.section.setSelectedItem(sec);
                String pla = this.res.getString("PLACE").split("-")[1];
                Pharmacy.drug.place.setSelectedItem(pla);
            }
        } catch (Exception var22) {
            JOptionPane.showMessageDialog((Component)null, var22.getMessage(), "Error", 2);
        }

    }

    private void sort_byItemStateChanged(ItemEvent evt) {
        switch (this.sort_by.getSelectedIndex()) {
            case 1:
                this.sql1 = "select NAME , TYPE ,BARCODE,SELLING_PRICE , EXPIRY , COMPANY_NAME from drugs order by NAME";
                this.sort(1);
                break;
            case 2:
                this.sql2 = "select NAME , TYPE ,BARCODE,SELLING_PRICE , EXPIRY , COMPANY_NAME from drugs order by TYPE";
                this.sort(2);
                break;
            case 3:
                this.sql3 = "select NAME , TYPE ,BARCODE,SELLING_PRICE , EXPIRY , COMPANY_NAME from drugs order by EXPIRY DESC";
                this.sort(3);
        }

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
            Logger.getLogger(Drug_List.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(Drug_List.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(Drug_List.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(Drug_List.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new Drug_List()).setVisible(true);
            }
        });
    }

    private void drug_list() {
        String sql = "select NAME , TYPE ,BARCODE,SELLING_PRICE , EXPIRY , COMPANY_NAME from drugs";

        try {
            this.pre = this.con.prepareStatement(sql);
            this.res = this.pre.executeQuery();
            this.druglist.setModel(DbUtils.resultSetToTableModel(this.res));
        } catch (Exception var3) {
            JOptionPane.showMessageDialog((Component)null, var3.getMessage(), "Error", 2);
        }

    }

    private void sort(int index) {
        try {
            switch (index) {
                case 1:
                    this.pre = this.con.prepareStatement(this.sql1);
                    this.res = this.pre.executeQuery();
                    this.druglist.setModel(DbUtils.resultSetToTableModel(this.res));
                    break;
                case 2:
                    this.pre = this.con.prepareStatement(this.sql2);
                    this.res = this.pre.executeQuery();
                    this.druglist.setModel(DbUtils.resultSetToTableModel(this.res));
                    break;
                case 3:
                    this.pre = this.con.prepareStatement(this.sql3);
                    this.res = this.pre.executeQuery();
                    this.druglist.setModel(DbUtils.resultSetToTableModel(this.res));
            }
        } catch (Exception var3) {
            JOptionPane.showMessageDialog((Component)null, var3.getMessage(), "Error", 2);
        }

    }
}
