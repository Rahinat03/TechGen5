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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.Border;

public class Drug extends JFrame {
    Connection con = null;
    PreparedStatement pre = null;
    ResultSet res = null;
    public JButton adddrug;
    public JTextField barcode;
    public JTextField code;
    public JComboBox<String> company_name;
    public JTextField cost_price;
    public JButton deletedrug;
    public JTextField dose;
    private JButton druglist;
    public JComboBox<String> exp_day;
    public JComboBox<String> exp_month;
    public JComboBox<String> exp_year;
    private JButton jButton5;
    private JButton jButton6;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JSeparator jSeparator1;
    public JTextField name;
    public JComboBox<String> place;
    public JComboBox<String> pro_day;
    public JComboBox<String> pro_month;
    public JComboBox<String> pro_year;
    public JComboBox<String> quantity;
    public JComboBox<String> section;
    public JTextField selling_price;
    public JComboBox<String> type;
    public JButton updatedrug;

    public Drug() {
        this.initComponents();
        this.con = Connect.connect();
        this.company();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jPanel2 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jPanel3 = new JPanel();
        this.jLabel3 = new JLabel();
        this.jLabel2 = new JLabel();
        this.jLabel11 = new JLabel();
        this.jLabel6 = new JLabel();
        this.jLabel7 = new JLabel();
        this.jLabel4 = new JLabel();
        this.jLabel10 = new JLabel();
        this.jLabel14 = new JLabel();
        this.jLabel9 = new JLabel();
        this.jLabel5 = new JLabel();
        this.name = new JTextField();
        this.dose = new JTextField();
        this.code = new JTextField();
        this.cost_price = new JTextField();
        this.selling_price = new JTextField();
        this.company_name = new JComboBox();
        this.pro_day = new JComboBox();
        this.pro_month = new JComboBox();
        this.pro_year = new JComboBox();
        this.exp_day = new JComboBox();
        this.exp_month = new JComboBox();
        this.exp_year = new JComboBox();
        this.section = new JComboBox();
        this.place = new JComboBox();
        this.type = new JComboBox();
        this.jLabel15 = new JLabel();
        this.quantity = new JComboBox();
        this.jLabel8 = new JLabel();
        this.barcode = new JTextField();
        this.jPanel4 = new JPanel();
        this.updatedrug = new JButton();
        this.druglist = new JButton();
        this.jButton5 = new JButton();
        this.deletedrug = new JButton();
        this.adddrug = new JButton();
        this.jButton6 = new JButton();
        this.jSeparator1 = new JSeparator();
        this.setDefaultCloseOperation(2);
        this.setTitle("Drug Form");
        this.setResizable(false);
        this.jPanel1.setBackground(new Color(51, 51, 51));
        this.jPanel2.setBackground(new Color(102, 102, 102));
        this.jLabel1.setFont(new Font("Tahoma", 1, 24));
        this.jLabel1.setText("Drug Form");
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jLabel1).addGap(336, 336, 336)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(22, 22, 22).addComponent(this.jLabel1).addContainerGap(29, 32767)));
        this.jPanel3.setBackground(new Color(51, 51, 51));
        this.jPanel3.setBorder(BorderFactory.createTitledBorder((Border)null, "Drug Information", 0, 0, new Font("Tahoma", 1, 12)));
        this.jLabel3.setFont(new Font("Tahoma", 1, 11));
        this.jLabel3.setText("Drug_Type : ");
        this.jLabel2.setFont(new Font("Tahoma", 1, 11));
        this.jLabel2.setText("Drug_Name : ");
        this.jLabel11.setFont(new Font("Tahoma", 1, 11));
        this.jLabel11.setText("Expiration_Date : ");
        this.jLabel6.setFont(new Font("Tahoma", 1, 11));
        this.jLabel6.setText("Drug_Cost_Price : ");
        this.jLabel7.setFont(new Font("Tahoma", 1, 11));
        this.jLabel7.setText("Drug_Selling_Price : ");
        this.jLabel4.setFont(new Font("Tahoma", 1, 11));
        this.jLabel4.setText("Drug_Dose : ");
        this.jLabel10.setFont(new Font("Tahoma", 1, 11));
        this.jLabel10.setText("Production_Date : ");
        this.jLabel14.setFont(new Font("Tahoma", 1, 11));
        this.jLabel14.setText("Drug_Place : ");
        this.jLabel9.setFont(new Font("Tahoma", 1, 11));
        this.jLabel9.setText("Company_Name : ");
        this.jLabel5.setFont(new Font("Tahoma", 1, 11));
        this.jLabel5.setText("Drug_Code : ");
        this.company_name.setModel(new DefaultComboBoxModel(new String[]{"Company_Name : "}));
        this.pro_day.setModel(new DefaultComboBoxModel(new String[]{"Day : ", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
        this.pro_month.setModel(new DefaultComboBoxModel(new String[]{"Month : ", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
        this.pro_year.setModel(new DefaultComboBoxModel(new String[]{"Year : ", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040"}));
        this.exp_day.setModel(new DefaultComboBoxModel(new String[]{"Day : ", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
        this.exp_month.setModel(new DefaultComboBoxModel(new String[]{"Month : ", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
        this.exp_year.setModel(new DefaultComboBoxModel(new String[]{"Year : ", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040"}));
        this.section.setModel(new DefaultComboBoxModel(new String[]{"Section : ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"}));
        this.place.setModel(new DefaultComboBoxModel(new String[]{"Place : ", "Up", "Down", "Right", "Left"}));
        this.type.setModel(new DefaultComboBoxModel(new String[]{"Drug_Type : ", "Pills", "Injection", "Syrup", "Drink"}));
        this.jLabel15.setFont(new Font("Tahoma", 1, 11));
        this.jLabel15.setText("Drug_Quantity : ");
        this.quantity.setModel(new DefaultComboBoxModel(new String[]{"Quantity : ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40"}));
        this.jLabel8.setFont(new Font("Tahoma", 1, 11));
        this.jLabel8.setText("Drug_Barcode  : ");
        GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
        this.jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel3Layout.createSequentialGroup().addGap(0, 0, 32767).addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel6).addComponent(this.jLabel7).addComponent(this.jLabel5)).addGap(204, 204, 204)).addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING).addComponent(this.code, -2, 144, -2).addComponent(this.cost_price, -2, 144, -2).addComponent(this.selling_price, -2, 144, -2).addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel2).addComponent(this.jLabel3).addComponent(this.jLabel8)).addGap(42, 42, 42)).addGroup(jPanel3Layout.createSequentialGroup().addComponent(this.jLabel4).addGap(63, 63, 63))).addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addComponent(this.dose, -2, 144, -2).addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.type, 0, -1, 32767).addComponent(this.name, -1, 144, 32767).addComponent(this.barcode))))).addPreferredGap(ComponentPlacement.RELATED, -1, 32767))).addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel14).addComponent(this.jLabel10).addComponent(this.jLabel11).addComponent(this.jLabel9, -2, 104, -2).addComponent(this.jLabel15)).addGap(31, 31, 31).addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addComponent(this.quantity, -2, -1, -2).addGroup(jPanel3Layout.createSequentialGroup().addComponent(this.pro_day, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.pro_month, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.pro_year, -2, -1, -2)).addGroup(jPanel3Layout.createSequentialGroup().addComponent(this.exp_day, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.exp_month, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.exp_year, -2, -1, -2)).addComponent(this.company_name, -2, 188, -2).addGroup(jPanel3Layout.createSequentialGroup().addComponent(this.section, -2, -1, -2).addGap(18, 18, 18).addComponent(this.place, -2, 66, -2))).addContainerGap(125, 32767)));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel9).addComponent(this.company_name, -2, -1, -2)).addGap(39, 39, 39).addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel10).addComponent(this.pro_day, -2, -1, -2).addComponent(this.pro_month, -2, -1, -2).addComponent(this.pro_year, -2, -1, -2)).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING).addGroup(jPanel3Layout.createSequentialGroup().addComponent(this.jLabel8).addGap(23, 23, 23).addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel4).addComponent(this.dose, -2, -1, -2))).addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.exp_day, -2, -1, -2).addComponent(this.exp_month, -2, -1, -2).addComponent(this.exp_year, -2, -1, -2)).addComponent(this.jLabel11)))).addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel2).addComponent(this.name, -2, -1, -2)).addGap(20, 20, 20).addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel3).addComponent(this.type, -2, -1, -2)).addGap(18, 18, 18).addComponent(this.barcode, -2, -1, -2))).addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGap(20, 20, 20).addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel5).addComponent(this.code, -2, -1, -2)).addGap(17, 17, 17)).addGroup(Alignment.TRAILING, jPanel3Layout.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel14).addComponent(this.section, -2, -1, -2).addComponent(this.place, -2, -1, -2)).addGap(6, 6, 6))).addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel6).addComponent(this.cost_price, -2, -1, -2)).addGap(35, 35, 35).addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel15).addComponent(this.quantity, -2, -1, -2)).addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel7).addComponent(this.selling_price, -2, -1, -2))).addContainerGap(34, 32767)));
        this.jPanel4.setBackground(new Color(51, 51, 51));
        this.jPanel4.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(255, 255, 255)));
        this.updatedrug.setFont(new Font("Tahoma", 1, 11));
        this.updatedrug.setText("Update_Drug");
        this.updatedrug.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Drug.this.updatedrugActionPerformed(evt);
            }
        });
        this.druglist.setFont(new Font("Tahoma", 1, 11));
        this.druglist.setText("Drugs_List");
        this.druglist.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Drug.this.druglistActionPerformed(evt);
            }
        });
        this.jButton5.setFont(new Font("Tahoma", 1, 11));
        this.jButton5.setText("Cancel");
        this.jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Drug.this.jButton5ActionPerformed(evt);
            }
        });
        this.deletedrug.setFont(new Font("Tahoma", 1, 11));
        this.deletedrug.setText("Delete_Drug");
        this.deletedrug.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Drug.this.deletedrugActionPerformed(evt);
            }
        });
        this.adddrug.setFont(new Font("Tahoma", 1, 11));
        this.adddrug.setText("Add_Drug");
        this.adddrug.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Drug.this.adddrugActionPerformed(evt);
            }
        });
        this.jButton6.setFont(new Font("Tahoma", 1, 11));
        this.jButton6.setText("Clear");
        this.jButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Drug.this.jButton6ActionPerformed(evt);
            }
        });
        GroupLayout jPanel4Layout = new GroupLayout(this.jPanel4);
        this.jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addComponent(this.adddrug, -2, 97, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.updatedrug).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.deletedrug).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.druglist).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.jButton6, -2, 85, -2).addGap(18, 18, 18).addComponent(this.jButton5, -2, 83, -2).addContainerGap(-1, 32767)));
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.adddrug).addComponent(this.updatedrug).addComponent(this.deletedrug).addComponent(this.druglist).addComponent(this.jButton5).addComponent(this.jButton6)).addContainerGap()));
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel2, -1, -1, 32767).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel3, -1, -1, 32767).addComponent(this.jPanel4, -1, -1, 32767).addComponent(this.jSeparator1)).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jPanel2, -2, -1, -2).addGap(18, 18, 18).addComponent(this.jPanel3, -2, -1, -2).addGap(5, 5, 5).addComponent(this.jSeparator1, -2, 10, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jPanel4, -2, -1, -2).addContainerGap(-1, 32767)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
        this.setSize(new Dimension(825, 539));
        this.setLocationRelativeTo((Component)null);
    }

    private void jButton5ActionPerformed(ActionEvent evt) {
        this.dispose();
    }

    private void adddrugActionPerformed(ActionEvent evt) {
        if (this.quantity.getSelectedIndex() != 0 && !this.barcode.getText().equals("") && !this.name.getText().equals("") && this.type.getSelectedIndex() != 0 && !this.dose.getText().equals("") && !this.code.getText().equals("") && !this.cost_price.getText().equals("") && !this.selling_price.getText().equals("") && this.company_name.getSelectedIndex() != 0 && this.pro_day.getSelectedIndex() != 0 && this.pro_month.getSelectedIndex() != 0 && this.pro_year.getSelectedIndex() != 0 && this.exp_day.getSelectedIndex() != 0 && this.exp_month.getSelectedIndex() != 0 && this.exp_year.getSelectedIndex() != 0 && this.section.getSelectedIndex() != 0 && this.place.getSelectedIndex() != 0) {
            if (Integer.parseInt(this.pro_year.getSelectedItem().toString()) > Integer.parseInt(this.exp_year.getSelectedItem().toString())) {
                JOptionPane.showMessageDialog((Component)null, "Check Production and Expiration Date", "Wrong Information", 2);
            } else if (Integer.parseInt(this.pro_year.getSelectedItem().toString()) == Integer.parseInt(this.exp_year.getSelectedItem().toString())) {
                if (Integer.parseInt(this.pro_month.getSelectedItem().toString()) >= Integer.parseInt(this.exp_month.getSelectedItem().toString())) {
                    JOptionPane.showMessageDialog((Component)null, "Check Production and Expiration Date", "Wrong Information", 2);
                }
            } else if (!this.checkdrug_name()) {
                String sql = "insert into drugs (NAME,TYPE,BARCODE,DOSE,CODE,COST_PRICE,SELLING_PRICE,EXPIRY,COMPANY_NAME,PRODUCTION_DATE,EXPIRATION_DATE,PLACE,QUANTITY) values ('" + this.name.getText() + "' , '" + this.type.getSelectedItem() + "' ,'" + this.barcode.getText() + "' ,'" + this.dose.getText() + "' ,'" + this.code.getText() + "' ,'" + this.cost_price.getText() + "' ,'" + this.selling_price.getText() + "' ,'Available for use' ,'" + this.company_name.getSelectedItem() + "' ,'" + this.pro_year.getSelectedItem() + "-" + this.pro_month.getSelectedItem() + "-" + this.pro_day.getSelectedItem() + "' ,'" + this.exp_year.getSelectedItem() + "-" + this.exp_month.getSelectedItem() + "-" + this.exp_day.getSelectedItem() + "' ,'" + this.section.getSelectedItem() + "-" + this.place.getSelectedItem() + "','" + this.quantity.getSelectedItem() + "' )";
                int suring = JOptionPane.showConfirmDialog((Component)null, "Are You Sure From this Information\n\nName : " + this.name.getText() + "\nProduction_Date : " + this.pro_day.getSelectedItem() + "-" + this.pro_month.getSelectedItem() + "-" + this.pro_year.getSelectedItem() + "\nExpiration_Date : " + this.exp_day.getSelectedItem() + "-" + this.exp_month.getSelectedItem() + "-" + this.exp_year.getSelectedItem());
                if (suring == 0) {
                    try {
                        this.pre = this.con.prepareStatement(sql);
                        this.pre.execute();
                        JOptionPane.showMessageDialog((Component)null, "Drug has been Added Successfully", "Success Operation", 1);
                    } catch (Exception var5) {
                        JOptionPane.showMessageDialog((Component)null, var5.getMessage(), "Error", 2);
                    }

                    this.clear();
                }
            } else {
                JOptionPane.showMessageDialog((Component)null, "This Drug is already inserted", "Failed Operation", 2);
            }
        } else {
            JOptionPane.showMessageDialog((Component)null, "Complete Drug Information", "Missing Information", 2);
        }

    }

    private void deletedrugActionPerformed(ActionEvent evt) {
        if (this.barcode.getText().equals("")) {
            JOptionPane.showMessageDialog((Component)null, "Enter Drug_Name You want to delete", "Missing Information", 2);
        } else if (this.checkdrug_name()) {
            String sql = "delete from drugs where BARCODE='" + this.barcode.getText() + "' ";
            int suring = JOptionPane.showConfirmDialog((Component)null, "Are You Sure From this Request");
            if (suring == 0) {
                try {
                    this.pre = this.con.prepareStatement(sql);
                    this.pre.execute();
                    JOptionPane.showMessageDialog((Component)null, "Drug has been deleted Successfully", "Success Operation", 1);
                } catch (Exception var5) {
                    JOptionPane.showMessageDialog((Component)null, var5.getMessage(), "Error", 2);
                }

                this.clear();
            }
        } else {
            JOptionPane.showMessageDialog((Component)null, "This Drug is not inserted", "Failed Operation", 2);
        }

    }

    private void updatedrugActionPerformed(ActionEvent evt) {
        if (this.quantity.getSelectedIndex() != 0 && !this.barcode.getText().equals("") && !this.name.getText().equals("") && this.type.getSelectedIndex() != 0 && !this.dose.getText().equals("") && !this.code.getText().equals("") && !this.cost_price.getText().equals("") && !this.selling_price.getText().equals("") && this.company_name.getSelectedIndex() != 0 && this.pro_day.getSelectedIndex() != 0 && this.pro_month.getSelectedIndex() != 0 && this.pro_year.getSelectedIndex() != 0 && this.exp_day.getSelectedIndex() != 0 && this.exp_month.getSelectedIndex() != 0 && this.exp_year.getSelectedIndex() != 0 && this.section.getSelectedIndex() != 0 && this.place.getSelectedIndex() != 0) {
            String sql = "update drugs set NAME='" + this.name.getText() + "' , TYPE='" + this.type.getSelectedItem() + "',DOSE='" + this.dose.getText() + "' ,CODE='" + this.code.getText() + "' , COST_PRICE='" + this.cost_price.getText() + "' ,quantity='" + this.quantity.getSelectedItem() + "',SELLING_PRICE='" + this.selling_price.getText() + "', COMPANY_NAME='" + this.company_name.getSelectedItem() + "',PLACE='" + this.section.getSelectedItem() + "-" + this.place.getSelectedItem() + "' where BARCODE='" + this.barcode.getText() + "' ";

            try {
                this.pre = this.con.prepareStatement(sql);
                this.pre.execute();
                JOptionPane.showMessageDialog((Component)null, "Drug has been Updated Successfully", "Success Operation", 1);
            } catch (Exception var4) {
                JOptionPane.showMessageDialog((Component)null, var4.getMessage(), "Error", 2);
            }

            this.clear();
        } else {
            JOptionPane.showMessageDialog((Component)null, "Complete Drug Information", "Missing Information", 2);
        }

    }

    private void jButton6ActionPerformed(ActionEvent evt) {
        this.clear();
    }

    private void druglistActionPerformed(ActionEvent evt) {
        (new Drug_List()).setVisible(true);
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
            Logger.getLogger(Drug.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(Drug.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(Drug.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(Drug.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new Drug()).setVisible(true);
            }
        });
    }

    private boolean checkdrug_name() {
        boolean found = false;
        String sql = "select BARCODE from drugs where BARCODE='" + this.barcode.getText() + "' ";

        try {
            this.pre = this.con.prepareStatement(sql);
            this.res = this.pre.executeQuery();
            if (this.res.next()) {
                found = true;
            }
        } catch (Exception var4) {
            JOptionPane.showMessageDialog((Component)null, var4.getMessage(), "Error", 2);
        }

        return found;
    }

    private void company() {
        String sql = "select NAME from company";

        try {
            this.pre = this.con.prepareStatement(sql);
            this.res = this.pre.executeQuery();

            while(this.res.next()) {
                this.company_name.addItem(this.res.getString("NAME"));
            }
        } catch (Exception var3) {
            JOptionPane.showMessageDialog((Component)null, var3.getMessage(), "Error", 2);
        }

    }

    private void clear() {
        this.name.setText("");
        this.dose.setText("");
        this.code.setText("");
        this.cost_price.setText("");
        this.selling_price.setText("");
        this.type.setSelectedIndex(0);
        this.section.setSelectedIndex(0);
        this.place.setSelectedIndex(0);
        this.pro_day.setSelectedIndex(0);
        this.pro_month.setSelectedIndex(0);
        this.pro_year.setSelectedIndex(0);
        this.exp_day.setSelectedIndex(0);
        this.exp_month.setSelectedIndex(0);
        this.exp_year.setSelectedIndex(0);
        this.quantity.setSelectedIndex(0);
        this.barcode.setText("");
        this.company_name.setSelectedIndex(0);
    }
}
