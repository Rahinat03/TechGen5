package com.example.pharmacymanangementsystem;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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

public class Buy_Drug extends JFrame {
    Connection con = null;
    PreparedStatement pre = null;
    ResultSet res = null;
    private JTextField amount;
    private JTextField barcode;
    public JComboBox<String> company_name;
    private JTextField cost_price;
    private JButton jButton2;
    private JButton jButton3;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JSeparator jSeparator1;
    public JButton makedeal;
    private JTextField name;
    public JComboBox<String> quantity;
    public JComboBox<String> type;
    public JButton update;
    public JButton update1;

    public Buy_Drug() {
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
        this.amount = new JTextField();
        this.jLabel2 = new JLabel();
        this.type = new JComboBox();
        this.jLabel5 = new JLabel();
        this.company_name = new JComboBox();
        this.jLabel6 = new JLabel();
        this.barcode = new JTextField();
        this.jLabel4 = new JLabel();
        this.jLabel7 = new JLabel();
        this.quantity = new JComboBox();
        this.name = new JTextField();
        this.jLabel9 = new JLabel();
        this.cost_price = new JTextField();
        this.jSeparator1 = new JSeparator();
        this.jPanel4 = new JPanel();
        this.makedeal = new JButton();
        this.jButton2 = new JButton();
        this.update = new JButton();
        this.jButton3 = new JButton();
        this.update1 = new JButton();
        this.setDefaultCloseOperation(2);
        this.setTitle("Buy_Drug");
        this.setResizable(false);
        this.jPanel1.setBackground(new Color(51, 51, 51));
        this.jPanel2.setBackground(new Color(102, 102, 102));
        this.jLabel1.setFont(new Font("Tahoma", 1, 24));
        this.jLabel1.setText("Buy_Drug Form");
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(262, 262, 262).addComponent(this.jLabel1).addContainerGap(-1, 32767)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(20, 20, 20).addComponent(this.jLabel1).addContainerGap(23, 32767)));
        this.jPanel3.setBackground(new Color(51, 51, 51));
        this.jPanel3.setBorder(BorderFactory.createTitledBorder((Border)null, "Buy Drugs", 0, 0, new Font("Tahoma", 1, 12), new Color(255, 255, 255)));
        this.jLabel3.setFont(new Font("Tahoma", 1, 12));
        this.jLabel3.setText("Drug_Name : ");
        this.jLabel2.setFont(new Font("Tahoma", 1, 12));
        this.jLabel2.setText("Drug_Barcode : ");
        this.type.setModel(new DefaultComboBoxModel(new String[]{"Drug_Type : ", "Bills", "Injection", "Drink", "Fizzing"}));
        this.jLabel5.setFont(new Font("Tahoma", 1, 12));
        this.jLabel5.setText("Company_Name : ");
        this.company_name.setModel(new DefaultComboBoxModel(new String[]{"Company_Name : "}));
        this.jLabel6.setFont(new Font("Tahoma", 1, 12));
        this.jLabel6.setText("Quantity : ");
        this.barcode.setToolTipText("Enter Barcode and Press Enter for Updating");
        this.barcode.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                Buy_Drug.this.barcodeKeyPressed(evt);
            }
        });
        this.jLabel4.setFont(new Font("Tahoma", 1, 12));
        this.jLabel4.setText("Drug_Type : ");
        this.jLabel7.setFont(new Font("Tahoma", 1, 12));
        this.jLabel7.setText("Cost_Price : ");
        this.quantity.setModel(new DefaultComboBoxModel(new String[]{"Quantity : ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40"}));
        this.jLabel9.setFont(new Font("Tahoma", 1, 12));
        this.jLabel9.setText("Amount : ");
        GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
        this.jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel2).addComponent(this.jLabel3).addComponent(this.jLabel4).addComponent(this.jLabel5)).addGap(50, 50, 50).addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.name).addComponent(this.barcode).addComponent(this.type, 0, -1, 32767).addComponent(this.company_name, -2, 156, -2)).addGap(18, 18, 18).addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel6).addComponent(this.jLabel7).addComponent(this.jLabel9)).addGap(62, 62, 62).addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.cost_price).addComponent(this.quantity, 0, -1, 32767).addComponent(this.amount, -2, 156, -2)).addContainerGap(43, 32767)));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel2).addComponent(this.barcode, -2, -1, -2)).addGap(21, 21, 21).addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel3).addComponent(this.name, -2, -1, -2)).addGap(26, 26, 26).addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel9).addComponent(this.amount, -2, -1, -2)).addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel4).addComponent(this.type, -2, -1, -2))).addGap(23, 23, 23).addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel5).addComponent(this.company_name, -2, -1, -2))).addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel6).addComponent(this.quantity, -2, -1, -2)).addGap(24, 24, 24).addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel7).addComponent(this.cost_price, -2, -1, -2)))).addContainerGap()));
        this.jPanel4.setBackground(new Color(51, 51, 51));
        this.jPanel4.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(255, 255, 255)));
        this.makedeal.setFont(new Font("Tahoma", 1, 12));
        this.makedeal.setText("Make a Deal");
        this.makedeal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Buy_Drug.this.makedealActionPerformed(evt);
            }
        });
        this.jButton2.setFont(new Font("Tahoma", 1, 12));
        this.jButton2.setText("Cancel");
        this.jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Buy_Drug.this.jButton2ActionPerformed(evt);
            }
        });
        this.update.setFont(new Font("Tahoma", 1, 12));
        this.update.setText("Update");
        this.update.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Buy_Drug.this.updateActionPerformed(evt);
            }
        });
        this.jButton3.setFont(new Font("Tahoma", 1, 12));
        this.jButton3.setText("Clear");
        this.jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Buy_Drug.this.jButton3ActionPerformed(evt);
            }
        });
        this.update1.setFont(new Font("Tahoma", 1, 12));
        this.update1.setText("Delete");
        this.update1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Buy_Drug.this.update1ActionPerformed(evt);
            }
        });
        GroupLayout jPanel4Layout = new GroupLayout(this.jPanel4);
        this.jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel4Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.makedeal, -2, 115, -2).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.update, -2, 115, -2).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.update1, -2, 111, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jButton3, -2, 94, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jButton2, -2, 94, -2).addContainerGap()));
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel4Layout.createSequentialGroup().addContainerGap(-1, 32767).addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.makedeal).addComponent(this.jButton2).addComponent(this.update).addComponent(this.jButton3).addComponent(this.update1)).addContainerGap()));
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel2, -1, -1, 32767).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel3, -1, -1, 32767).addComponent(this.jSeparator1).addComponent(this.jPanel4, -1, -1, 32767)).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jPanel2, -2, -1, -2).addGap(27, 27, 27).addComponent(this.jPanel3, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jSeparator1, -2, -1, -2).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.jPanel4, -2, -1, -2).addContainerGap(-1, 32767)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
        this.setSize(new Dimension(730, 411));
        this.setLocationRelativeTo((Component)null);
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        this.dispose();
    }

    private void makedealActionPerformed(ActionEvent evt) {
        if (!this.barcode.getText().equals("") && !this.cost_price.getText().equals("") && !this.amount.getText().equals("") && !this.name.getText().equals("") && this.quantity.getSelectedIndex() != 0 && this.company_name.getSelectedIndex() != 0 && this.type.getSelectedIndex() != 0) {
            if (this.check()) {
                JOptionPane.showMessageDialog((Component)null, "This Drugs has been inserted before", "Failed Operation", 2);
            } else {
                String sql = "insert into purchase (BARCODE,NAME,TYPE,COMPANY_NAME,QUANTITY,PRICE,AMOUNT) values ('" + this.barcode.getText() + "' ,'" + this.name.getText() + "' ,'" + this.type.getSelectedItem() + "' ,'" + this.company_name.getSelectedItem() + "' ,'" + this.quantity.getSelectedItem() + "' ,'" + this.cost_price.getText() + "' ,'" + this.amount.getText() + "' )";

                try {
                    this.pre = this.con.prepareStatement(sql);
                    this.pre.execute();
                    int confirm = JOptionPane.showConfirmDialog((Component)null, "Deal has been made\n\nAdd This Drug ?", "Success Operation", 1);
                    if (confirm == 0) {
                        this.dispose();
                        Drug d = new Drug();
                        d.setVisible(true);
                        d.barcode.setText(this.barcode.getText());
                        d.name.setText(this.name.getText());
                        d.type.setSelectedItem(this.type.getSelectedItem());
                        d.company_name.setSelectedItem(this.company_name.getSelectedItem());
                        d.quantity.setSelectedItem(this.quantity.getSelectedItem());
                        d.cost_price.setText(this.cost_price.getText());
                    }
                } catch (Exception var5) {
                    JOptionPane.showMessageDialog((Component)null, var5.getMessage(), "Error", 2);
                }
            }
        } else {
            JOptionPane.showMessageDialog((Component)null, "Complete Your Information", "Error", 2);
        }

    }

    private void updateActionPerformed(ActionEvent evt) {
        if (!this.barcode.getText().equals("") && !this.cost_price.getText().equals("") && !this.amount.getText().equals("") && !this.name.getText().equals("") && this.quantity.getSelectedIndex() != 0 && this.company_name.getSelectedIndex() != 0 && this.type.getSelectedIndex() != 0) {
            String sql = "update purchase set NAME='" + this.name.getText() + "', TYPE='" + this.type.getSelectedItem() + "' , COMPANY_NAME='" + this.company_name.getSelectedItem() + "' ,QUANTITY='" + this.quantity.getSelectedItem() + "' ,PRICE='" + this.cost_price.getText() + "',AMOUNT='" + this.amount.getText() + "' ";

            try {
                this.pre = this.con.prepareStatement(sql);
                this.pre.execute();
                JOptionPane.showMessageDialog((Component)null, "Deal has been updated Successfully", "Success Operation", 1);
                this.clear();
            } catch (Exception var4) {
                JOptionPane.showMessageDialog((Component)null, var4.getMessage(), "Error", 2);
            }
        } else {
            JOptionPane.showMessageDialog((Component)null, "Complete Your Information", "Error", 2);
        }

    }

    private void barcodeKeyPressed(KeyEvent evt) {
        if (evt.getKeyCode() == 10) {
            String sql = "select * from purchase where BARCODE='" + this.barcode.getText() + "' ";

            try {
                this.pre = this.con.prepareStatement(sql);
                this.res = this.pre.executeQuery();
                if (this.res.next()) {
                    String Name = this.res.getString("NAME");
                    this.name.setText(Name);
                    String Type = this.res.getString("TYPE");
                    this.type.setSelectedItem(Type);
                    String C_name = this.res.getString("COMPANY_NAME");
                    this.company_name.setSelectedItem(C_name);
                    String Price = this.res.getString("PRICE");
                    this.cost_price.setText(Price);
                    String Quantity = this.res.getString("QUANTITY");
                    this.quantity.setSelectedItem(Quantity);
                    String Amount = this.res.getString("AMOUNT");
                    this.amount.setText(Amount);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "This Drug did not Exist before", "Error", 2);
                }
            } catch (Exception var9) {
                JOptionPane.showMessageDialog((Component)null, var9.getMessage(), "Error", 2);
            }
        }

    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        this.clear();
    }

    private void update1ActionPerformed(ActionEvent evt) {
        if (this.barcode.getText().equals("")) {
            JOptionPane.showMessageDialog((Component)null, "Complete Your Information");
        } else {
            String sql = "delete from purchase where BARCODE='" + this.barcode.getText() + "' ";
            int delete = JOptionPane.showConfirmDialog((Component)null, "Confirm your Request");
            if (delete == 0) {
                try {
                    this.pre = this.con.prepareStatement(sql);
                    this.pre.execute();
                    JOptionPane.showMessageDialog((Component)null, "Puchase has been deleted Successfully", "Success Operation", 1);
                    this.clear();
                } catch (Exception var5) {
                    JOptionPane.showMessageDialog((Component)null, var5.getMessage());
                }
            }
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
            Logger.getLogger(Buy_Drug.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(Buy_Drug.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(Buy_Drug.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(Buy_Drug.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new Buy_Drug()).setVisible(true);
            }
        });
    }

    private boolean check() {
        boolean found = false;
        String sql = "select BARCODE from purchase where BARCODE='" + this.barcode.getText() + "' ";

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
        this.barcode.setText("");
        this.cost_price.setText("");
        this.amount.setText("");
        this.name.setText("");
        this.quantity.setSelectedIndex(0);
        this.company_name.setSelectedIndex(0);
        this.type.setSelectedIndex(0);
    }
}
