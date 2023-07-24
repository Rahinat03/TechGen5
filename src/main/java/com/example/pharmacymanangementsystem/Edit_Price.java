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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Edit_Price extends JFrame {
    Connection con = null;
    PreparedStatement pre = null;
    ResultSet res = null;
    private JTextField barcode;
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JScrollPane jScrollPane1;
    private JSeparator jSeparator1;
    private JTable jTable1;
    private JTextField new_price;
    private JTextField old_price;

    public Edit_Price() {
        this.initComponents();
        this.con = Connect.connect();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jPanel2 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jPanel3 = new JPanel();
        this.jScrollPane1 = new JScrollPane();
        this.jTable1 = new JTable();
        this.jLabel6 = new JLabel();
        this.barcode = new JTextField();
        this.jPanel4 = new JPanel();
        this.old_price = new JTextField();
        this.jLabel2 = new JLabel();
        this.jLabel3 = new JLabel();
        this.jButton1 = new JButton();
        this.new_price = new JTextField();
        this.jLabel4 = new JLabel();
        this.jLabel5 = new JLabel();
        this.jSeparator1 = new JSeparator();
        this.setDefaultCloseOperation(2);
        this.setTitle("Edit_Price");
        this.setResizable(false);
        this.jPanel1.setBackground(new Color(51, 51, 51));
        this.jPanel2.setBackground(new Color(102, 102, 102));
        this.jLabel1.setFont(new Font("Tahoma", 1, 24));
        this.jLabel1.setText("Edit_Prices Form");
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(146, 146, 146).addComponent(this.jLabel1).addContainerGap(-1, 32767)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addContainerGap(30, 32767).addComponent(this.jLabel1).addGap(28, 28, 28)));
        this.jPanel3.setBackground(new Color(51, 51, 51));
        this.jPanel3.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(255, 255, 255)));
        this.jTable1.setFont(new Font("Tahoma", 1, 12));
        this.jTable1.setModel(new DefaultTableModel(new Object[][]{new Object[3], new Object[3], new Object[3], new Object[3]}, new String[]{"       Name", "       Barcode", "       Price"}) {
            boolean[] canEdit = new boolean[3];

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return this.canEdit[columnIndex];
            }
        });
        this.jTable1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Edit_Price.this.jTable1MouseClicked(evt);
            }
        });
        this.jScrollPane1.setViewportView(this.jTable1);
        this.jLabel6.setText("Barcode : ");
        this.barcode.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                Edit_Price.this.barcodeKeyReleased(evt);
            }
        });
        GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
        this.jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jScrollPane1, -2, -1, -2).addGroup(jPanel3Layout.createSequentialGroup().addComponent(this.jLabel6).addGap(18, 18, 18).addComponent(this.barcode, -2, 150, -2))).addContainerGap()));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel3Layout.createSequentialGroup().addContainerGap().addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel6).addComponent(this.barcode, -2, -1, -2)).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.jScrollPane1, -2, 59, -2).addContainerGap(-1, 32767)));
        this.jPanel4.setBackground(new Color(51, 51, 51));
        this.jPanel4.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(255, 255, 255)));
        this.old_price.setEditable(false);
        this.jLabel2.setText("Old_Price : ");
        this.jLabel3.setText("New_Price : ");
        this.jButton1.setText("Update");
        this.jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Edit_Price.this.jButton1ActionPerformed(evt);
            }
        });
        this.jLabel4.setText("$");
        this.jLabel5.setText("$");
        GroupLayout jPanel4Layout = new GroupLayout(this.jPanel4);
        this.jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING, false).addGroup(jPanel4Layout.createSequentialGroup().addComponent(this.jLabel2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.old_price, -2, 57, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jLabel5).addPreferredGap(ComponentPlacement.RELATED, -1, 32767).addComponent(this.jLabel3).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.new_price, -2, 57, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jLabel4).addContainerGap()).addGroup(jPanel4Layout.createSequentialGroup().addGap(175, 175, 175).addComponent(this.jButton1, -2, 91, -2).addGap(196, 196, 196)))));
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel2).addComponent(this.jLabel3).addComponent(this.old_price, -2, -1, -2).addComponent(this.new_price, -2, -1, -2).addComponent(this.jLabel4).addComponent(this.jLabel5)).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jButton1, -2, 23, -2).addContainerGap()));
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel2, -1, -1, 32767).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jSeparator1).addComponent(this.jPanel4, -1, -1, 32767).addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGap(0, 0, 32767).addComponent(this.jPanel3, -2, -1, -2))).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jPanel2, -2, -1, -2).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.jPanel3, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jSeparator1, -2, 7, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jPanel4, -2, -1, -2).addContainerGap(189, 32767)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -2, -1, -2));
        this.setSize(new Dimension(510, 365));
        this.setLocationRelativeTo((Component)null);
    }

    private void barcodeKeyReleased(KeyEvent evt) {
        String sql = "select NAME,BARCODE,SELLING_PRICE from drugs where BARCODE REGEXP '" + this.barcode.getText() + "' ";

        try {
            this.pre = this.con.prepareStatement(sql);
            this.res = this.pre.executeQuery();
            if (this.res != null) {
                this.jTable1.setModel(DbUtils.resultSetToTableModel(this.res));
            } else {
                JOptionPane.showMessageDialog((Component)null, "There is no drugs such this barcode", "Not Found", 2);
            }
        } catch (Exception var4) {
            JOptionPane.showMessageDialog((Component)null, var4.getMessage(), "Error", 2);
        }

    }

    private void jTable1MouseClicked(MouseEvent evt) {
        int row = this.jTable1.getSelectedRow();
        String t = this.jTable1.getModel().getValueAt(row, 1).toString();
        String sql = "select BARCODE,SELLING_PRICE from drugs where BARCODE='" + t + "' ";

        try {
            this.pre = this.con.prepareStatement(sql);
            this.res = this.pre.executeQuery();
            if (this.res.next()) {
                String Price = this.res.getString("SELLING_PRICE");
                this.old_price.setText(Price);
                String Barcode = this.res.getString("BARCODE");
                this.barcode.setText(Barcode);
            }
        } catch (Exception var7) {
            JOptionPane.showMessageDialog((Component)null, var7.getMessage(), "Error", 2);
        }

    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        if (this.barcode.getText().equals("") && this.old_price.getText().equals("")) {
            JOptionPane.showMessageDialog((Component)null, "Complete Your Information", "Missing Information", 2);
        } else {
            String sql = "update drugs set SELLING_PRICE='" + this.new_price.getText() + "' where BARCODE='" + this.barcode.getText() + "' ";

            try {
                this.pre = this.con.prepareStatement(sql);
                this.pre.execute();
                JOptionPane.showMessageDialog((Component)null, "Price has been Updated Successfully", "Success Operation", 1);
                this.refresh();
                this.clear();
            } catch (Exception var4) {
                JOptionPane.showMessageDialog((Component)null, var4.getMessage(), "Error", 2);
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
            Logger.getLogger(Edit_Price.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(Edit_Price.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(Edit_Price.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(Edit_Price.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new Edit_Price()).setVisible(true);
            }
        });
    }

    private void clear() {
        this.old_price.setText("");
        this.new_price.setText("");
        this.barcode.setText("");
    }

    private void refresh() {
        String sql = "select NAME,BARCODE,SELLING_PRICE from drugs WHERE BARCODE='" + this.barcode.getText() + "' ";

        try {
            this.pre = this.con.prepareStatement(sql);
            this.res = this.pre.executeQuery();
            this.jTable1.setModel(DbUtils.resultSetToTableModel(this.res));
        } catch (Exception var3) {
            JOptionPane.showMessageDialog((Component)null, var3.getMessage());
        }

    }
}
